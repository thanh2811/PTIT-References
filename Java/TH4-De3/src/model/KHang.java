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
public class KHang implements Serializable {
    private int ma;
    private String ten,dc,sdt;
    private static int sma = 10000;
    public KHang(int ma, String ten, String dc, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.sdt = sdt;
    }

    public KHang() {
        ma = sma++;
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

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public Object[] toObject(){
         return new Object[]{
           ma,ten,dc,sdt  
         };
     }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KHang.sma = sma;
    }
}
