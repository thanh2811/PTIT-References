/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import entity.TinhTien;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        double t=new TinhTien(){
            public double getTien(){
                return 20000;
            }
        }.getTien();
        System.out.println(t);
    }
}
