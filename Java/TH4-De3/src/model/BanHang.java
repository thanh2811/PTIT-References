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
public class BanHang implements Serializable{
    private KHang k;
    private MHang m;
    private int sl;

    public BanHang(KHang k, MHang m, int sl) {
        this.k = k;
        this.m = m;
        this.sl = sl;
    }

   

    public KHang getK() {
        return k;
    }

    public void setK(KHang k) {
        this.k = k;
    }

    public MHang getM() {
        return m;
    }

    public void setM(MHang m) {
        this.m = m;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    public Object[] toObject(){
         return new Object[]{
           k.getMa(),k.getTen(),m.getMa(),m.getTen(),sl
         };
     }
}
