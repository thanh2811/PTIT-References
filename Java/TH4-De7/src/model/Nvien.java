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
public class Nvien implements Serializable{
    private int ma;
    private String ten,dc,cm;
    private static int sma = 10000;

    public Nvien() {
        ma = sma++;
        }

    public Nvien(int ma, String ten, String dc, String cm) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.cm = cm;
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

    public String getCm() {
        return cm;
    }

    public void setCm(String cm) {
        this.cm = cm;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Nvien.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,dc,cm
        };
    }
}
