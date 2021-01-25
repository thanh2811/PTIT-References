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
public class Phong implements Serializable{
    private int ma;
    private String kieu;
    private int muctien,sophong;
    private static int sma = 100;

    public Phong() {
        ma = sma++;
    }

    public Phong(int ma, String kieu, int muctien, int sophong) {
        this.ma = ma;
        this.kieu = kieu;
        this.muctien = muctien;
        this.sophong = sophong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getMuctien() {
        return muctien;
    }

    public void setMuctien(int muctien) {
        this.muctien = muctien;
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
        Phong.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,kieu,muctien,sophong
        };
    }
}
