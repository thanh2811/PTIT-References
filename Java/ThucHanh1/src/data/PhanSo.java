package data;
import java.util.*;
public class PhanSo {
    private int tu, mau;

    public void Nhap(Scanner sc){
        System.out.print("Nhap tu so: ");
        this.tu = sc.nextInt();
        System.out.print("Nhap mau so: ");
        this.mau = sc.nextInt();
    }
    public void Out(){
        System.out.println("Phan so: " + tu + "/" + mau);
    }
    
    int gcd(int a,int b){
        int m;
        while(b!=0){
            m = a%b;
            a = b;
            b = m;
        }
        return a;
    }
    
    public void tong(PhanSo b){
        PhanSo t = new PhanSo();
        t.tu = tu*b.mau + mau*b.tu;
        t.mau = mau * b.mau;
        int g  = gcd(t.tu,t.mau); 
        t.tu /= g;
        t.mau /= g;
        System.out.println("Tong 2 phan so la: " + t.tu + "/" + t.mau );
    }
    public void tich(PhanSo b){
        PhanSo t = new PhanSo();
        t.tu = tu*b.tu;
        t.mau = mau * b.mau;
        int g  = gcd(t.tu,t.mau); 
        t.tu /= g;
        t.mau /= g;
        System.out.println("Tich 2 phan so la: " + t.tu + "/" + t.mau );
    }
    
}
