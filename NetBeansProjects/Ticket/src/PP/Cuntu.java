/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author hmqhmq
 */
public class Cuntu {
     public ImageIcon cuntu(String s,int width,int height){
   ImageIcon image = new ImageIcon(getClass().getResource(s));//相对路径
   image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT ));
   return image;
}
    public ImageIcon cuntu2(String s,int width,int height){
   ImageIcon image = new ImageIcon(s);//绝对路径
   image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT ));
   return image;
}}
