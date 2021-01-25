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
public class Duan implements Serializable{
    private int ma;
    private String ten,kieu;
    private int kp;
    private static int sma = 10000;

    public Duan() {
        ma = sma++;
    }

    public Duan(int ma, String ten, String kieu, int kp) {
        this.ma = ma;
        this.ten = ten;
        this.kieu = kieu;
        this.kp = kp;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getKp() {
        return kp;
    }

    public void setKp(int kp) {
        this.kp = kp;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Duan.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,kieu,kp
        };
    }
}
