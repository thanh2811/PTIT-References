/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh3;

/**
 *
 * @author Pham Thanh
 */
public class Bai2 extends Thread {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String st = " HOC VIEN CONG NGHE BUU CHINH VIEN THONG ";
                while(true){
                    st = st.charAt(st.length()-1)+st.substring(0,st.length()-1);
                    System.out.println(st + " ");
                    try{
                        sleep(200);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
//                    s = st;
                }
            }
        });
        
        t.start();
    }
}
