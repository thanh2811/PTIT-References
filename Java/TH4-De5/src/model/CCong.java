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
public class CCong implements Serializable {
    private NVien n;
    private PBan p;
    private int sl;

    public CCong(NVien n, PBan p, int sl) {
        this.n = n;
        this.p = p;
        this.sl = sl;
    }

    public NVien getN() {
        return n;
    }

    public void setN(NVien n) {
        this.n = n;
    }

    public PBan getP() {
        return p;
    }

    public void setP(PBan p) {
        this.p = p;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    public Object[] toObject(){
       return new Object[]{
           n.getMa(),n.getTen(),p.getMa(),p.getTen(),sl
       };
   }
}
