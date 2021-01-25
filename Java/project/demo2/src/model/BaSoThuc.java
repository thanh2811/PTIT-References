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
public class BaSoThuc {
    private double a,b,c;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
    }
    public double max(){
        return Math.max(a, Math.max(b,c));
    }
    public double Stamgiac(){
        double t = 0;
        if(a<=0 || b<=0 || c<=0) t = 0;
        else if(a+b<=c || a+c<=b || c+b<=a) t = 0;
        return t;
    }
}
