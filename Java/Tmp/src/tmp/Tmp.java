/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmp;

import java.util.Scanner;

/**
 *
 * @author Pham Thanh
 */
public class Tmp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String t;
        Scanner sc = new Scanner(System.in);
        while(true){
            t = sc.nextLine();
            if(t.matches("[a-zA-Z ]*")) break;
            System.out.println("Sai");
        }
    }
    
}
