package data;
import java.util.*;
public class DateOfBirth {
    private String date;
    public void Nhap1(Scanner sc){
        System.out.print("Nhap vao ngay sinh: ");
        String d;
        d = sc.nextLine();
        this.date = d;
    }
    public void Nhap2(Scanner sc){
//        String regex = "\\d{1,2}/\\d{1,2}/\\d{4}";
        String regex = "[a-zA-z ]*";

        System.out.print("Nhap vao ngay sinh: ");
        while(true){
            date = sc.nextLine();
            if(this.date.matches(regex)) break;
            System.out.print("Nhap lai: ");
        }
        System.out.println(date.toUpperCase());
    }
    public void getYear(){
        System.out.println("Nam sinh: " + date.substring(date.lastIndexOf("/")+1));
    }
    public void Out(){
        System.out.println(date);
    }
    
}
