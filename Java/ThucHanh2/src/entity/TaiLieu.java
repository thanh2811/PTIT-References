/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;

public class TaiLieu implements Comparable{
    private String ma,nxb;
    private int soban;

    public TaiLieu(String ma, String nxb, int soban) {
        this.ma = ma;
        this.nxb = nxb;
        this.soban = soban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoban() {
        return soban;
    }

    public void setSoban(int soban) {
        this.soban = soban;
    }
    
    @Override
    public int compareTo(Object o){
        return this.ma.compareToIgnoreCase(((TaiLieu)o).ma);
    }
}
