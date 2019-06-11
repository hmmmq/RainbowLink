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
import com.fancy.service.impl.UserServiceImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author hmqhmq
 */
public class P16 extends JFrame implements ActionListener, MouseListener {

    Cinema ci;
    CinemaService cs;
    Hall ha;
    HallService hs;
    Movie mo;
    MovieService ms;
    Ticket ti;
    TicketService ts;
    User u;
    UserService us = new UserServiceImpl();
    double money;
    Session se;
    SessionService ss;
    List<Integer> seatlist;
    int usertype;
    boolean cho = false;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    Toumin t = new Toumin();
    Cuntu c = new Cuntu();
    ZhuanHuan a = new ZhuanHuan();

    P16(Cinema ci, Movie mo, Session se, Hall ha, List<Integer> seatlist, Double money, User u, Ticket ti) {
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
        jPanel1 = new PCuntu("/PP/导出/主界面/背景.png");
        jPanel2 = new javax.swing.JPanel();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new RB_SIC("/PP/导出/登录:注册/编组.png", "/PP/导出/登录:注册/椭圆形.png", 18, 18);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new PCuntu("/PP/导出/登录:注册/矩形.png");
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton2 = new RB_SIC("/PP/导出/登录:注册/分组 4 copy3434复制.png", "/PP/导出/登录:注册/分组 4 csdfopy复制.png", 260, 50);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        t.PToumin(jPanel2);
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("PingFang SC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("创建您的 Rainbow ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 20, 500, 60);

        jLabel2.setFont(new java.awt.Font("PingFang SC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("只需一个Rainbow ID,您即可访问RainbowLink 所有内容。");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 80, 700, 20);

        jRadioButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.select"));
        jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setBorder(null);
        jRadioButton1.setBorderPainted(false);
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setBorderPainted(false);
        jRadioButton1.addActionListener(this);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" 我已阅读《用户协议》和《隐私协议》");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("我有Rainbow ID");

        t.PToumin(jPanel4);

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPasswordField1.setBorder(new EmptyBorder(0, 0, 0, 0));
        jPasswordField1.setFont(new java.awt.Font("PingFang SC", 2, 18)); // NOI18N

        jTextField2.setBorder(new EmptyBorder(0, 0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Malayalam Sangam MN", 2, 24)); // NOI18N
        jTextField2.addActionListener(this);
        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPasswordField1.setBorder(new EmptyBorder(0, 0, 0, 0));
        jPasswordField2.setFont(new java.awt.Font("PingFang SC", 2, 18)); // NOI18N
        jPasswordField2.setBorder(null);
        jPasswordField2.addActionListener(this);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addComponent(jPasswordField2)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<");
        jLabel7.addMouseListener(this);

        jRadioButton2.addActionListener(this);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(211, 211, 211)
                                                .addComponent(jRadioButton1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(118, 118, 118)
                                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(405, 405, 405)
                                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(236, 236, 236)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(217, 217, 217)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(125, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        ///PP/导出/主界面/背景.png

        pack();
    }

    public static void main(String abc[]) {
        ArrayList<Integer> seatlist = new ArrayList<>();
        seatlist.add(11);
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
        u = us.queryUserByid(2);

        P16 p = new P16(ci, mo, se, ha, seatlist, 90d, null, null);
        p.setVisible(true);
        //s,h,c,m,13,8,2,16
        //2212
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (jRadioButton2 == obj && cho) {
            System.out.println("--1");
            String username = jTextField2.getText();
            System.out.println("--2");
            String pass1 = new String(jPasswordField1.getPassword());
            System.out.println("--3");
            String pass2 = new String(jPasswordField2.getPassword());
            System.out.println("--4");
            Verify a = new Verify();
            int type = 0;
            if (!a.checkusername(username)) {
                System.out.println("==5");
                if (!a.checkpassword(jPasswordField1.getPassword())) {
                    System.out.println("--6");
                    if (!a.checkpassword(jPasswordField2.getPassword())) {
                        System.out.println("--7");
                        if (pass1.equals(pass2)) {
                            System.out.println("--8");
                            u = new User(username, pass1, 0d, 0);
                            System.out.println("--9");
                            int r = us.register(u);//jLabel2.setText("注册成功！");
                            System.out.println("--10");
                            if (r == 3) {
                                jLabel2.setText("The user name already exits！please try again！");
                                
                            } else if (r == 1) {
                                jLabel2.setText("registered successfully！");
                                P18 p = new P18(ci, mo, se, ha, seatlist, money, u, null);
                                p.setVisible(true);
                                this.dispose();
                            } else {
                                jLabel2.setText("Systerm error！please try again！");
                            }
                        } else {
                            jLabel2.setText("Password mismatched！Please try again！");
                        }

                    } else {
                        jLabel2.setText(" User Password must at least one letter，the total amount between 6 to 10！");
                    }

                } else {
                    jLabel2.setText("   User Password must at least one letter，the total amount between 6 to 10！");
                }

            } else {
                jLabel2.setText("Username can not begin with number or letter 'a'!Please try again!");
            }

        }
        if (obj == jRadioButton1) {
            cho = true;
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if (jLabel7 == obj) {//返回上一级。
            P14 p = new P14(ci, mo, se, ha, seatlist, money, null, null);
        } else if (jLabel4 == obj) {//我有rainbowid 
            P14 p = new P14(ci, mo, se, ha, seatlist, money, null, null);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
