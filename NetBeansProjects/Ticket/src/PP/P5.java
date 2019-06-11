
package PP;

import com.fancy.service.UserService;
import com.fancy.service.HallService;
import com.fancy.service.TicketService;
import com.fancy.service.SessionService;
import com.fancy.service.MovieService;
import com.fancy.service.CinemaService;
import com.fancy.entity.Hall;
import com.fancy.entity.Cinema;
import com.fancy.entity.Ticket;
import com.fancy.entity.Movie;
import com.fancy.entity.User;
import com.fancy.entity.Session;
import com.fancy.service.impl.MovieServiceImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class P5 extends javax.swing.JFrame implements ActionListener, MouseListener{
    
        // Variables declaration - do not modify
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel IMAX3D;
    private javax.swing.JLabel Pre;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel intro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mbuy;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jp4_1;
    private javax.swing.JLabel mGrade2;
    private javax.swing.JLabel mName3;
    private javax.swing.JLabel wan;
    // End of variables declaration
    
    Cinema ci;
    CinemaService cs;
    Hall ha;
    HallService hs;
    Movie mo;
    MovieService ms= new MovieServiceImpl();
    Ticket ti;
    TicketService ts;
    User u;
    UserService us;
    double money;
    Session se;
    SessionService ss;
    List<Integer> seatlist;
    int usertype;

    
    P5(Cinema ci, Movie mo, Session se, Hall ha, List<Integer> seatlist, Double money, User u, Ticket ti) {
        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/主界面/背景.png
        bg = new PCuntu("/PP/导出/主界面/背景.png");
        jp4_1 = new PCuntu(mo.getmPicaddress());
        mbuy = new PCuntu("/PP/导出/主界面/分组 4 copy.png");
        mName3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mGrade2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        wan = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new PCuntu("/PP/导出/选座位/矩形复制 2.png");
        intro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        D3 = new javax.swing.JLabel();
        IMAX3D = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        
        this.ci = ci;
        this.mo = mo;
        this.se = se;
        this.ha = ha;
        this.seatlist = seatlist;
        this.money = money;
        this.u = u;
        this.ti = ti;
        GUI5();
        
    }

    private void GUI5() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1120, 630));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        setPreferredSize(new java.awt.Dimension(1120, 630));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        bg.setBackground(new java.awt.Color(204, 204, 255));
        bg.setMaximumSize(new java.awt.Dimension(1120, 630));
        bg.setMinimumSize(new java.awt.Dimension(1120, 630));
        bg.setPreferredSize(new java.awt.Dimension(1120, 630));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp4_1.setBackground(new java.awt.Color(204, 255, 204));
        jp4_1.setBorder(new RoundBorder_30rf());

        mbuy.setOpaque(false);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(mbuy);
        mbuy.setLayout(jPanel1Layout);
        mbuy.addMouseListener(this);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 176, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 67, Short.MAX_VALUE));

        javax.swing.GroupLayout jp4_1Layout = new javax.swing.GroupLayout(jp4_1);
        jp4_1.setLayout(jp4_1Layout);
        jp4_1Layout.setHorizontalGroup(
                jp4_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jp4_1Layout.createSequentialGroup().addGap(88, 88, 88).addComponent(mbuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(86, Short.MAX_VALUE)));
        jp4_1Layout.setVerticalGroup(
                jp4_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4_1Layout.createSequentialGroup().addContainerGap(389, Short.MAX_VALUE).addComponent(mbuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(24, 24, 24)));

        bg.add(jp4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 350, 480));

        mName3.setFont(new java.awt.Font("微软雅黑", 1, 35)); // NOI18N
        mName3.setForeground(new java.awt.Color(255, 255, 255));
        mName3.setText(mo.getmName());
        bg.add(mName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 290, 60));

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(mo.getMlocality());
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 350, -1));

        mGrade2.setFont(new java.awt.Font("微软雅黑", 1, 36)); // NOI18N
        mGrade2.setForeground(new java.awt.Color(255, 255, 255));
        mGrade2.setText("" + mo.getmGrade());
        bg.add(mGrade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, 40));

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("综合评分");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 80, 30));

        Pre.setFont(new java.awt.Font("微软雅黑", 1, 36)); // NOI18N
        Pre.setForeground(new java.awt.Color(255, 255, 255));
        Pre.setText("98%");
        bg.add(Pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, 40));

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("推荐指数");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 80, 30));

        wan.setFont(new java.awt.Font("微软雅黑", 1, 36)); // NOI18N
        wan.setForeground(new java.awt.Color(255, 255, 255));
        wan.setText("19.7");
        bg.add(wan, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 80, 40));

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("万人已看");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, -1, 30));

        back.setFont(new java.awt.Font("微软雅黑", 1, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("<");
        back.addMouseListener(this);
        bg.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.setOpaque(false);

        intro.setFont(new java.awt.Font("微软雅黑", 1, 23)); // NOI18N
        intro.setForeground(new java.awt.Color(228, 224, 224));
        intro.setText("剧情简介：");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setOpaque(false);
        jTextArea1.setText(mo.getmDetail());
        jTextArea1.setLineWrap(true);        //激活自动换行功能 
        jTextArea1.setWrapStyleWord(true);            // 激活断行不断字功能
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(intro)).addContainerGap(26, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(intro).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(75, Short.MAX_VALUE)));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 530, 290));

        D3.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        if (mo.getmType().equals("3D")) {
            System.out.println("1");
            D3.setForeground(new java.awt.Color(238, 234, 234));
        } else {
            System.out.println("2");
            D3.setForeground(new java.awt.Color(153, 153, 153));
        }
        //D3.setForeground(new java.awt.Color(235, 231, 231));
        D3.setText("   3D  ");
        D3.setBorder(new RoundBorder_10rf_white());
        bg.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 50, 30));

        IMAX3D.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        if (mo.getmType().equals("IMAX3D")) {
            IMAX3D.setForeground(new java.awt.Color(238, 234, 234));
        } else {
            IMAX3D.setForeground(new java.awt.Color(153, 153, 153));
        }
        //IMAX3D.setForeground(new java.awt.Color(232, 230, 230));
        IMAX3D.setText("   IMAX3D");
        IMAX3D.setBorder(new RoundBorder_10rf_white());
        bg.add(IMAX3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 90, 30));

        D4.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        if (mo.getmType().equals("2D")) {
            D4.setForeground(new java.awt.Color(238, 234, 234));
        } else {
            D4.setForeground(new java.awt.Color(153, 153, 153));
        }
        //D4.setForeground(new java.awt.Color(230, 225, 225));
        D4.setText("   2D");
        D4.setBorder(new RoundBorder_10rf_white());
        bg.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 50, 30));
        getContentPane().add(bg, "card2");

        pack();
    }
                                 

    private void fillTable(List<Movie> movielist2)
    {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        Object a = e.getSource();
        if (a == back) {
          new P4(null, mo, null, null, null, money, null, null).setVisible(true);
           this.dispose();
        } 
        if (a == mbuy) {
            if ("即将上映".equals(mo.getmshow())) {
                JOptionPane.showMessageDialog(null, "该电影还未上映");
            } else {
              new P6(ci, mo, se, ha, seatlist, money, u, ti).setVisible(true);
                dispose();
              
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //    throw new UnsupportedOperationException("Not supported yet.");
    }

}
