package run;
import java.util.*;
import data.DaThuc;
import data.SoNguyenN;
public class Main1 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc  = new Scanner(System.in);
        DaThuc dt = null;
        double e = 0;
        SoNguyenN N = null;
        while(true){
            System.out.println("1. Nhap vao da thuc A bac n");
            System.out.println("2. Viet ra da thuc A");
            System.out.println("3. Tinh A-B");
            System.out.println("4. Tinh A+B");
            System.out.println("5. Tinh A/B");
            System.out.println("6. Nhap vao so nguyen n va eplison nho");
            System.out.println("7. Viet tong cac chu so cua n");
            System.out.println("8. Tinh pi/4 voi do chinh xac eplison");
             System.out.println("9. Liet ke cac uoc so cua n");
            System.out.println("10. Kiem tra so thuan nghich");
            System.out.println("11. Hoan vi cua 1,2,...,n");
            System.out.println("0. Exit");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.out.println("Bye !");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhap n = ");
                    int n = sc.nextInt();
                    dt = new DaThuc(n);
                    dt.Nhap(sc);
                    break;
                case 2:
                    dt.Out();
                    break;
                case 3:
                    System.out.print("Nhap m : ");
                    int m = sc.nextInt();
                    DaThuc b = new DaThuc(m);
                    b.Nhap(sc);
                    dt.tru(b).Out();
                    break;
                case 4:
                    System.out.print("Nhap m : ");
                    int mc = sc.nextInt();
                    DaThuc bc = new DaThuc(mc);
                    bc.Nhap(sc);
                    dt.tru(bc).Out();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.print("Nhap n : ");
                    int n6 = sc.nextInt();
                    N = new SoNguyenN(n6);
                    System.out.print("Nhap elipson: ");
                    e = sc.nextDouble();
                    break;
                case 7:
                    N.sumOfDigits();
                    break;
                case 8:
                    N.cal(e);
                    break;
                case 9:
                    N.uoc();
                break;
                case 10:
                    N.isPalidrome();
                break;
                case 11:
                    N.hoanvi();
                    break;
            }
        }
    }
}
