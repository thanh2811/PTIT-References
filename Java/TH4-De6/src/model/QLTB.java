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
public class QLTB implements Serializable {
    private PHoc p;
    private TBi t;
    private int sl;
    private String tt;

    public QLTB(PHoc p, TBi t, int sl, String tt) {
        this.p = p;
        this.t = t;
        this.sl = sl;
        this.tt = tt;
    }

    public PHoc getP() {
        return p;
    }

    public void setP(PHoc p) {
        this.p = p;
    }

    public TBi getT() {
        return t;
    }

    public void setT(TBi t) {
        this.t = t;
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
            p.getMa(),p.getTen(),t.getMa(),t.getTen(),sl,tt
        };
    }
}
