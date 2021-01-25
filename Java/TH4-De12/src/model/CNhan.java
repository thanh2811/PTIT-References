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
public class CNhan implements Serializable{
    private int ma;
    private String ten,dc,ca;
    private static int sma = 10000;

    public CNhan() {
        ma = sma++;
    }

    public CNhan(int ma, String ten, String dc, String ca) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.ca = ca;
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

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CNhan.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,dc,ca
        };
    }
    
}
