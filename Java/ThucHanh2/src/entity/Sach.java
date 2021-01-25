/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Pham Thanh
 */
public class Sach extends TaiLieu implements TinhTien{
    String tenSach,tenTg;
    int soTrang;
    
//    public Sach(String ma, String nxb, int soban) {
//        super(ma, nxb, soban);
//    }

    public Sach(String tenSach, String tenTg, int soTrang, String ma, String nxb, int soban) {
        super(ma, nxb, soban);
        this.tenSach = tenSach;
        this.tenTg = tenTg;
        this.soTrang = soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTg() {
        return tenTg;
    }

    public void setTenTg(String tenTg) {
        this.tenTg = tenTg;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    @Override
    public String toString(){
        return tenSach+'\t'+tenTg+'\t'+soTrang+'\t'+ getMa()+'\t'+getNxb()+'\t'+getSoban();
    }

    @Override
    public double getTien() {
        if(getSoban() >= 300) return getSoTrang() * 2000;
        else return getSoTrang() * 2000 * 0.8;
    }
}
