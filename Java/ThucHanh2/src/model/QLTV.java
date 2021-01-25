
package model;
import entity.Bao;
import entity.Sach;
import entity.TaiLieu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTV implements ChucNang{
    
    List<TaiLieu> list = new ArrayList<>();
    Scanner sc;
    int soban;
    String ma,nxb;
    public QLTV() {
        sc = new Scanner(System.in);
        list.add(new Sach("How to pass Java Exam ?", "PVT", 10, "10", "NamDinh", 2));
        list.add(new Sach("How to pass Java Exam 1 ?", "PVT", 10, "10", "NamDinh", 2));
        list.add(new Sach("How to pass Java Exam 2 ?", "PVT", 10, "10", "NamDinh", 2));
    }
    
    public boolean check(String ma){
        for(TaiLieu i : list){
            if(i instanceof Sach){
                if(i.getMa() == ma) return false;
            }
        }
        return true;
    }
    
    public void nhap(){
        System.out.print("Nhap ma sach: ");
         while(true){
            ma = sc.nextLine();
            if(check(ma)){
                break;
            }
            System.out.print("Nhap lại: ");
         }
        System.out.print("Nha xuat ban: ");
         nxb = sc.nextLine();
         System.out.print("So ban: ");
         soban = sc.nextInt();
    }
    
    @Override
    public void nhapSach() {
         //To change body of generated methods, choose Tools | Templates.
         nhap();
         String tenS, tg;
         int sotrang;
         System.out.print("Nhap ten sach: ");
         tenS = sc.nextLine();
         System.out.print("Ten TG: ");
         tg = sc.nextLine();
         System.out.print("So trang: ");
         sotrang = sc.nextInt();
         list.add(new Sach(tenS, tg, sotrang, ma, nxb, soban));
    }

    @Override
    public void nhapBao() {
        nhap();
        String ngay;
        System.out.print("Nhap ngay phat hanh: ");
        while(true){
            ngay = sc.nextLine();
            if(ngay.matches("^d{1,2}\\d{1,2}\\d{4}$")) break;
            System.out.print("Nhap lai: ");
        }
        list.add(new Bao(ngay, ma, nxb, soban));
    }

    @Override
    public void vietTL() {
        for(TaiLieu i : list){
            System.out.println(i.toString());
        }
    }

    @Override
    public void sxtheoNXB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tktheoNam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tongDauSachTG() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
