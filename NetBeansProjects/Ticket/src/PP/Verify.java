/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hmqhmq
 */
public class Verify {
      Boolean Myboolean,Myboolean1,Myboolean2;
       String name,password;
        public boolean checkusername(String input){
        //Scanner input=new Scanner(System.in);
       System.out.println("请重试");//me
            name=input;
            Pattern Mypattern=Pattern.compile("^[b-zA-Z][a-zA-Z0-9_-]{2,10}$");//格式要求
            Matcher Mymatcher=Mypattern.matcher(name);//获得匹配内容name，开始匹配，返回匹配对象
            Myboolean=Mymatcher.matches();//通过对象获得匹配结果
           
            if(Myboolean==true){
                System.out.println("correct");//correct name
                Myboolean=false;
            }else{ Myboolean=true;
            
            }
        

        return Myboolean;
        }
        
        public boolean checkpassword(char[] a)
        { password=new String( a );
          
         System.out.println("register your password");//password
          
            Pattern Mypattern1=Pattern.compile( "^[a-zA-Z0-9]{6,10}$");//至少一位字母,6位数字,最多10位
            
            Matcher Mymatcher1=Mypattern1.matcher(password);
          Myboolean2=Mymatcher1.matches();
            if(Myboolean2==true){
                System.out.println("sussceed");//correct name 
                Myboolean2=false;
            }else{ Myboolean2=true;
        }
        return Myboolean2;
        
    }}
        
        
        
        
        
        
        
        
        
        
        
    
    

