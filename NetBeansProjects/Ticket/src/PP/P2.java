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
import com.fancy.service.impl.CinemaServiceImpl;
import com.fancy.service.impl.HallServiceImpl;
import com.fancy.service.impl.MovieServiceImpl;
import com.fancy.service.impl.SessionServiceImpl;
import com.fancy.service.impl.TicketServiceImpl;
import com.fancy.service.impl.UserServiceImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class P2 extends javax.swing.JFrame implements ActionListener, MouseListener {

    // Variables declaration - do not modify
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel IMAX;
    private javax.swing.JLabel future;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mName;
    private javax.swing.JLabel mdetail;
    private javax.swing.JLabel mhoe;
    private javax.swing.JPanel mposter;
    private javax.swing.JTextField msearch;
    private javax.swing.JLabel next;
    private javax.swing.JLabel now;
    private javax.swing.JButton search;
    private javax.swing.JPanel user;
    private javax.swing.JPanel mbuy;
    // End of variables declaration
    Cinema ci;
    CinemaService cs;
    Hall ha;
    HallService hs;
    Movie mo;
    Ticket ti;
    TicketService ts;
    User u;
    UserService us;
    double money = 0;
    Session se;
    SessionService ss;
    List<Integer> seatlist;
    int usertype;
    private List<Movie> movielist;
    private MovieService ms = new MovieServiceImpl();
    private ImageIcon moviebg;
    int i = 0;

    public P2(Cinema ci, Movie mo, Session se, Hall ha, List<Integer> seatlist, Double money, User u, Ticket ti) {

        this.movielist = ms.queryAllMovie();
        this.mo = this.movielist.get(i);
        this.se = se;
        this.ha = ha;
        this.seatlist = seatlist;
        this.money = money;
        this.u = u;
        this.ti = ti;
///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/主界面/背景.png
        jPanel1 = new PCuntu("/PP/导出/主界面/背景.png");
        mposter = new PCuntu(this.mo.getmPicaddress());
        user = new PCuntu("/PP/导出/主界面/2323.png");
        mhoe = new javax.swing.JLabel();
        mName = new javax.swing.JLabel();
        mdetail = new javax.swing.JLabel();
        now = new javax.swing.JLabel();
        future = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        IMAX = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        jPanel2 = new PCuntu("/PP/导出/主界面/搜索 copy.png");
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        msearch = new javax.swing.JTextField();
        mbuy = new PCuntu("/PP/导出/主界面/分组 4 copy.png");
        GUI2();
    }

        private void GUI2() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1120, 630));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        setPreferredSize(new java.awt.Dimension(1120, 630));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mposter.setBackground(new java.awt.Color(204, 255, 204));
        mposter.setBorder(new RoundBorder_30rf());
        mposter.addMouseListener(this);
        mposter.setLayout(new java.awt.CardLayout());
        jPanel1.add(mposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 340, 490));

        user.setBackground(new java.awt.Color(204, 255, 204));
        user.setOpaque(false);
        user.addMouseListener(this);

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
                userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 60, Short.MAX_VALUE));
        userLayout.setVerticalGroup(
                userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 60, Short.MAX_VALUE));

        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 480, 60, 60));

        mhoe.setFont(new java.awt.Font("微软雅黑", 1, 47)); // NOI18N
        mhoe.setForeground(new java.awt.Color(255, 255, 255));
        mhoe.setText("Hoe Movie");
        jPanel1.add(mhoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        mName.setFont(new java.awt.Font("宋体", 1, 33)); // NOI18N
        mName.setForeground(new java.awt.Color(255, 255, 255));
        mName.setText(this.mo.getmName());
        jPanel1.add(mName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        mdetail.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        mdetail.setForeground(new java.awt.Color(255, 255, 255));
        mdetail.setText(this.mo.getmActor());
        jPanel1.add(mdetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        now.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        if (mo.getmshow().equals("正在热映")) {
            now.setForeground(new java.awt.Color(255, 255, 255));
        } else {
            now.setForeground(new java.awt.Color(153, 153, 153));
        }
        //now.setForeground(new java.awt.Color(255, 255, 255));
        now.setText("正在热映");
        jPanel1.add(now, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        future.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        if (mo.getmshow().equals("即将上映")) {
            future.setForeground(new java.awt.Color(255, 255, 255));
        } else {
            future.setForeground(new java.awt.Color(153, 153, 153));
        }
        //future.setForeground(new java.awt.Color(228, 221, 221));
        future.setText("即将上映");
        jPanel1.add(future, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        next.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        next.setForeground(new java.awt.Color(241, 240, 240));
        next.setText("下一个>");
        next.addMouseListener(this);
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, -1, -1));

        D3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        if (mo.getmType().equals("3D")) {
            D3.setForeground(new java.awt.Color(238, 234, 234));
        } else {
            D3.setForeground(new java.awt.Color(153, 153, 153));
        }
        D3.setText("   3D");
        D3.setBorder(new RoundBorder_10rf_white());
        jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 40, 30));

        IMAX.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        //IMAX.setForeground(new java.awt.Color(238, 234, 234));
        if (mo.getmType().equals("IMAX3D")) {
            IMAX.setForeground(new java.awt.Color(238, 234, 234));
        } else {
            IMAX.setForeground(new java.awt.Color(153, 153, 153));
        }
        IMAX.setText("   IMAX3D");
        IMAX.setBorder(new RoundBorder_10rf_white());
        jPanel1.add(IMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 80, 30));

        D4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        if (mo.getmType().equals("2D")) {
            D4.setForeground(new java.awt.Color(238, 234, 234));
        } else {
            D4.setForeground(new java.awt.Color(153, 153, 153));
        }
        //D4.setForeground(new java.awt.Color(153, 153, 153));
        D4.setText("    2D");
        D4.setBorder(new RoundBorder_10rf_white());
        jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 50, 30));

        jPanel2.setOpaque(false);

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        search.setForeground(new java.awt.Color(235, 231, 231));
        search.setText("搜索");
        search.setBorder(null);
        search.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("海口");

        msearch.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        msearch.setForeground(new java.awt.Color(255, 255, 255));
        msearch.setBorder(null);
        msearch.setCaretColor(new java.awt.Color(250, 246, 246));
        msearch.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        msearch.setOpaque(false);
        msearch.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(54, 54, 54).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE).addComponent(msearch, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(search).addGap(22, 22, 22)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(msearch).addGap(2, 2, 2)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(search).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(12, 12, 12)));

        JBToumin(search);
        search.addActionListener(this);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 600, 60));

        mbuy.setBackground(new java.awt.Color(204, 255, 204));
        mbuy.setOpaque(false);
        mbuy.addMouseListener(this);

        javax.swing.GroupLayout user1Layout = new javax.swing.GroupLayout(mbuy);
        mbuy.setLayout(user1Layout);
        user1Layout.setHorizontalGroup(
                user1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 190, Short.MAX_VALUE));
        user1Layout.setVerticalGroup(
                user1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 70, Short.MAX_VALUE));

        jPanel1.add(mbuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 190, 70));

        getContentPane().add(jPanel1, "card2");

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
        P2 p = new P2(ci, mo, se, ha, null, 0d, u, null);
        p.setVisible(true);
        //s,h,c,m,13,8,2,16
        //2212
    }
    
    
    public void JBToumin(JButton b) {
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
    }

  
    @Override
    public void actionPerformed(ActionEvent e) {

        Object a = e.getSource();

        if (a == search) {
            String m = msearch.getText();
            boolean flag = false;
            /*
             * Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$"); return
             * pattern.matcher(str).matches();
             */

            Pattern p = Pattern.compile("^[-\\+]?[\\d]*$");
            Matcher q = p.matcher(m);
            if (q.matches()) {
                flag = true;
            }
            if (flag) {

                int id = Integer.parseInt(m);
                mo = ms.queryMovieById(id);

                  //重写上映情况、电影类型。
                now.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
                if ("正在热映".equals(mo.getmshow())) {
                    now.setForeground(new java.awt.Color(255, 255, 255));

                } else {
                    now.setForeground(new java.awt.Color(153, 153, 153));
                }
                //now.setForeground(new java.awt.Color(255, 255, 255));
                now.setText("正在热映");
                jPanel1.add(now, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

                future.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
                if ("即将上映".equals(mo.getmshow())) {
                    System.out.println("1");
                    future.setForeground(new java.awt.Color(255, 255, 255));
                } else {
                    future.setForeground(new java.awt.Color(153, 153, 153));
                }
                //future.setForeground(new java.awt.Color(228, 221, 221));
                future.setText("即将上映");
                jPanel1.add(future, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

                next.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
                next.setForeground(new java.awt.Color(241, 240, 240));
                next.setText("下一个>");
                next.addMouseListener(this);
                jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, -1, -1));

                D3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
                if (mo.getmType().equals("3D")) {
                    D3.setForeground(new java.awt.Color(238, 234, 234));
                } else {
                    D3.setForeground(new java.awt.Color(153, 153, 153));
                }
                D3.setText("   3D");
                D3.setBorder(new RoundBorder_10rf_white());
                jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 40, 30));

                IMAX.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
                //IMAX.setForeground(new java.awt.Color(238, 234, 234));
                if (mo.getmType().equals("IMAX3D")) {
                    IMAX.setForeground(new java.awt.Color(238, 234, 234));
                } else {
                    IMAX.setForeground(new java.awt.Color(153, 153, 153));
                }
                IMAX.setText("   IMAX3D");
                IMAX.setBorder(new RoundBorder_10rf_white());
                jPanel1.add(IMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 80, 30));

                D4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
                if (mo.getmType().equals("2D")) {
                    D4.setForeground(new java.awt.Color(238, 234, 234));
                } else {
                    D4.setForeground(new java.awt.Color(153, 153, 153));
                }
                //D4.setForeground(new java.awt.Color(153, 153, 153));
                D4.setText("    2D");
                D4.setBorder(new RoundBorder_10rf_white());
                jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 50, 30));


                //重新输入电影名称
                mName.setText(mo.getmName());
                //重新输入电影的演员表
                mdetail.setText(mo.getmActor());
                //重新输入电影海报
                jPanel1.remove(mposter);
                mposter = new PCuntu(mo.getmPicaddress());
                mposter.addMouseListener(this);
                mposter.setBorder(new RoundBorder_30rf());
                mposter.setBackground(new java.awt.Color(204, 255, 204));
                mposter.setLayout(new java.awt.CardLayout());
                jPanel1.add(mposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 340, 490));

            } else {

                mo = ms.queryMovieByName(m);

                if (mo == null) {
                    JOptionPane.showMessageDialog(null, "不存在该电影或输入正确的电影名称或ID");
                } else {

                    //重写上映情况、电影类型。
                    now.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
                    if ("正在热映".equals(mo.getmshow())) {
                        now.setForeground(new java.awt.Color(255, 255, 255));

                    } else {
                        now.setForeground(new java.awt.Color(153, 153, 153));
                    }
                    //now.setForeground(new java.awt.Color(255, 255, 255));
                    now.setText("正在热映");
                    jPanel1.add(now, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

                    future.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
                    if ("即将上映".equals(mo.getmshow())) {
                        System.out.println("1");
                        future.setForeground(new java.awt.Color(255, 255, 255));
                    } else {
                        future.setForeground(new java.awt.Color(153, 153, 153));
                    }
                    //future.setForeground(new java.awt.Color(228, 221, 221));
                    future.setText("即将上映");
                    jPanel1.add(future, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

                    next.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
                    next.setForeground(new java.awt.Color(241, 240, 240));
                    next.setText("下一个>");
                    next.addMouseListener(this);
                    jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, -1, -1));

                    D3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
                    if (mo.getmType().equals("3D")) {
                        D3.setForeground(new java.awt.Color(238, 234, 234));
                    } else {
                        D3.setForeground(new java.awt.Color(153, 153, 153));
                    }
                    D3.setText("   3D");
                    D3.setBorder(new RoundBorder_10rf_white());
                    jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 40, 30));

                    IMAX.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
                    //IMAX.setForeground(new java.awt.Color(238, 234, 234));
                    if (mo.getmType().equals("IMAX3D")) {
                        IMAX.setForeground(new java.awt.Color(238, 234, 234));
                    } else {
                        IMAX.setForeground(new java.awt.Color(153, 153, 153));
                    }
                    IMAX.setText("   IMAX3D");
                    IMAX.setBorder(new RoundBorder_10rf_white());
                    jPanel1.add(IMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 80, 30));

                    D4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
                    if (mo.getmType().equals("2D")) {
                        D4.setForeground(new java.awt.Color(238, 234, 234));
                    } else {
                        D4.setForeground(new java.awt.Color(153, 153, 153));
                    }
                    //D4.setForeground(new java.awt.Color(153, 153, 153));
                    D4.setText("    2D");
                    D4.setBorder(new RoundBorder_10rf_white());
                    jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 50, 30));




                    //重新输入电影名称
                    mName.setText(mo.getmName());
                    //重新输入电影的演员表
                    mdetail.setText(mo.getmActor());
                    //重新输入电影海报
                    jPanel1.remove(mposter);
                    mposter = new PCuntu(mo.getmPicaddress());
                    mposter.addMouseListener(this);
                    mposter.setBorder(new RoundBorder_30rf());
                    mposter.setBackground(new java.awt.Color(204, 255, 204));
                    mposter.setLayout(new java.awt.CardLayout());
                    jPanel1.add(mposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 340, 490));
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        Object c = e.getSource();

        if (c == next) {
            ++i;
            int movieRow=movielist.size();
            if (i > movieRow) {
                i = 0;
            }
            this.setVisible(true);

            this.mo = this.movielist.get(i);

              //重写上映情况、电影类型。
            now.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            if ("正在热映".equals(mo.getmshow())) {
                now.setForeground(new java.awt.Color(255, 255, 255));

            } else {
                now.setForeground(new java.awt.Color(153, 153, 153));
            }
            //now.setForeground(new java.awt.Color(255, 255, 255));
            now.setText("正在热映");
            jPanel1.add(now, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

            future.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            if ("即将上映".equals(mo.getmshow())) {
                System.out.println("1");
                future.setForeground(new java.awt.Color(255, 255, 255));
            } else {
                future.setForeground(new java.awt.Color(153, 153, 153));
            }
            //future.setForeground(new java.awt.Color(228, 221, 221));
            future.setText("即将上映");
            jPanel1.add(future, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

            next.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            next.setForeground(new java.awt.Color(241, 240, 240));
            next.setText("下一个>");
            next.addMouseListener(this);
            jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, -1, -1));

            D3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
            if (mo.getmType().equals("3D")) {
                D3.setForeground(new java.awt.Color(238, 234, 234));
            } else {
                D3.setForeground(new java.awt.Color(153, 153, 153));
            }
            D3.setText("   3D");
            D3.setBorder(new RoundBorder_10rf_white());
            jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 40, 30));

            IMAX.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
            //IMAX.setForeground(new java.awt.Color(238, 234, 234));
            if (mo.getmType().equals("IMAX3D")) {
                IMAX.setForeground(new java.awt.Color(238, 234, 234));
            } else {
                IMAX.setForeground(new java.awt.Color(153, 153, 153));
            }
            IMAX.setText("   IMAX3D");
            IMAX.setBorder(new RoundBorder_10rf_white());
            jPanel1.add(IMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 80, 30));

            D4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
            if (mo.getmType().equals("4D")) {
                D4.setForeground(new java.awt.Color(238, 234, 234));
            } else {
                D4.setForeground(new java.awt.Color(153, 153, 153));
            }
            //D4.setForeground(new java.awt.Color(153, 153, 153));
            D4.setText("    2D");
            D4.setBorder(new RoundBorder_10rf_white());
            jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 50, 30));


            //重新输入电影名称
            mName.setText(mo.getmName());
            //重新输入电影的演员表
            mdetail.setText(mo.getmActor());
            //重新输入电影海报
            jPanel1.remove(mposter);
            mposter = new PCuntu(mo.getmPicaddress());
            mposter.addMouseListener(this);
            mposter.setBorder(new RoundBorder_30rf());
            mposter.setBackground(new java.awt.Color(204, 255, 204));
            mposter.setLayout(new java.awt.CardLayout());
            jPanel1.add(mposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 340, 490));
        }
        if (c == mposter) {

            new P4(null, mo, null, null, null, money, null, null).setVisible(true);
            this.dispose();
        }
        if (c == user) {
            dispose();
        }
        if (c == mbuy) {
            if ("即将上映".equals(mo.getmshow())) {
                JOptionPane.showMessageDialog(null, "该电影还未上映");
            } else {
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
//        throw new UnsupportedOperationException("Not supported yet.");
    }
//   
//    public static void main(String args[]) {
//       
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                new J2().setVisible(true);
//            }
//        });
//    }
}