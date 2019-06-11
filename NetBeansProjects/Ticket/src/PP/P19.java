
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hmqhmq
 */
public class P19 extends JFrame implements ActionListener, MouseListener, KeyListener {

    Cinema ci;
    CinemaService cs;
    Hall ha;
    HallService hs;
    Movie mo;
    MovieService ms;
    Ticket ti;
    TicketService ts = new TicketServiceImpl();
    User u;
    UserService us = new UserServiceImpl();
    double money;
    Session se;
    SessionService ss = new SessionServiceImpl();
    List<Integer> seatlist;
    int usertype;
    int row;//第几排
    private StringBuffer sb = new StringBuffer();
    Toumin t = new Toumin();
    Cuntu c = new Cuntu();
    ZhuanHuan z;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    //private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;

    P19(Cinema ci, Movie mo, Session se, Hall ha, List<Integer> seatlist, Double money, User u, Ticket ti) {
        this.ci = ci;
        this.mo = mo;
        this.se = se;
        this.ha = ha;
        this.seatlist = seatlist;
        this.mo = mo;
        this.money = money;
        this.u = u;
        this.ti = ti;
        GUI();
    }

    public void GUI() {

        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new PCuntu("/PP/导出/支付方式/支付方式2/矩形复制 3.png");
        jLabel14 = new javax.swing.JLabel();
        //jPasswordField1 = new javax.swing.JPasswordField();
        jOptionPane1 = new javax.swing.JOptionPane();
        //    /PP/导出/主界面/背景2.png
        jPanel11 = new PCuntu("/PP/导出/主界面/背景.png");
        jLabel20 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPanel1 = new PCuntu("/PP/导出/主界面/背景.png");
        //new PCuntu("/PP/导出/更详情2/矩形复制 2.png")
        jPanel2 = new PCuntu("/PP/导出/选时间/矩形复制 2@3x.png");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel16.setText("取消");
        if (mo.getmType().charAt(0) == '3') {

            jLabel11.setText("  3D");
            jLabel12.setText("            ");
            jLabel13.setText("     ");
        }

        if (mo.getmType().charAt(0) == 'I') {
            jLabel12.setText("    IMAX3D");
            jLabel11.setText("    ");

            jLabel13.setText("     ");
        }

        if (mo.getmType().charAt(0) == '2') {
            jLabel13.setText("  2D");
            jLabel12.setText("          ");
            jLabel11.setText("    ");

        }
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new PCuntu("/PP/导出/主界面/背景.png");
        jPanel7.setOpaque(true);
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new PCuntu("/PP/导出/选时间/矩形复制 2@3x.png");

        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(17, 120, 190, 20);
        jButton2.setIcon(c.cuntu("/PP/导出/支付方式/支付方式2/编组 4.png", 190, 20));

        t.JBToumin(jButton2);
        jButton2.addActionListener(this);

        jButton4 = new javax.swing.JButton();
        jButton4.setIcon(c.cuntu("/PP/导出/支付方式/支付方式2/编组 3.png", 220, 41));
        jButton4.addActionListener(this);
        t.JBToumin(jButton4);
        jPanel5.add(jButton4);
        jButton4.setBounds(0, 60, 220, 41);
        jButton3 = new javax.swing.JButton();
        jButton3.setIcon(c.cuntu("/PP/导出/支付方式/支付方式2/编组.png", 220, 41
        ));
        jButton3.addActionListener(this);
        t.JBToumin(jButton3);
        jPanel5.add(jButton3);
        jButton3.setBounds(0, 10, 220, 41);
        jPanel3.setBackground(new java.awt.Color(51, 51, 0));
        jPanel3.setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        t.PToumin(jPanel1);

        jLabel14.setFont(new java.awt.Font("PingFang SC", 1, 70)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("请输入支付密码");

        //jPasswordField2.addMouseListener(this);
        //jPasswordField1.addActionListener(this);
        jPasswordField2.addKeyListener(this);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(332, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(298, 298, 298))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addContainerGap(367, Short.MAX_VALUE)
                                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(319, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel14)
                                .addContainerGap(398, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addContainerGap(254, Short.MAX_VALUE)
                                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(304, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel6);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(jLabel16)
                                .addContainerGap(308, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(61, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel16)
                                .addGap(93, 93, 93))
        );

        // t.PToumin(jPanel7);
        //t.PToumin(jPanel11);
        jPanel11.setBounds(new java.awt.Rectangle(0, 0, 1120, 630));

        jLabel20.setFont(new java.awt.Font("PingFang SC", 1, 70)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("请输入支付密码");

        jPasswordField2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jPasswordField2.setBorder(new RoundBorder_30rf());
        jPasswordField2.addActionListener(this);
        jPasswordField2.addKeyListener(this);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addContainerGap(332, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20))
                                .addGap(290, 290, 290))
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel20)
                                .addGap(79, 79, 79)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(233, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(1120, 630));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(null);

        t.PToumin(jPanel2);
        jPanel2.setBorder(new PP.RoundBorder_30r());
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("PingFang SC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("确认订单");

        jLabel2.setFont(new java.awt.Font("PingFang SC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                 " + mo.getmName());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setText(ci.getCname());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(se.getBeginTime() + " 时长:" + mo.getmDuration());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(ha.gethName());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(mo.getmType() + "/" + mo.getMlanguage());

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        for (int seat : seatlist) {
            if (seat >= 0 && seat <= 11) {
                row = 1;
            } else if (seat > 11 && seat <= 24) {
                row = 2;
            } else if (seat > 24 && seat <= 39) {
                row = 3;
            } else if (seat > 39) {
                row = (seat - 39) % 13 + 2;
            } else {
                row = 0;
            }
            sb.append(row + "排" + seat + "座" + " ");

        }
        jLabel7.setText("   " + sb + " ");
        jLabel7.setBorder(new PP.RoundBorder_30r());
        jLabel7.setEnabled(false);
        jLabel7.setFocusTraversalKeysEnabled(false);
        jLabel7.setFocusable(false);
        jLabel7.setInheritsPopupMenu(false);
        jLabel7.setRequestFocusEnabled(false);
        jLabel7.setVerifyInputWhenFocusTarget(false);
        //
        //.setSize(280, 40);
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(mo.getMlocality());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        if (mo.getmType() == "3D") {
            jLabel11.setText("  3D");
        }

        jLabel11.setBorder(new PP.RoundBorder_10r());

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        if (mo.getmType() == "IMAX3D") {
            jLabel12.setText("    IMAX3D");
        }
        jLabel12.setBorder(new PP.RoundBorder_10r());

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        if (mo.getmType() == "2D") {
            jLabel13.setText("  2D");
        }
        jLabel13.setBorder(new PP.RoundBorder_10r());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel6))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel13))
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE))
        );

        // t.PToumin(jPanel7);
        //.setIcon(c.cuntu("/PP/导出/支付方式/微信支付.jpg", 300, 400));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(160, 50, 290, 520);

        t.PToumin(jPanel4);
        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("PT Sans", 1, 80)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(money + ""
                + "元");

        jPanel4.add(jLabel8);
        jLabel8.setBounds(45, 5, 260,
                104);

        jLabel9.setFont(new java.awt.Font("PingFang SC", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("       请选择支付方式");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(48, 140, 200, 27);

        t.PToumin(jPanel5);
        jPanel5.setBorder(new RoundBorder_30r());
        jPanel5.setLayout(null);
///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/支付方式/支付方式2/编组 4.png

        jPanel5.add(jButton2);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(50, 220, 230, 150);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(670, 110, 340, 440);

        getContentPane().add(jPanel1);

        pack();

    }

    public static void main(String abc[]) {
        ArrayList<Integer> seatlist = new ArrayList<>();
        seatlist.add(10);
        seatlist.add(20);
        Cinema ci = new Cinema();
        Hall ha = new Hall();
        Session se = new Session();
        Movie mo = new Movie();
        User u = new User();
        UserService us = new UserServiceImpl();

        CinemaService cs = new CinemaServiceImpl();
        HallService hs = new HallServiceImpl();
        SessionService ss = new SessionServiceImpl();
        MovieService ms = new MovieServiceImpl();
        se = ss.querySessionById(2);
        ha = hs.queryHallById(2);
        ci = cs.queryCinemaById(1);
        mo = ms.queryMovieById(2);
        u = us.queryUserByid(7);
        P19 p = new P19(ci, mo, se, ha, seatlist, 90d, u, null);
        p.setVisible(true);

        //s,h,c,m,13,8,2,16
        //2212
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();      // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (o == jButton3) {
           // this.remove(jPanel7);
              this.setLayout(null);
              jPanel11.setBounds(jPanel1.getBounds());
              this.add(jPanel11);
            this.setVisible(true);
        }
        if (o == jButton4)//weixin
        {
            jLabel17.setBounds(360, 115, 300, 400);
            jLabel17.setIcon(c.cuntu("/PP/导出/支付方式/微信支付.jpg", 300, 400));
            jPanel7.setBounds(jPanel1.getBounds());
            jPanel7.setLayout(null);
            jPanel1.remove(jPanel11);
            this.setLayout(null);
            this.add(jPanel7);
            this.setVisible(true);
        }
        if (o == jButton2)//zhifubao
        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/支付方式/支付宝支付.jpg
        {
            jLabel17.setBounds(360, 115, 300, 400);
            jLabel17.setIcon(c.cuntu("/PP/导出/支付方式/支付宝支付.jpg", 300, 400));
            jPanel7.setBounds(jPanel1.getBounds());
            jPanel7.setLayout(null);
             jPanel1.remove(jPanel11);
            this.setLayout(null);
            this.add(jPanel7);
            this.setVisible(true);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object o = e.getSource();
        if (o == jPasswordField2) {
            int key = e.getKeyCode();
            if (key == '\n') {
                System.out.println("enter -1");
                String s = new String(jPasswordField2.getPassword());
                if (u != null) {
                    System.out.println("enter -2");
                    if (u.getBalance() >= money) {
                        try {
                            System.out.println("enter -3");
                            for (Integer seat : seatlist) {
                                System.out.println("--4");
                                Ticket t = new Ticket(u.getUid(), se.getsId(), seat);
                                System.out.println("4-5");
                                ts.addTicket(t);
                            }
                            System.out.println("--5");
                            double remoney = u.getBalance() - money;
                            System.out.println("--6");
                            u.setBalance(u.getBalance() - money);

                            if (us.updateUser(u)) {

                                se.setRemain(se.getRemain() - seatlist.size());
                                ss.updateSession(se);

                            }
                            System.out.println("--9");
                            P21 p = new P21(ci, mo, se, ha, seatlist, money, u, null);
                            p.setVisible(true);
                            this.dispose();
                        } catch (Exception ex) {
                            Logger.getLogger(P19.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Balance insufficient!");
                        new P19(ci, mo, se, ha, seatlist, money, u, ti).setVisible(true);
                        int i = JOptionPane.showConfirmDialog(null, "是否返回?", null, JOptionPane.YES_NO_CANCEL_OPTION);
                        if (i == JOptionPane.YES_OPTION) {
                            P2 P = new P2(ci, mo, se, ha, seatlist, money, u, ti);
                            P.setVisible(true);
                            this.dispose();
                        }
                    }

                }
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
