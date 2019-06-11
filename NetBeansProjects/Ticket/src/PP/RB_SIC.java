/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

import java.awt.Cursor;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author hmqhmq
 */
public class RB_SIC  extends JRadioButton{
	
	public RB_SIC(String s1,String s2,int width,int height){   
                super();
                Cuntu c=new Cuntu();
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));   //设置鼠标手势
		setSelectedIcon(c.cuntu(s1,width,height)); //验证并登陆（选中图标）
		setIcon(c.cuntu(s2,width,height));   //立即登陆 （未选中图标）
		}
        
        public void TM(JRadioButton JR){
                  JR.setOpaque(false);         //背景透明
		  JR.setOpaque(false);
        }
		
	}
        


