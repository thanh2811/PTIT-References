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
public class MHoc implements Serializable{    
    private int ma;
    private String ten;
    private int tong, lt,kp;
    private static int sma = 100;
    
//    private S

    public MHoc() {
        ma = sma++;
    }

    public MHoc(int ma, String ten, int tong, int lt, int kp) {
        this.ma = ma;
        this.ten = ten;
        this.tong = tong;
        this.lt = lt;
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

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    public int getLt() {
        return lt;
    }

    public void setLt(int lt) {
        this.lt = lt;
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
        MHoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,tong,lt,kp
        };
    }
}

