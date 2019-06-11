/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

/**
 *
 * @author hmqhmq
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class getDate {
public String getDate(){
SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
return(df.format(new Date()));// new Date()为获取当前系统时间
         }
public static void main(String abc[]){
    System.out.println(new getDate().getDate());
}
}
