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
public class SPham implements Serializable {
    
private int ma;
    private String ten;
    private int gia;
    private static int sma = 10000;

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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SPham.sma = sma;
    }

        public SPham(int ma, String ten, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public SPham() {
        ma = sma++;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,gia
        };
    }
}
