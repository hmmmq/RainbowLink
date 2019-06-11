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
import com.fancy.service.impl.CinemaServiceImpl;
import com.fancy.service.impl.HallServiceImpl;
import com.fancy.service.impl.MovieServiceImpl;
import com.fancy.service.impl.SessionServiceImpl;
import com.fancy.service.impl.TicketServiceImpl;
import com.fancy.service.impl.UserServiceImpl;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author 82148
 */
public class P22 extends JFrame implements ActionListener, MouseListener, KeyListener {
    
   private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    Cinema ci;
    CinemaService cs = new CinemaServiceImpl();
    Hall ha;
    HallService hs = new HallServiceImpl();
    Movie mo;
    MovieService ms = new MovieServiceImpl();
    Ticket ti;
    TicketService ts = new TicketServiceImpl();
    User u;
    UserService us = new UserServiceImpl();
    double money;
    Session se;
    SessionService ss = new SessionServiceImpl();
    List<Session> seslist;
    List<Cinema> cinlist;
    List<Integer> seatlist;
    List<Ticket> ticlist;
    List<Movie> molist;
int[] a;
int nt;
    int usertype;
    int n = 0;
     int j=0;
        int i=0;
         int v=1;
         ZhuanHuan t=new ZhuanHuan();
    P22(Cinema ci, Movie mo, Session se, Hall ha, List<Integer> seatlist, Double money, User u, Ticket ti) {
        this.ci = ci;
        this.mo = mo;
        this.se = se;
        this.ha = ha;
        this.seatlist = seatlist;
        this.mo = mo;
        this.money = money;
        this.u = u;
        this.ti = ti;
       
       molist=ms.queryAllMovie();
        seslist=ss.queryAllSession();
         cinlist=cs.queryAllCinema();
      
        
        ticlist = ts.queryAllTicketuId(u.getUid());
           nt=ticlist.size();
            a=new int[nt];
        GUI();
    }
    
    public void closeThis() {
        this.dispose();
    }
    public void tic1(int i,int count){
jPanel8.add(jPanel10);

jLabel27.setText(ms.queryMovieById(ss.querySessionById(ticlist.get(i).getsId()).getmId()).getmName());
jLabel28.setText(""+ss.querySessionById(ticlist.get(i).getsId()).getBeginTime());
jLabel29.setText(cs.queryCinemaById(ss.querySessionById(ticlist.get(i).getsId()).getcId()).getCaddress());
jLabel30.setText(t.InttoString(count));
}


public void tic2(int i,int count){
jPanel8.add(jPanel13);
jLabel31.setText(ms.queryMovieById(ss.querySessionById(ticlist.get(i).getsId()).getmId()).getmName());
jLabel32.setText(""+ss.querySessionById(ticlist.get(i).getsId()).getBeginTime());
jLabel33.setText(cs.queryCinemaById(ss.querySessionById(ticlist.get(i).getsId()).getcId()).getCaddress());
jLabel34.setText(t.InttoString(count));
}



public void tic3(int i,int count){
jPanel8.add(jPanel14);
jLabel35.setText(ms.queryMovieById(ss.querySessionById(ticlist.get(i).getsId()).getmId()).getmName());
jLabel36.setText(""+ss.querySessionById(ticlist.get(i).getsId()).getBeginTime());
jLabel37.setText(cs.queryCinemaById(ss.querySessionById(ticlist.get(i).getsId()).getcId()).getCaddress());
jLabel38.setText(t.InttoString(count));
}



    public void GUI() {
        jPanel3 = new PCuntu("/img/钱包面板.jpg");
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new PCuntu("/img/支付面板.jpg");
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.addKeyListener(this);
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new PCuntu("/img/我的票信息框.jpg");
        jLabel26 = new javax.swing.JLabel();
        jPanel10 = new PCuntu("/img/我的票信息框.jpg");
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel13 = new PCuntu("/img/我的票信息框.jpg");
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel14 = new PCuntu("/img/我的票信息框.jpg");
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel1 = new PCuntu("/img/会员背景.JPG");
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel9.addMouseListener(this);
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel15.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("我的余额");
        jLabel5.addMouseListener(this);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¥" + u.getBalance());

        jLabel16.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("                      充值");
        jLabel16.addMouseListener(this);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel1)
                                .addContainerGap(208, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(238, 238, 238))
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel15)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("         微信支付                     >");
        jLabel14.addMouseListener(this);

        jLabel21.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("         支付宝支付                   >");
        jLabel21.addMouseListener(this);

        jLabel22.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("充值金额：");

        jLabel23.setFont(new java.awt.Font("宋体", 0, 60)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("¥");

        jTextField1.setBackground(new java.awt.Color(34, 35, 54));
        jTextField1.setFont(new java.awt.Font("宋体", 0, 60)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.addActionListener(this);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addContainerGap(383, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel22)
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(null);
        jPanel6.setOpaque(false);

        jLabel24.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Please Enter Your Password And Press Enter");

        jPasswordField1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPasswordField1.addKeyListener(this);

        jLabel25.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("<Hasn't been decided yet.");
        jLabel25.addMouseListener(this);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(121, 121, 121))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel24)
                .addGap(51, 51, 51)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel25)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/票务面板.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel27.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("27");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("5月6日");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("jLabel29");

        jLabel30.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("jLabel30");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addGap(43, 43, 43))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jLabel31.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("27");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("5月6日");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("jLabel29");

        jLabel34.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("jLabel30");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                        .addComponent(jLabel34)
                        .addGap(43, 43, 43))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addContainerGap())
        );

        jLabel35.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("27");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("5月6日");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("jLabel29");

        jLabel38.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("jLabel30");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addGap(43, 43, 43))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1120, 630));
        setSize(new java.awt.Dimension(1120, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setLayout(null);

        jPanel8.setBackground(null);
        jPanel8.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(0, 0, 1120, 630);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ashok脑壳.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(120, 170, 210, 199);

        jLabel11.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("二星会员");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(180, 410, 100, 30);

        jLabel10.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(u.getuName());
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 370, 90, 40);

        jLabel13.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/大返回.jpg"))); // NOI18N
        jLabel13.setText("<");
        jLabel13.addMouseListener(this);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 30, 80, 60);

        jPanel2.setBackground(null);
        jPanel2.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("       " + ticlist.size());

        jLabel9.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("会员卡");
        jLabel9.addMouseListener(this);

        jLabel19.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("1");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    我的钱包                         >");
        jLabel2.addMouseListener(this);

        jLabel8.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("优惠�");

        jLabel18.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("4");

        jLabel7.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("卖品");

        jLabel17.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("0");

        jLabel6.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("电影票");
        jLabel6.addMouseListener(this);

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("    会员权益                         >");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("    联系客服                         >");
        jLabel5.addMouseListener(this);

        jLabel4.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("    我的影单                         >");
        jLabel4.addMouseListener(this);
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                                                .addGap(54, 54, 54))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(79, 79, 79)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                        .addComponent(jLabel7)
                                                .addGap(69, 69, 69)
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(57, 57, 57)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                                                .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(89, 89, 89)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(410, 0, 570, 630);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 630));

        pack();
    }
    
    public static void main(String abc[]) {
        ArrayList<Integer> seatlist = new ArrayList<>();
        seatlist.add(9);
        Cinema ci = new Cinema();
        Hall ha = new Hall();
        Session se = new Session();
        Movie mo = new Movie();
        CinemaService cs = new CinemaServiceImpl();
        HallService hs = new HallServiceImpl();
        SessionService ss = new SessionServiceImpl();
        MovieService ms = new MovieServiceImpl();
        se = ss.querySessionById(2);
        ha = hs.queryHallById(2);
        ci = cs.queryCinemaById(1);
        mo = ms.queryMovieById(2);
        User u = new User();
        UserService us = new UserServiceImpl();
        u = us.queryUserByid(8);
        Ticket ti = new Ticket();
        TicketService ts = new TicketServiceImpl();
        //用户必须买了票才行---BUG
       // ti = ts.queryAllTicketuId(u.getUid()).get(0);
        P22 p = new P22(ci, mo, se, ha, null, 0d, u, null);
        p.setVisible(true);
        //s,h,c,m,13,8,2,16
        //2212
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void mouseClicked(MouseEvent e) {
        Object c = e.getSource();
        if (c == jLabel2) {//我的钱包

            jPanel1.remove(jPanel2);
            jPanel3.setBounds(450, 0, 570, 630);
            jPanel1.add(jPanel3);
            jPanel1.updateUI();
            this.setVisible(true);
            n++;
        }
        
        if (c == jLabel16) {//充值
            jPanel1.remove(jPanel3);
            jPanel4.setBounds(450, 0, 570, 630);
            jPanel1.add(jPanel4);
            jPanel1.updateUI();
            this.setVisible(true);
            n++;
        }
        
        if (c == jLabel14) {//微信支付
            jPanel6.setBounds(0, 0, 1120, 630);
           // jPanel8.setLayout(null);
            jPanel8.add(jPanel6);
            jPanel8.updateUI();
            this.setVisible(true);
        }
        if(c==jLabel6){
            System.out.println("4");
            int i;
        jPanel1.remove(jPanel2);  
    
            System.out.println("3");
jPanel7.setBounds(450,0,570, 630);
jPanel10.setBounds(450, 0, 570, 188);
jPanel13.setBounds(450, 188, 570, 188);
jPanel14.setBounds(450, 376, 570, 188);
jPanel1.add(jPanel7);
            System.out.println("2");
          
for(i=0;i<nt;i++)
{
a[i]=ticlist.get(i).getsId();
}
while(i<nt)
{
int j=0;
i=0;

int count=0;//432200
System.out.println("a[].size:"+nt+"i:"+i+"j:"+j);
for(j=i;j<nt;j++)
count++;
i+=j;

switch(v)
{
case 1:tic1(i,count);break;
case 2:tic2(i,count);break;
case 3:tic3(i,count);break;
}
v++;
}
            System.out.println("1");
jPanel1.updateUI();
jPanel8.updateUI();
         
this.setVisible(true);
n=3;}
        
        if (c == jLabel25) {//充值返回
            jPanel8.remove(jPanel6);
            jPanel8.updateUI();
            this.setVisible(true);// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        if (c == jLabel21) {//支付宝支付
            jPanel6.setBounds(0, 0, 1120, 630);
            jPanel8.add(jPanel6);
            jPanel8.updateUI();
            this.setVisible(true);// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        if (c == jLabel5) {//联系客服
            System.out.println("jl15go to 26");
            new P26(ci, mo, se, ha, null, 0d, u, ti).setVisible(true);
            this.dispose();
            closeThis();// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        if (c == jLabel9) {//会员卡
            //P26
            new P27(ci, mo, se, ha, seatlist, money, u, ti).setVisible(true);
           this.dispose();
        }
        if (c == jLabel13) {//返回键
            if (n == 0) {
                new P2(ci, mo, se, ha, seatlist, money, u, ti).setVisible(true);
                closeThis();
            }
            if (n == 1) {
                jPanel1.remove(jPanel3);
                jPanel2.setBounds(410, 0, 570, 630);
                jPanel1.add(jPanel2);
                jPanel1.updateUI();
                this.setVisible(true);
                n--;
            }
            if (n == 2) {
                jPanel1.remove(jPanel4);
                jPanel3.setBounds(450, 0, 570, 630);
                jLabel1.setText("¥" + u.getBalance());
                jPanel3.updateUI();
                jPanel1.add(jPanel3);
                jPanel1.updateUI();
                this.setVisible(true);
                n--;
            }
            if (n == 3) {
                jPanel1.remove(jPanel7);
//jPanel8.remove(jPanel9);
                jPanel1.add(jPanel2);
                jPanel1.updateUI();
                jPanel8.updateUI();
                this.setVisible(true);
                n = 0;
            }
        }
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
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        Object o = e.getSource();
        ZhuanHuan z=new ZhuanHuan();
        if (o == jPasswordField1) {
           money=  z.Stringtoint(jTextField1.getText());
            int key = e.getKeyCode();
            if (key == '\n') {
                String s = new String(jPasswordField1.getPassword());
                if (s.equals(u.getuPass())) {
                    
                    u.setBalance(u.getBalance() + money);
                    us.updateUser(u);
                     jLabel1.setText("¥" + u.getBalance());
                    jPanel8.remove(jPanel6);
                    JOptionPane.showMessageDialog(null, "充值成功！");
//                    jPasswordField1.setText("");
//                    jTextField1.setText("");
                    jPanel8.updateUI();
                    this.setVisible(true);
                    
                }
                else{
                
                JOptionPane.showMessageDialog(null, "密码错误");
                }
            }
//To change body of generated methods, choose Tools | Templates.
        }    // TODO add your handling code here:
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
