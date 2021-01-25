
package view;

import java.io.Serializable;


public class LaiXe implements Serializable{
    private int ma;
    private String ten,dc,td;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public LaiXe(int ma, String ten, String dc, String td) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.td = td;
    }
    public Object[] toObject(){
       return new Object[]{
           ma,ten,dc,td
       };
    }
}
