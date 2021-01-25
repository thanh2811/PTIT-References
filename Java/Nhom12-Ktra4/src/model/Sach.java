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
public class Sach implements Serializable{
    //(mã sách, Tên sách, Tác giả, 
    //Chuyên ngành, Năm xuất bản,Số lượng)
    private int ma;
    private String ten,tg,cn;
    private int nam,sl;
    private static int sma=10000;

    public Sach() {
        ma=sma++;
    }

    public Sach(int ma, String ten, 
            String tg, String cn, int nam, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.tg = tg;
        this.cn = cn;
        this.nam = nam;
        this.sl = sl;
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

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
         ma,ten,tg,cn,nam,sl
        };
    }
}
