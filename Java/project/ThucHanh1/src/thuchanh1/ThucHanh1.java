package thuchanh1;
import java.util.*;
import de1.DaySoNguyen;
import de1.DaThuc;
import de1.MaTran;

public class ThucHanh1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DaySoNguyen dsn = new DaySoNguyen(0);
        MaTran m = null;
        while(true){
            
            System.out.println("1. Nhap day so nguyen.");
            System.out.println("2. Dua ra phan tu nho nhat");
            System.out.println("3. Sap xep day so theo chieu giam dan");
            System.out.println("4. Nhap x, chen x sao cho day so van giam dan");
            System.out.println("5. Nhap vao da thuc bac n");
            System.out.println("6. Viet ra da thuc A");
            System.out.println("7. Tinh A + B");
            System.out.println("8. Tinh A / B (viet ra ca si du)");
            System.out.println("9. Nhap Matran.");
            System.out.println("10. Viet ra ma tran");
            System.out.println("11. Tong MaTran.");
            System.out.println("0. Exit");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch(choice){
            case 0:
                System.out.println("Bye !");
                System.exit(0);
                break;
            case 1:
                System.out.print("Nhap n: ");
                int n = sc.nextInt();
                dsn = new DaySoNguyen(n);
                dsn.Nhap();
                break;
            case 2:
                dsn.sort();
                System.out.print("Phan tu nho nhat: ");
                System.out.println(dsn.minElement());
                break;
            case 3:
                dsn.sort();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                int col, row;
                System.out.print("Nhap so hang: ");
                row = sc.nextInt();
                System.out.print("Nhap so cot: ");
                col = sc.nextInt();
                m = new MaTran(row,col);
                m.input();
                break;
            case 10:
                m.outMatrix();
                break;
            case 11:
                MaTran t = new MaTran(m.getRow(),m.getCol());
                t.input();
                MaTran tong = m.cong(t);
                tong.outMatrix();
                break;
            case 12:
                MaTran cv = m.chuyenvi();
                cv.outMatrix();
                break;
                      
        }
        }
        
    }
    
}
