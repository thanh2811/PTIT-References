package thuchanh1;

import java.util.Scanner;
import java.util.Date;

public class DateOfBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten;
        while(true){
            System.out.print("Ho va ten: ");
            hoten = sc.nextLine().trim();
            if(hoten.matches("^[a-zA-Z][a-zA-Z ]")) break;
            else System.out.println("Nhap lai, plz! ");
        }
        String ho, ten;
        ho = hoten.substring(0,hoten.indexOf(" "));
        ten = hoten.substring(hoten.lastIndexOf(" ")+1);
        System.out.println("Ho: " + ho);
        System.out.println("Ten: " + ten);
    }
}
