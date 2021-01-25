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
    private KHang k;
    private Phong p;
    private int sn;

    

    public Sxep(KHang k, Phong p,  int sn) {
        this.k = k;
        this.p = p;
       
        this.sn = sn;
    }

    public KHang getK() {
        return k;
    }

    public void setK(KHang k) {
        this.k = k;
    }

    public Phong getP() {
        return p;
    }

    public void setP(Phong p) {
        this.p = p;
    }

    

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }
     public Object[] toObject(){
        return new Object[]{
            k.getMa(),k.getTen(),k.getLoai(),k.getSophong(),p.getMa(),p.getKieu(),sn
        };
    }
}
