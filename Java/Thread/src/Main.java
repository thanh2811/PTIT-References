
public class Main extends Thread{
    public static void main(String[] args) {
        int t = 1;
       
        while(t<=10){
            
//            if(t==10) t = 1;
            System.out.println(t);
            t++;
            try{
                sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);

            }
        }
    }
}
