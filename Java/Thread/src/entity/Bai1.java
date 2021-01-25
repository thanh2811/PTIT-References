
package entity;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai1 extends Thread{
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                    SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                System.out.println(s.format(new Date()));
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                }
            }
            
        }).start();
    }
}
