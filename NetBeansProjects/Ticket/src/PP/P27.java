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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fancy.entity.Cinema;
import com.fancy.entity.Hall;
import com.fancy.entity.Movie;
import com.fancy.entity.Session;
import com.fancy.entity.Ticket;
import com.fancy.entity.User;
import com.fancy.service.CinemaService;
import com.fancy.service.HallService;
import com.fancy.service.MovieService;
import com.fancy.service.SessionService;
import com.fancy.service.TicketService;
import com.fancy.service.UserService;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author 82148
 */
public class P27 extends JFrame implements ActionListener,MouseListener {
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
Cinema ci;
CinemaService cs; 
Hall ha; 
HallService hs; 
Movie mo; 
MovieService ms; 
Ticket ti; 
TicketService ts; 
User u; 
UserService us; 
double money;
Session se;
SessionService ss;
List<Integer> seatlist;
int usertype;
private List<Cinema> cinlist;
 
P27(Cinema ci,Movie mo,Session se,Hall ha,List<Integer> seatlist,Double money,User u,Ticket ti)
{this.ci=ci;
this.mo=mo;
this.se=se;
this.ha=ha;
this.seatlist=seatlist;
this.mo=mo;
this.money=money;
this.u=u;
this.ti=ti;
GUI();
}
public void closeThis(){
this.dispose();    
}
public void GUI(){
jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/大返回.jpg"))); // NOI18N
        jLabel2.addMouseListener(this);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  二星会员");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/小Ashok脑壳.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 140, 130));

        jLabel5.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(u.getuName());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("VIP Card");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18Nv
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID:"+u.getUid());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/会员卡背景.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 630));

        pack();    
}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseClicked(MouseEvent e) {
    Object c=e.getSource();
    if(c==jLabel2){
    closeThis();
    new P22(ci, mo, se, ha, null, 0d, u, ti).setVisible(true); 
    }// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



