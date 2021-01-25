package model;
import java.util.*;

class HaiSoNguyen{
    private int a,b;

    public void Nhap(){
        System.out.print("a = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
    }
    
    public void gcd_lcm(){
        int temp;
        long mul = a * b;
        int aa = a, bb = b;
        while(bb!=0){
            temp = aa%bb;
            aa = bb;
            bb = temp;
        }
        System.out.println("GCD: " + aa + "/tLCM: " + mul/aa );
    }
    
    
}