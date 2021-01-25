/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Pham Thanh
 */
public class PBan implements Serializable {
    private int ma;
    private String ten,mota;
    private int heso;
    private static int sma=100;

    public PBan() {
        ma = sma ++;
    }

    public PBan(int ma, String ten, String mota, int heso) {
        this.ma = ma;
        this.ten = ten;
        this.mota = mota;
        this.heso = heso;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PBan.sma = sma;
    }
    public Object[] toObject(){
       return new Object[]{
           ma,ten,mota,heso
       };
   }
         
}
