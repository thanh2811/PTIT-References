/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run.wid;

import java.util.*;

class HaiSoNguyen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s1 = Integer.toString(i);
        String s = new StringBuffer(s1).reverse().toString();
        
//        if(s == s1) System.out.print(s + " ");
        System.out.println(s + " " + s1);
    }
    
    
}
