/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.Serializable;

/**
 *
 * @author Pham Thanh
 */
public class BangPC implements Serializable{
    private LaiXe lx;
    private Tuyen tuyen;
    private String ngay;
    private int soluot;

    public BangPC(LaiXe lx, Tuyen tuyen, String ngay, int soluot) {
        this.lx = lx;
        this.tuyen = tuyen;
        this.ngay = ngay;
        this.soluot = soluot;
    }

    public LaiXe getLx() {
        return lx;
    }

    public void setLx(LaiXe lx) {
        this.lx = lx;
    }

    public Tuyen getTuyen() {
        return tuyen;
    }

    public void setTuyen(Tuyen tuyen) {
        this.tuyen = tuyen;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getSoluot() {
        return soluot;
    }

    public void setSoluot(int soluot) {
        this.soluot = soluot;
    }
    public Object[] toObject(){
        return new Object[]{
          lx.getMa(),tuyen.getMa(),lx.getTd(),ngay,soluot
        };
    }
}
