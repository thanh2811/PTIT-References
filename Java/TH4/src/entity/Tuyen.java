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
public class Tuyen implements Serializable{
    private int ma;
    private double kc;
    private int diemd;

    public Tuyen(int ma, double kc, int diemd) {
        this.ma = ma;
        this.kc = kc;
        this.diemd = diemd;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public double getKc() {
        return kc;
    }

    public void setKc(double kc) {
        this.kc = kc;
    }

    public int getDiemd() {
        return diemd;
    }

    public void setDiemd(int diemd) {
        this.diemd = diemd;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,kc,diemd
        };
    }
}
