
package run;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Random r = new Random();
//        for(int i = 1;i<=10;i++){
//            int x = r.nextInt(10);
//            System.out.print(x + " ");
//        }
        Scanner sc = new Scanner(System.in);
//        Integer a = new Integer(sc.nextLine());
//        System.out.println(a);
//        boolean x;
//        int r1 = Double.compare(12.3, 14.5);
//        System.out.println(r1);
//        int r4 = Character.compare('a', 'A');
//        System.out.println(r4);
//        String x1 = "thanh";
//        String x2 = "thanh pham";
//        System.out.println(Integer.valueOf("12345"));
            String code,name;
            String age, diem;
          String re = "^B\\d{2}DC(CN|AT)\\d{3}$" ;
          String re2 = "[0-9]{10,11}";
          String re3 = "";
//          while(true){
//              System.out.print("Code: ");
//              code = sc.nextLine().trim().toUpperCase();
//                code = sc.nextLine();
//              if(code.matches(re))
//                  break;
//              else 
//                  System.out.println("Invalid ID");
//          }
//          System.out.println(code);
//          String reName = "^[a-zA-Z ]+";
//          while(true){
//              System.out.print("Name: ");
//              name = sc.nextLine().trim().toUpperCase();
//              if(name.matches(reName))
//                  break;
//              else 
//                  System.out.println("Invalid ID");
//          }
//          System.out.println(name);
          String reAge = "^[0-9]\\d{1,2}[1-9]";
          while(true){
              System.out.print("Age: ");
              age = sc.nextLine();
              if(age.matches(reAge))
                  break;
              else 
                  System.out.println("Invalid ID");
          }
          System.out.println(age);
//          String rePoint = "^[1-9]//.?";
//          while(true){
//              System.out.print("Age: ");
//              diem = sc.nextLine();
//              if(diem.matches(rePoint))
//                  break;
//              else 
//                  System.out.println("Invalid ID");
//          }
    }
}
