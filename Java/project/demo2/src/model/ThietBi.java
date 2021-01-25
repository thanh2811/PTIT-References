/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pham Thanh
 */
public class ThietBi {
    private String ten, ma;
    private int namSx;
    private boolean trongnuoc;
    public ThietBi(){};
    public  ThietBi(String ma, String ten, boolean trongnuoc, int namSx){
        this.ma = ma;
        this.ten = ten;
        this.namSx = namSx;
    }
}
