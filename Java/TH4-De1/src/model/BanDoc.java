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
public class BanDoc {
    private int ma;
    private String hoten,dc,sdt;
    private static int sma = 1000; 

    public BanDoc() {
        ma = sma++;
    }

    public BanDoc(int ma, String hoten, String dc, String sdt) {
        this.ma = ma;
        this.hoten = hoten;
        this.dc = dc;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,hoten,dc,sdt
        };
    }
}
