/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.*;

public class HaiSoNguyen{
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
        System.out.println("GCD: " + aa + "     LCM: " + mul/aa );
    }
   
    public void prime(){
        System.out.print("Prime numbers from a to b: ");
        
        int[] arr = new int[b+10];
        Arrays.fill(arr, 0);
        arr[0] = arr[1] = 1;
        for(int i=2;i<=b;i++){
            if(arr[i] == 0){
                for(int j=i*2;j<=b;j+=i)
                    arr[j] = 1;
                if(i>=a)
                    System.out.print(i + " ");
            }
        }
        
        System.out.println("");
    }
    
    public void palidrome(){
        System.out.println("Palidrome numbers in range [a,b]: ");
        for(int i=a;i<=b;i++){
            String s1 = Integer.toString(i);
            String s = new StringBuffer(s1).reverse().toString();
            if(s.compareTo(s1) == 0) System.out.print(i + " ");
        }
        System.out.println("");
    }
    
}
