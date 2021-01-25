package run;
import data.PhanSo;
import data.DateOfBirth;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc  = new Scanner(System.in);
        
        
        PhanSo p = null;
        DateOfBirth d = null;
        while(true){
            System.out.println("1. Nhap vao phan so");
            System.out.println("2. Viet ra phan so");
            System.out.println("3. Tinh tong 2 phan so");
            System.out.println("4. Tinh tich 2 phan so");
            System.out.println("5. Nhap ngay sinh (khong can kiem tra)");
            System.out.println("6. Nhap ngay sinh(kiem tra dinh dang dd/mm/yyyy)");
            System.out.println("7. Viet ra nam sinh");
            System.out.println("8. Nhap ngay sinh(kiem tra ngay thang)");
           
            System.out.println("0. Exit");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 0:
                    System.out.println("Bye !");
                    System.exit(0);
                    break;
                case 1:
                    p = new PhanSo();
                    p.Nhap(sc);
                    break;
                case 2:
                    p.Out();
                    break;
                case 3:
                    PhanSo b = new PhanSo();
                    b.Nhap(sc);
                    p.tong(b);
                    break;
                case 4:
                    PhanSo c = new PhanSo();
                    c.Nhap(sc);
                    p.tich(c);
                    break;
                case 5:
                    d = new DateOfBirth();
                    d.Nhap1(sc);
                    break;
                case 6:
                    d = new DateOfBirth();
                    d.Nhap2(sc);
                    break;
                case 7:
                    d.Out();
                    d.getYear();
                    break;
                case 8:
                    break;
                
                default:
                    System.out.println("Nhap Sai");
                
            }
        }
    }
}
