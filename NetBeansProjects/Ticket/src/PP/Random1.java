/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author hmqhmq
 */
public class Random1 extends Random {  
    public StringBuffer Random2() throws Exception {  
        ZhuanHuan z=new ZhuanHuan();
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";  
        char[] c = s.toCharArray();  
        StringBuffer a =new StringBuffer();
       Random random = new Random();
       for(int i=1;i<5;i++){
        a.append(c[random.nextInt(c.length)]+z.InttoString(random.nextInt(c.length))); }
       return a;
    }  
}  