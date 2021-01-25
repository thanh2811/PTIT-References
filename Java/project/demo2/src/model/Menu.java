/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Pham Thanh
 */
public class Menu {
    public static void main(String[] args) {
        BaSoThuc bst = new BaSoThuc();
        Matran mt = new Matran(0);
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("------------Options------------");
            System.out.println("1. Enter a,b,c: ");
            System.out.println("2. Tinh Max");
            System.out.println("3. S tam giac.");
            System.out.println("4. GPT bac 2");
            System.out.println("5. Nhap Ma tran");
            System.out.println("6. Xuat Ma tran");
            System.out.println("7. Tong MT");
            System.out.println("0. Bye");
            choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                case 1:
                    bst.Nhap();
                    break;
                case 2:
                    System.out.print("Max = ");
//                    System.out.println(max());
                    break;
                case 3:
                    System.out.println("Max: " + bst.max());
                    break;    
                case 4:
                    break;
                case 5:
                    int n;
                    System.out.print("n = ");
                    n = sc.nextInt();
                    mt = new Matran(n);
                    mt.Nhap();
                    break;
                case 6:
                    System.out.println("In Ma tran: ");
                    mt.Out();
                case 7:
//                    Matran m2 = new Matran(mt.getKt());
//                    m2.Nhap();
                    Matran m3 = new Matran(mt.getKt());
                    m3.Nhap();
                    mt.Out();
                    m3.Out();
                    mt.TongMT(m3);
                    break;
            }
          
        }
    }
}
