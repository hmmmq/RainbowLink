/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Stroke;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author hmqhmq
 */
public class RoundBorder_10r implements Border {
 @Override
 public Insets getBorderInsets(Component c) {
  return new Insets(0,0,0,0);
 }
 @Override
public boolean isBorderOpaque() {
  return false;
 }
 @Override
 public void paintBorder(Component c, Graphics g, int x, int y,
   int width, int height) {
  Graphics2D g2=(Graphics2D)g;
Stroke stroke=new BasicStroke(3.0f);//设置线宽为3.0
g2.setStroke(stroke);
  g2.setColor(Color.white);
  g2.drawRoundRect(-1, -1, c.getWidth()+1, c.getHeight()+1, 10, 10);
 }
 
}

