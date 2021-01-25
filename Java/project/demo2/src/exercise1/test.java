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
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> a = new ArrayList();
//        int [] a = new int[100];
        for(int i=1;i<Math.sqrt(n);i++){
            if(n % i == 0){
                a.add(i);
                a.add(n/i);
            }
        }
        double x = Math.sqrt(n);
        if(x*x == n) a.add((int)x);
//        Collections.sort(a);123

//        a.forEach((i) -> {
//            System.out.print(i + " ");
//        });
//        System.out.println("");
         String s = Integer.toString(n);
         String t = s;
         
         System.out.println();
        }
    }
