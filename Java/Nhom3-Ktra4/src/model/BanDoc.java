/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class BanDoc implements Serializable{
    //(mã bạn đọc, Họ tên, địa chỉ, Số ĐT)
    private int ma;
    private String ten,dc,dt;
    private static int sma=10000;
    public BanDoc() {
        ma=sma++;
    }

    public BanDoc(int ma, String ten, String dc, String dt) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.dt = dt;
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

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
    public static int getSma(){
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
          ma,ten,dc,dt
        };
    }
}
