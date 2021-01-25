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
public class MHang implements Serializable {
    private int ma;
    private String ten, loai;
    private int gia;
    private static int sma = 1000;
    public MHang() {
        ma = sma++;
    }

    public MHang(int ma, String ten, String loai, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.gia = gia;
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

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MHang.sma = sma;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
     public Object[] toObject(){
         return new Object[]{
           ma,ten,loai,gia  
         };
     }
}
