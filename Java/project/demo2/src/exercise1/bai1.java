package exercise1;
import java.util.*;
/**
 *
 * @author Pham Thanh
 */
public class bai1 {
    public static void main(String[] args) {
        int n = 0;
        while(true){
            System.out.println("------------Options------------");
            System.out.println("1. Enter an integer n from keyboard.");
            System.out.println("2. Print sum of 1+2+3+...+n.");
            System.out.println("3. Print multi of 1.2.3...n.");
            System.out.println("4. Print Sum of even numbers from 0 to n.");
            System.out.println("5. Print Sum of odd nembers from 0 to n.");
            System.out.println("6. Print prime numbers < n.");
            System.out.println("7. Print fibonacci numbers < n.");
            System.out.println("8. Print sum digits of n.");
            System.out.println("9. Print divisors of n.");
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Please choose the option : ");
            int option = sc.nextInt();
//            int n = 0;
            switch(option){
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Enter n: ");
                    n = sc.nextInt();
                    break;
                case 2:
                    System.out.print("Sum from 1 to n: ");
                    int sum = 0;
                    for(int i=1;i<=n;i++) sum += i;
                    System.out.println(sum);
                    break;
                case 3:
                    System.out.print("Multi from 1 to n: ");
                    long multi = 1;
                    for(int i=1;i<=n;i++) multi *= i;
                    System.out.println(multi);
                    break;   
                case 4:
                    System.out.print("Smm of even integer from 1 to n: ");
                    int sumEven = 0;
                    for(int i=0;i<=n;i+=2) sumEven += i;
                    System.out.println(sumEven);
                    break;
                case 5:
                    System.out.print("Smm of odd integer from 1 to n: ");
                    int sumOdd = 0;
                    for(int i=1;i<=n;i+=2) sumOdd += i;
                    System.out.println(sumOdd);
                    break;
                case 6:
                    System.out.print("Prime numbers < n: ");
                    for(int i=2;i<=n;i++){
                        if(snt(i)==1) System.out.print(i + " ");
                    }
                    System.out.println("\n");
                    break;
                case 7:
                    int f1 = 0, f2 = 1;
                    int i = 0;
                    System.out.print("Fibonacci numbers < n: ");
                    if(n>0) System.out.print("0 ");
                    if(n>1) System.out.println("1 ");
                    while(i<n){
                        i  = f1 + f2;
                        if(i>n) break;
                        f1 = f2;
                        f2 = i;
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("n = " + n);
                    System.out.print("Sum degits of n: ");
                    System.out.println(sum_of_digits(n));
                    break;  
                case 9:
                    System.out.print("Divisors of n: ");
                    divisor(n);
                    break;
                default:
                    System.out.println("Invalid number !");
                    
            }
         
        }
            
        }
    
    public static int snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    
    public static int sum_of_digits(int n){
        int s = 0;
        String ss = Integer.toString(n);
        for(int i=0;i<ss.length();i++){
            s += ss.charAt(i) - '0';
        }
        return s;
    }
    
    public static void divisor(int n){
//        ArrayList<Integer> a = new ArrayList<Integer>();
        List<Integer> a = new ArrayList();
        
        for(int i=1;i<Math.sqrt(n);i++){
            if(n % i == 0){
                a.add(i);
                a.add(n/i);
            }
        }
        double x = Math.sqrt(n);
        if(x*x == n) a.add((int)x);
        Collections.sort(a);
        a.forEach((i) -> {
            System.out.print(i + " ");
        });
        System.out.println("");
    }
    
    }
