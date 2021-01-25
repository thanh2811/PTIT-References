/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import src.HaiSoNguyen;
import java.util.*;

/**
 *
 * @author Pham Thanh
 */
public class Main {
    public static void main(String[] args) {
        HaiSoNguyen x = new HaiSoNguyen();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("------------------------------");
            
            System.out.println("1. Enter a,b.");
            System.out.println("2. GCD - LCM.");
            System.out.println("3. Prime a -> b");
            System.out.println("4. Palidrome in a - b");
            System.out.println("0. exit");
            
            System.out.println("------------------------------");
            
            System.out.println("Choose an option :");
            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.out.println("Bye");
                    System.exit(0);
                    break;
                case 1:
                    x.Nhap();
                    break;
                case 2:
                    x.gcd_lcm();
                    break;
                case 3:
                    x.prime();
                    break;
                case 4:
                    x.palidrome();
                    break;
            }
        }   
    }
}
