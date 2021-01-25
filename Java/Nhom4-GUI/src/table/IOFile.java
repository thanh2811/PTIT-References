/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

/**
 *
 * @author ADMIN
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOFile {
    //doc tu file
    public static <T> List<T> doc(String file){
        List<T> list=new  ArrayList<>();
        try{
            ObjectInputStream o=new ObjectInputStream(new FileInputStream(file));
            list=(List<T>)o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        return list;
    }
    //ghi vao file
    public static <T> void viet(String file,
            List<T> arr){
        try{
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
