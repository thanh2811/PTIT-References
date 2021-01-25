package data;

import java.util.*;

public class MaTran {
    private int[][] a;

    public int getHang() {
        return a.length;
    }
    public int getCot() {
        return a[0].length;
    }

    public MaTran(){
        
    }
    public MaTran(int n,int m){
        a = new int[n][m];
    }
    public void Nhap(Scanner sc){
        System.out.println("Nhap vao ma tran: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print("["+i+","+j+"] = "); a[i][j] = sc.nextInt();
            }
        }
    }
    public void Out(){
        System.out.println("Ma tran: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public MaTran tong(MaTran b){
        MaTran c = new MaTran(a.length,a[0].length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c.a[i][j] = a[i][j] + b.a[i][j];
            }
        }
        return c;
    }
    public MaTran tich(MaTran b){
        if(a[0].length != b.a.length) {
            System.out.println("Invalid");
            return null;
        }
        MaTran c = new MaTran(a.length,b.a[0].length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.a[0].length;j++){
                c.a[i][j] = 0;
                for(int k = 0;k<b.a[0].length;k++){
                    c.a[i][j] += a[i][k] * b.a[k][j]; 
                }
            }
        }
        return c;
    }
}
