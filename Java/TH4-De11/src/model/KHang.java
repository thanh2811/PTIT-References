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
public class KHang implements Serializable{
     private int ma;
     private String ten,loai;
     private int sophong;
     private static int sma = 100;

    public KHang() {
        ma = sma++;
    }

    public KHang(int ma, String ten, String loai, int sophong) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.sophong = sophong;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSophong() {
        return sophong;
    }

    public void setSophong(int sophong) {
        this.sophong = sophong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KHang.sma = sma;
    }
     public Object[] toObject(){
        return new Object[]{
            ma,ten,loai,sophong
        };
    }
}
