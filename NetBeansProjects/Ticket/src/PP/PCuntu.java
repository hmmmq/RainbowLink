/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

import java.awt.Color;
 import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hmqhmq
 */
public class PCuntu extends JPanel {
    ImageIcon icon;
	Image img;
        BufferedImage bii;
	public PCuntu(String s) {
		//  /img/HomeImg.jpg 是存放在你正在编写的项目的bin文件夹下的img文件夹下的一个图片
		icon=new ImageIcon(getClass().getResource(s));
		img=icon.getImage();
	}
        public PCuntu(String s,int alpha) {
		//  /img/HomeImg.jpg 是存放在你正在编写的项目的bin文件夹下的img文件夹下的一个图片
		  //文件与BufferedImage间的转换
        BufferedImage bi=file2img(s);  //读取图片
         bii=img_alpha(bi,150);
        img2file(bii,"PNG",s);  //生成图片

                System.out.println("PP.PCuntu.<init>()");
                
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//下面这行是为了背景图片可以跟随窗口自行调整大小，可以自己设置成固定大小
		g.drawImage(img, 0, 0,this.getWidth(), this.getHeight(), this);
	}
         public static BufferedImage img_alpha(BufferedImage imgsrc,int alpha) {
        try {
            //创建一个包含透明度的图片,半透明效果必须要存储为png合适才行，存储为jpg，底色为黑色
            BufferedImage back=new BufferedImage(imgsrc.getWidth(), imgsrc.getHeight(), BufferedImage.TYPE_INT_ARGB);
            int width = imgsrc.getWidth();  
            int height = imgsrc.getHeight();  
            for (int j = 0; j < height; j++) { 
                for (int i = 0; i < width; i++) { 
                    int rgb = imgsrc.getRGB(i, j);
                    Color color = new Color(rgb);
                    Color newcolor = new Color(color.getRed(), color.getGreen(),color.getBlue(), alpha);
                    back.setRGB(i,j,newcolor.getRGB());
                }
            }
            return back;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
         public static void img2file(BufferedImage img,String extent,String newfile) {
        try {
            ImageIO.write(img, extent, new File(newfile));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  public static BufferedImage file2img(String imgpath) {
        try {
            BufferedImage bufferedImage=ImageIO.read(new File(imgpath));
            return bufferedImage;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
