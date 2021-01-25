/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Main1 {
    public static void main(String[] args) {
//        Set s=new HashSet();
//        s.add(1234);
//        s.add(1234);
//        s.add(231);
//        s.add(987);
//        System.out.println(s.size());//3
//        Iterator i=s.iterator();
//        while(i.hasNext())
//            System.out.println(i.next());
//       Map m=new HashMap();
//       m.put("Num 1","To ana na");
//       m.put("Num 1","Lai nu nu");
//       m.put("Num 2","Anh hoa hoa");
//       m.put("Num 3","Kieu thu htu");
//       Iterator i=m.keySet().iterator();
//       while(i.hasNext()){
//           String key=(String)i.next();
//           System.out.println(key+"->"+m.get(key));
//       }
        int a,b;
        a = 7;
        b = 0;
        
        try{
//            int c = a/b;
            String num = "nnn";
            System.out.println(num);
            int n = Integer.parseInt(num);
            System.out.println(n);
            String d = "3/11/2020";
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
            Date dt = f.parse(d);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        // checked exception
        catch(ParseException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally");
        }
    }
}
