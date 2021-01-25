package run;

import java.util.Scanner;
import model.QLTV;

public class Menu {
    public static void main(String[] args) {
        QLTV q=new QLTV();
        
        while(true){
            System.out.println("1. Nhap sach");
            System.out.println("2. Nhap bao");
            System.out.println("3. tap chi");
            System.out.println("4. viet ra ds");
            System.out.println("5. Xoa");
            System.out.println("6. Sua");
            System.out.println("7. Tim kiem dung (ma)");
            System.out.println("8. tim kiem chua");
            System.out.println("9. tim kiem tu..den..");
            System.out.println("10. sap xep ");
            System.out.println("11. Sap xep theo so ban");
            System.out.println("12. sap xep theo ten NXB");
            System.out.println("13. ");
                        
            System.out.println("0. Exit");
            System.out.print("Your choice (0->4):");
            
            int choice;
            Scanner in=new Scanner(System.in);
            choice=Integer.parseInt(in.nextLine());
            switch(choice){
                case 0:System.out.println("Bye!!!!");
                       System.exit(0);
                    break;
                case 1:q.nhapSach();
                    break;
                case 2:
                    break;
                case 3: 
                    break;
                case 4:q.vietDS();
                    break;
                case 5:System.out.print("Nhap ma sach can xoa:");
                       String m=in.nextLine();
                       q.xoa(m);
                    break;
                case 6:System.out.print("Nhap ma sach can xoa:");
                       String a=in.nextLine();
                       q.sua(a);
                    break;  
                case 7:System.out.print("Nhap ma:");
                       String t=in.nextLine();
                       q.tkTheoMa(t);
                    break;
                case 8:System.out.print("Nhap ten NXB:");
                       String tt=in.nextLine();
                       q.tkTheoNXB(tt);
                    break;
                case 9:System.out.print("Nhap So ban tu:");
                       int tu=Integer.parseInt(in.nextLine());
                       System.out.print("Nhap So ban den:");
                       int den=Integer.parseInt(in.nextLine());
                       q.tkTheoGia(tu, den);
                    break; 
                case 10:q.sxTheoMa();
                       break;
                case 11: q.sxTheoTenNXB();
                break;
                case 12: q.sxTheoSoBan();
                break;
                case 13:q.maxGroup();
                break;
                default:System.out.println("only select 0->7");
                
            }
        }
        
    }
}
