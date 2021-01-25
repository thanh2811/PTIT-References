
package model;

import entity.Sach;
import entity.TaiLieu;
import entity.TapChi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;


public class QLTV implements ChucNang{
    private List<TaiLieu> list;
    private Scanner in;
    public QLTV(){
        list=new ArrayList<>();
        in=new Scanner(System.in);
        list.add(new Sach("VV432","Su that",
                "To an an","Giao duc", 123, 34));
        list.add(new Sach("JJ654","Doi tra",
                "Do tuan tu","Giao duc", 34, 89));
        list.add(new Sach("HH543","IT",
                "To Hung","CNTT", 1234,123));
        list.add(new TapChi("Bg543","CNTT",
                3,6,23));
    }
    private boolean getTaiLieuByMa(String ma){
        for(TaiLieu i:list){
            if(i.getMa().equalsIgnoreCase(ma)){
                return true;
            }
        }
        return false;
    }
    private TaiLieu nhap(){
        String ma="",tenXB;
        int soBan;
        while(true){
           System.out.print("Ma:");
           ma=in.nextLine().toUpperCase();
           if(ma.matches("^[A-Z]{2}\\d{3}")&&(!getTaiLieuByMa(ma)))
               break;
           else
               System.err.println("Nhap lai!!!");
        }
        System.out.print("Ten XB:");
        tenXB=in.nextLine();
        System.out.print("So ban:");
        soBan=Integer.parseInt(in.nextLine());
        return new TaiLieu(ma, tenXB, soBan);
        }
    @Override
    public void nhapSach() {
        TaiLieu t=nhap();
        String tenTg,tenS;
        int soTrang;
        System.out.print("Ten Sach:");
        tenS=in.nextLine();
        System.out.print("Ten TG:");
        tenTg=in.nextLine();
        System.out.print("So trang:");
        soTrang=Integer.parseInt(in.nextLine());
        Sach s=new Sach(t.getMa(),tenS, tenTg,
                    t.getTenNXB(), soTrang,t.getSoBan());
        list.add(s);
    }

    @Override
    public void nhapTapChi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vietDS() {
        System.out.println(Sach.getHeader());
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Sach)
                System.out.println(list.get(i).toString());
        }
        System.out.println(TapChi.getHeader());
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof TapChi)
                System.out.println(list.get(i).toString());
        }
    }
    private int getVtriByMa(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }

    @Override
    public void xoa(String ma) {
        int vt=getVtriByMa(ma);
        if(vt==-1)
            System.out.println("khong tim thay!!!");
        else{
            list.remove(vt);
            System.out.println("Xoa thanh cong");
        }
    }

    @Override
    public void sua(String ma) {
        int vt=getVtriByMa(ma);
        if(vt==-1)
            System.out.println("Khong co!!");
        else{
            //lay ra
            Sach s=(Sach)list.get(vt);
            System.out.print("Ten sach:");
            String ten=in.nextLine();
            s.setTenS(ten);
            System.out.print("So trang:");
            int trang=Integer.parseInt(in.nextLine());
            s.setSoTrang(trang);
            System.out.println("Sua thanh cong!!!");
        }
    }

    @Override
    public void tkTheoMa(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().indexOf(ma)>=0)
                System.out.println(list.get(i).toString());
        }
    }

    @Override
    public void tkTheoNXB(String ten) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTenNXB().indexOf(ten)>=0)
                System.out.println(list.get(i).toString());
        }
    }

    @Override
    public void tkTheoGia(double tu, double den) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Sach){
                if((((Sach) list.get(i)).getTien()>=tu)&& (((Sach) list.get(i)).getTien()<=den)){
                    System.out.println(list.get(i).toString());
                }
            }
        }
    }

    @Override
    public void sxTheoMa() {
        Collections.sort(list);
    }

    

    @Override
    public void sxTheoGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void sxTheoNXB() {
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu t1, TaiLieu t2) {
                return t1.getTenNXB().compareToIgnoreCase(t2.getTenNXB());
            }
        }); 
    
    }

    @Override
    public void sxTheoSoBan() {
        Collections.sort(list, new Comparator<TaiLieu>(){
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getSoBan()-o2.getSoBan();
            }
            
        });
    }

    @Override
    public void sxTheoTenNXB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void tkTheoNXB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void count(){
        Map<String,Long> count=list.stream().collect(
                Collectors.groupingBy(TaiLieu::getTenNXB,Collectors.counting()));
        System.out.println(count);
    }
    public void sum(){
        Map<String,Integer> s=list.stream().collect(
        Collectors.groupingBy(TaiLieu::getTenNXB,Collectors.summingInt(TaiLieu::getSoBan)));
        System.out.println(s);
    }
    public void max(){
        Optional<TaiLieu> max =list.stream().collect(Collectors.maxBy(Comparator.comparing(TaiLieu::getSoBan)));
        System.out.println("Tai Lieu with max So ban:"+(max.isPresent()? max.get():"Not Applicable"));
    }
    public void maxGroup(){
        Map<String, TaiLieu> o =          list.stream().collect(Collectors.groupingBy(TaiLieu::getTenNXB,
         Collectors.collectingAndThen(
         Collectors.reducing((TaiLieu t1, TaiLieu t2) ->  t1.getSoBan()> t2.getSoBan()? t1 : t2),  Optional::get)));    
    System.out.println(o);
    }
}
