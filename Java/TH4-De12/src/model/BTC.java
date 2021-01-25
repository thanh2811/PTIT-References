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
public class BTC implements Serializable{
    private CNhan c;
    private SPham s;
    private int sl;

    public BTC(CNhan c, SPham s, int sl) {
        this.c = c;
        this.s = s;
        this.sl = sl;
    }

    public CNhan getC() {
        return c;
    }

    public void setC(CNhan c) {
        this.c = c;
    }

    public SPham getS() {
        return s;
    }

    public void setS(SPham s) {
        this.s = s;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public Object[] toObject(){
        return new Object[]{
            c.getMa(),c.getTen(),s.getMa(),s.getTen(),sl
        };
    }
}
