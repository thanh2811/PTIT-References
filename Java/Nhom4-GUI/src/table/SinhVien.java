/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SinhVien implements Serializable{
    private int ma;
    private String ten,tp;
    private boolean gt;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten,boolean gt, 
            String tp,  double diem) {
        this.ma = ma;
        this.ten = ten;
        this.tp = tp;
        this.gt = gt;
        this.diem = diem;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    //add bang - add 1 row
    public Object[] toObject(){
        return new Object[]{
           ma,ten,(gt?"Nam":"Nu"),tp,diem
        };
    }
    
}
