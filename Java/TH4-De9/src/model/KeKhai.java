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
public class KeKhai implements Serializable{
    private MHoc m ;
    private GVien g;
    private int lop;

    public KeKhai(MHoc m, GVien g, int lop) {
        this.m = m;
        this.g = g;
        this.lop = lop;
    }

    public MHoc getM() {
        return m;
    }

    public void setM(MHoc m) {
        this.m = m;
    }

    public GVien getG() {
        return g;
    }

    public void setG(GVien g) {
        this.g = g;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }
    public Object[] toObject(){
        return new Object[]{
            g.getMa(),g.getTen(),m.getMa(),m.getTen(),m.getTong()
        };
    }
    
}
