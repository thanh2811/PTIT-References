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
public class Pcong implements Serializable{
    private Nvien n;
    private Duan d;
    private int songay;
    private String vt;

    public Pcong() {
    }

    public Pcong(Nvien n, Duan d, int songay, String vt) {
        this.n = n;
        this.d = d;
        this.songay = songay;
        this.vt = vt;
    }

    public Nvien getN() {
        return n;
    }

    public void setN(Nvien n) {
        this.n = n;
    }

    public Duan getD() {
        return d;
    }

    public void setD(Duan d) {
        this.d = d;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    public String getVt() {
        return vt;
    }

    public void setVt(String vt) {
        this.vt = vt;
    }
    public Object[] toObject(){
        return new Object[]{
            n.getMa()+"",n.getTen(),d.getMa()+"",d.getTen(),songay,vt
        };
    }
}
