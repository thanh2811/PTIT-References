/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Sach {
    private int masach;

    private String tensach,tentg,cn;
    private int sl, nam;
    private static int maS = 10000;
    public Sach() {
        masach = maS++;
    }

    public Sach(int masach, String tensach, String tentg, String cn, int sl, int nam) {
        this.masach = masach;
        this.tensach = tensach;
        this.tentg = tentg;
        this.cn = cn;
        this.sl = sl;
        this.nam = nam;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public static int getMaS() {
        return maS;
    }

    public static void setMaS(int maS) {
        Sach.maS = maS;
    }
    public Object[] toObject(){
        return new Object[]{
            masach, tensach,tentg,cn,sl,nam
        };
    }
    
}
