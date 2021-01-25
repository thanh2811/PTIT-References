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
public class BHang implements Serializable {
    private NVien n;
    private MHang m;

    public BHang(NVien n, MHang m) {
        this.n = n;
        this.m = m;
    }

    public NVien getN() {
        return n;
    }

    public void setN(NVien n) {
        this.n = n;
    }

    public MHang getM() {
        return m;
    }

    public void setM(MHang m) {
        this.m = m;
    }
    public Object[] toObject(){
        return new Object[]{
            n.getMa(),n.getTen(),m.getMa(),m.getTen(),m.getNhom()
        };
    }
}
