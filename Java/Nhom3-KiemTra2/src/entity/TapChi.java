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
public class TapChi extends TaiLieu implements TinhTien{
    private int soPH,thang;

    public TapChi() {
    }

    public TapChi(String ma, String tenNXB,
            int soPH, int thang,  int soBan) {
        super(ma, tenNXB, soBan);
        this.soPH = soPH;
        this.thang = thang;
    }
    
    @Override
    public double getTien() {
        if((thang<=6) && (thang>=1))
            return 20000*0.8;
        else
            return 20000;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }
    public String toString(){
        return getMa()+"\t"+getTenNXB()+"\t"+
               thang+"\t"+soPH+"\t"+getTien()+"\t"+getSoBan();
    }
    public static String getHeader(){
        return "Ma\tTen NXB\t+Thang\t So PH\t Thanh tien\t So ban";
    }
}
