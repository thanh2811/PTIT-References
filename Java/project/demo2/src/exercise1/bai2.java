/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;
import java.util.*;
/**
 *
 * @author Pham Thanh
 */
public class bai2 {
    
    public void gcd_lcm(int a,int b){
        System.out.print("GCD - LCM of (" + a + "," + b + "): ");
        int m = 1;
        long x = a * b;
        while(b!=0){
            m = a%b;
            a = b;
            b = m;
        }
        System.out.println(a + " - " + x/a);
    }
    
    public static int snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return 0;
        return 1;
    }
    
    public static void prime(int m,int n){
        System.out.print("Prime numbers from m to n: ");
        if(m>n) System.out.print("None (because m > n)");
        else 
            for(int i=m;i<=n;i++){
                if(snt(i)==1) System.out.print(i + " ");
            }
        System.out.println("");
    }
    
    public static int isPalidrome(int a){
        String s = Integer.toString(a);
        if(s.substring(0) == s) return 1;
        return 0;
    }
    
    public static void palidrome(int m,int n){
        System.out.print("Palidrome numbers from m to n: ");
        if(m>n) System.out.print("None (because m > n)");
        else 
            for(int i=m;i<=n;i++){
                if(isPalidrome(i)==1) System.out.print(i + " ");
            }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
    }
}
