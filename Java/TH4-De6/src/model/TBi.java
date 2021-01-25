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
public class TBi implements Serializable{
    private int ma;
    private String ten,xx;
    private int nam;
    private static int sma = 10000;

    public TBi() {
        ma = sma++;
    }

    public TBi(int ma, String ten, String xx, int nam) {
        this.ma = ma;
        this.ten = ten;
        this.xx = xx;
        this.nam = nam;
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

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        TBi.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,xx,nam
        };
    }
    
}
