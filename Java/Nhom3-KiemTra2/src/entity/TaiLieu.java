
package entity;


public class TaiLieu implements Comparable{
    private String ma,tenNXB;
    private int soBan;
    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, 
            int soBan) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBan = soBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public int compareTo(Object o) {
        return this.ma.compareToIgnoreCase(((TaiLieu)o).ma);
    }
    
}
