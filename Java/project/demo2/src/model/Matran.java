/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author Pham Thanh
 */
public class Matran {
    private int[][] a;
    public Matran(int n){
        a = new int[n][n];
    }
    public int getKt(){
        return a.length;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(i + "," + j + " = ");
                a[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
    }
    public void Out(){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void TongMT(Matran b){
        Matran t = new Matran(a.length);
        int len = a.length;
        for(int i = 0;i<len;i++){
            for(int j=0;j<len;j++){
                t.a[i][j] = 0;
            }
        }
        for(int i = 0;i<len;i++){
            for(int j=0;j<len;j++){
                t.a[i][j] = this.a[i][j] + b.a[i][j];
            }
        }
        t.Out();
    }
}
