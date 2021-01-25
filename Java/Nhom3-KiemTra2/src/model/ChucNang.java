/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public interface ChucNang {
    public void nhapSach();
    public void nhapTapChi();
    public void vietDS();
    public void xoa(String ma);
    public void sua(String ma);
    public void tkTheoMa(String ma);
    public void tkTheoNXB(String ten);
    public void tkTheoGia(double tu,double den);
    public void sxTheoMa();
    public void sxTheoTenNXB();
    public void sxTheoGia();
    public void tkTheoNXB();
    public void sxTheoSoBan();
    //max min average,sum,count
}
