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
public class BangQLM implements Serializable{
    private BanDoc bandoc;
    private Sach sach;
    private int sl;
    private String tt;

    public BangQLM() {
    }

    public BangQLM(BanDoc bandoc, 
            Sach sach, int sl, String tt) {
        this.bandoc = bandoc;
        this.sach = sach;
        this.sl = sl;
        this.tt = tt;
    }

    public BanDoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(BanDoc bandoc) {
        this.bandoc = bandoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }
    public Object[] toObject(){
        return new Object[]{
           bandoc.getMa(),bandoc.getTen(),
            sach.getMa(),sl,tt
        };
    }
}
