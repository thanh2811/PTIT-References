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
public class Sxep implements Serializable{
    private Lop l;
    private PHoc p;
    int kip;

    public Sxep(Lop l, PHoc p, int kip) {
        this.l = l;
        this.p = p;
        this.kip = kip;
    }

    public Lop getL() {
        return l;
    }

    public void setL(Lop l) {
        this.l = l;
    }

    public PHoc getP() {
        return p;
    }

    public void setP(PHoc p) {
        this.p = p;
    }

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }
    public Object[] toObject(){
        return new Object[]{
            l.getMa(),l.getTen(),p.getMa(),p.getTen(),kip
        };
    }
}
