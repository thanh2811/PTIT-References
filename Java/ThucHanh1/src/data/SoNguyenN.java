package data;
import java.util.*;
public class SoNguyenN {
    private int n;
    public  SoNguyenN(int n){
        this.n = n;
    }
    
    public void sumOfDigits(){
        int t = 0;
        int tmp = n;
        while(tmp!=0){
            t += tmp%10;
            tmp /= 10;
        }
        System.out.println("Tong cac ky tu cua " + n + ": " + t);
    }
    
    public void cal(double elipson){
        double tmp, s = 0;
        int i = 0;
        while(true){
            if(i%2==0) s += (double) 1.0/(2*i+1);
            else s -= (double) 1.0/(2*i+1);
            tmp = (double) 1.0/(2*i+1);
            if(tmp <= elipson) break;
            i++;
        }
        System.out.println("Pi/4 = " + s);
    }
    public void uoc(){
//        Arrays<Integer> A = new Arrays[];
        List<Integer> l = new ArrayList<Integer>();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                l.add(i);
                l.add(n/i);
            }
        }
        double x = Math.sqrt(n);
        if(x*x == (double) n) l.add((int)x);
        Collections.sort(l);
        System.out.print("Uoc cua " + n + " : ");
        for(Integer i : l){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    public void isPalidrome(){
        Integer N = new Integer(n);
        String s1 = N.toString();
        StringBuilder sbd = new StringBuilder(s1).reverse();
        if(s1.compareTo(sbd.toString())==0) System.out.println("YES");
        else System.out.println("NO");
    }
    
    void Try(int i, int[] arr, int[] chuaxet){
        for(int j=1;j<=n;j++){
            if(chuaxet[j]==1){
                chuaxet[j] = 0;
                arr[i] = j;
                if(i==n){
                    for(int x=1;x<arr.length;x++){
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println("");
                }
                else Try(i+1,arr,chuaxet);
                chuaxet[j] = 1;
            }
        }
    }
    
    public void hoanvi(){
        int[] arr = new int[n+1];
//        Arrays.fill(arr, 0);
        int[] chuaxet = new int[n+1];
        Arrays.fill(chuaxet, 1);
        Try(1,arr,chuaxet);
    }
}
