/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Pham Thanh
 */
public class Sinhvien {
    int ma;
    String ten;
    double diem;
    boolean gt;

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

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public Sinhvien(int ma, String ten,boolean gt, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        this.gt = gt;
    }
    public Object[] toObject(){
        return new Object[]{
          ma,ten,(gt?"Nam":"Nu"),diem
        };
    }
}
