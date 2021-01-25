/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class CauThu {

    private int ma;
    private  String hoten;
    private int tuoi,ml;
    private static int sma = 100;
    

    public CauThu() {
        ma = sma++;
    }
    public static void setSma(int i) {
        sma = i;
    }

    public static int getSma() {
        return sma;
    }
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public CauThu(int ma, String hoten, int tuoi, int ml) {
        this.ma = ma;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.ml = ml;
    }
    
   

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
    
    public Object[] toObject(){
        return new Object[]{
          ma,hoten,tuoi,ml
        };
    }
}
