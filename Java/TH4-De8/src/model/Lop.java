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
public class Lop implements Serializable {
    private int ma;
    private String ten;
    private int ssv;
    private static int sma = 100;

    public Lop() {
        ma= sma++;
    }

    public Lop(int ma, String ten, int ssv) {
        this.ma = ma;
        this.ten = ten;
        this.ssv = ssv;
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

    public int getSsv() {
        return ssv;
    }

    public void setSsv(int ssv) {
        this.ssv = ssv;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Lop.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,ssv
        };
    }
}
