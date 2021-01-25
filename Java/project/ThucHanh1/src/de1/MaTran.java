package de1;
import java.util.*;


public class MaTran {
    private int[][] a;
    public MaTran(int m, int n){
        a = new int[m][n];
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(i + "," + j  +" = ");
                a[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
    
    public void outMatrix(){
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
    public MaTran cong(MaTran m){
        MaTran t = new MaTran(a.length,a[0].length);
        int[][] b = m.getA();
        int[][] c = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j] = b[i][j] + a[i][j];
            }
        }
        t.setA(c);
        return t;
    }
    public MaTran tru(MaTran m){
        MaTran t = new MaTran(a.length,a[0].length);
        int[][] b = m.getA();
        int[][] c = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j] = b[i][j] - a[i][j];
            }
        }
        t.setA(c);
        return t;
    }
    
    public MaTran chuyenvi(){
        MaTran t = new MaTran(a[0].length,a.length);
        int[][] c = new int[a[0].length][a.length];
        
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j] = a[j][i];
            }
        }
        t.setA(c);
        return t;
    }
    public int getRow(){
        return a.length;
    }
    public int getCol(){
        return a[0].length;
    }
}
