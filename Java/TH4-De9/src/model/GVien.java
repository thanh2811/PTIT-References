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
public class GVien implements Serializable{
    private int ma;
    private String ten,dc,td;
    private static int sma = 100;

    public GVien(int ma, String ten, String dc, String td) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.td = td;
    }

    public GVien() {
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

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        GVien.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,dc,td
        };
    }
}
