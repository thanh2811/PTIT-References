package run;

import data.MaTran;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        int choice;
        Scanner sc  = new Scanner(System.in);
        MaTran m1 = null;
        while(true){
            System.out.println("1. Nhap vao ma tran 2 chieu");
            System.out.println("2. In ra Ma tran");
            System.out.println("3. Tinh tong 2 ma tran");
            System.out.println("4. Tinh tich 2 ma tran");
            System.out.println("5. Nhap ngay sinh (khong can kiem tra)");
            System.out.println("6. Nhap ngay sinh(kiem tra dinh dang dd/mm/yyyy)");
            System.out.println("7. Viet ra nam sinh");
            System.out.println("8. Nhap ngay sinh(kiem tra ngay thang)");
           
            System.out.println("0. Exit");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
//            sc.nextLine();
            switch(choice){
                case 0:
                    System.out.println("Bye !");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhap so hang: ");
                    int n = sc.nextInt();
                    System.out.print("Nhap so cot: ");
                    int m = sc.nextInt();
                    m1 = new MaTran(n,m);
                   m1.Nhap(sc);
                    break;
                case 2:
                    m1.Out();
                    break;
                case 3:
                    MaTran m2 = new MaTran(m1.getHang(),m1.getCot());
                    m2.Nhap(sc);
                    System.out.print("Tong 2 ma tran la: ");
                    m1.tong(m2).Out();
                    break;
                case 4:
                    System.out.print("Nhap so hang: ");
                    int h = sc.nextInt();
                    System.out.print("Nhap so cot: ");
                    int c = sc.nextInt();
                    MaTran m3 = new MaTran(h,c);
                    m3.Nhap(sc);
                    System.out.print("Tich 2 ma tran la: ");
                    m1.tich(m3).Out();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                
                default:
                    System.out.println("Nhap Sai");
                
            }
        }
    }
}
