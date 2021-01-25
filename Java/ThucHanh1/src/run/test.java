/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

/**
 *
 * @author Pham Thanh
 */
import java.util.*;
public class test {
    
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer N = new Integer(n);
        String s1 = N.toString();
        StringBuilder sbd = new StringBuilder(s1).reverse();
        
        System.out.println(s1 + " " + sbd.toString());
        
        if(s1.compareTo(sbd.toString())==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
