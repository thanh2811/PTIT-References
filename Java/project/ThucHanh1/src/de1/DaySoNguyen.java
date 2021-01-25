package de1;
import  java.util.*;

public class DaySoNguyen{
    public int[] a;

    public DaySoNguyen(int n) {
        a = new int[n];
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao " + a.length +" phan tu cua mang a[]: ");
        for(int i=0;i<a.length;i++) a[i] = sc.nextInt();
    }
    public int minElement(){
        return a[a.length-1];
    }
    
    public void sort(){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
//        Arrays.sort(a,cmp);
        System.out.print("Mang a[] sau khi sap xep giam dan: ");
        for(int j=0;j<a.length;j++){
            System.out.print(a[j] + " ");
        }   
        System.out.println("");
    }
    
    
}
