/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pham Thanh
 */
public class ViTri {
    private int ma;
    private String tenvt;
    private int mucthuong;
    private static int sma = 100;

    public ViTri() {
        ma = sma++;
    }

    public ViTri(int ma, String tenvt, int mucthuong) {
        this.ma = ma;
        this.tenvt = tenvt;
        this.mucthuong = mucthuong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenvt() {
        return tenvt;
    }

    public void setTenvt(String tenvt) {
        this.tenvt = tenvt;
    }

    public int getMucthuong() {
        return mucthuong;
    }

    public void setMucthuong(int mucthuong) {
        this.mucthuong = mucthuong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ViTri.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
          ma,tenvt,mucthuong
        };
    }
}
