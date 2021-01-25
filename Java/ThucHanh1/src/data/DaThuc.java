
package data;
import java.util.*;

public class DaThuc {
    private int[] a;
    
    public DaThuc(int n){
        a = new int[n+1];
    }
    public void Nhap(Scanner sc){
        System.out.print("Nhap cac he so: ");
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("");
    }
    public void Out(){
        System.out.print("Da thuc: ");
        for(int i=0;i<a.length-1;i++) {
            if(i==0 || a[i]>0) System.out.print(a[i] + "x^" + (a.length-1-i) );
            else System.out.print(-a[i] + "x^" + (a.length-1-i) );
            
            if(i<a.length-1 && a[i+1]>0) System.out.print(" + ");       
            else if(i<a.length-1) System.out.print(" - ");
        }
        System.out.println(a[a.length-1]);
    }
    public DaThuc tru(DaThuc b){
        DaThuc t = null;
        int n = a.length-1, m = b.a.length-1;
        if(a.length>=b.a.length){
            t = new DaThuc(n);
            for(int i=0;i<n;i++) {
                if(i<n-m) t.a[i] = a[i];
                else t.a[i] = a[i] - b.a[i-n+m];
            }
        }
        else{
            t = new DaThuc(m);
            for(int i=0;i<m;i++) {
                if(i<m-n) t.a[i] = -b.a[i];
                else t.a[i] = a[i] - b.a[i-m+n];
            }
        }
        return t;
    }
    public DaThuc cong(DaThuc b){
        DaThuc t = null;
        int n = a.length-1, m = b.a.length-1;
        if(a.length>=b.a.length){
            t = new DaThuc(n);
            for(int i=0;i<n;i++) {
                if(i<n-m) t.a[i] = a[i];
                else t.a[i] = a[i] + b.a[i-n+m];
            }
        }
        else{
            t = new DaThuc(m);
            for(int i=0;i<m;i++) {
                if(i<m-n) t.a[i] = b.a[i];
                else t.a[i] = a[i] + b.a[i-m+n];
            }
        }
        return t;
    }
}
