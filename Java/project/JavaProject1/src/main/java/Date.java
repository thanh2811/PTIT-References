import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        while(true){
            int choice;
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            int a,b,c,x;
            switch(choice){
                case 1: 
                    System.out.print("Type the value of a, b, c, d: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = sc.nextInt();
                    x = sc.nextInt();
                    break;
                case 2: 
                    System.out.print("Result of calculate S = ax^2 + bx + c: ");
                    long ans = a*x*x + b*x + c;
                    System.out.println(ans);
                    break;
                case 3: 
                    
                    break;
                case 4: 
                    
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
