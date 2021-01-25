/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Sach extends TaiLieu implements TinhTien{
    private String tenTG,tenS;
    private int soTrang;

    @Override
    public double getTien() {
        if(soTrang<200)
            return (1200*soTrang)*0.95;
        else
            return (1200*soTrang)*0.85;    
    }
    public Sach(){
        super();
    }

    public Sach(String ma,String tenS,String tenTG,  
              String tenNXB, int soBan,int soTrang) {
        super(ma, tenNXB, soBan);
        this.tenTG = tenTG;
        this.tenS = tenS;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    @Override
    public String toString(){
        return getMa()+"\t"+tenS+"\t"+tenTG+"\t"+
                getTenNXB()+"\t" +getTien()+"\t"+getSoBan()+"\t"+soTrang;
    }
    public static String getHeader(){
        return "Ma\tTenSach\tTen TG\tTen NXB\tTien\t So ban\t so trang";
    }
    
}
