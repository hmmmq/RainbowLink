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
//import com.zyp.view.BuyTicketUi;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class P11 extends JFrame implements ActionListener {

    private Hall ha;
    private Cinema ci;
    private CinemaService cs;
    private Session se;
    private Movie mo;
    private User u;
    private Ticket ti;
    private List<Integer> seatlist = new ArrayList<Integer>();
    private List<Ticket> list;
    private UserService userservice = new UserServiceImpl();
    private SessionService sessionservice = new SessionServiceImpl();
    private TicketService ticketService = new TicketServiceImpl();
    private StringBuffer sb = new StringBuffer();
    JRadioButton[] jRadioButton;
    private static int count = 0;
    int num, rows;
    double money=1d;
    Toumin t = new Toumin();
    ZhuanHuan z = new ZhuanHuan();
    Cuntu c = new Cuntu();

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;

    P11(Cinema ci, Movie mo, Session se, Hall ha, List<Integer> seatlist, Double money, User u, Ticket ti) {

        this.ci = ci;
        this.mo = mo;
        this.se = se;
        this.ha = ha;
        this.list = list;
        //this.seatlist = (ArrayList<Integer>) seatlist;
        this.mo = mo;
        this.money = money;
        this.u = u;
        this.ti = ti;
        list = ticketService.queryAllTicket();
        num = ha.getCapacity();
        int rows = (num + 9) / 10;
        jRadioButton = new JRadioButton[num];
        jPanel1 = new PCuntu("/PP/导出/主界面/背景.png");
        jButton1 = new javax.swing.JButton();

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new PCuntu("/PP/导出/选座位/矩形复制 2.png");
        jPanel3 = new PCuntu("/PP/导出/选座位/矩形复制 2.png");
         
        //jRadioButton1 = new RB_SIC("/PP/导出/选座位/编组 2.png", "/PP/导出/选座位/可选座位.png", 18, 18);

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        
        //jTextField1.setBorder(new RoundBorder_10r());
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        t.JBToumin(jButton1);
        //jButton1.setText(ha.gethName());
        jButton1.addActionListener(this);;
        
        jLabel1.setIcon(c.cuntu(mo.getmPicaddress(), 313, 448));
        //jLabel1.setText("jLabel1");
        jLabel1.setBorder(new RoundBorder_30r());
        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/编组_1.png

//        jPanel2.setBackground(null);
//        jPanel2.setOpaque(false);
//        jPanel2.setLayout(null);
        // jRadioButton1.setText("jRadioButton1");
        //jPanel2.add(jRadioButton1);
        //   jLabel2.setIcon(c.cuntu(mo.getmPicaddress(), jLabel2.getWidth(), jLabel2.getHeight()));//放图标
        //jLabel2.setText("已选，可选，已售");
        jButton2.setText("选择您心仪的座位");
        jButton2.addActionListener(this);
        jButton2.setBorder(new RoundBorder_10r());
        
        jTextField1 = new JTextField();
         jTextField1.setForeground(Color.white);
         jTextField1.setText("暂无选座信息");
        jTextField1.setOpaque(false);
       
        //jTextField1.setText("暂无座位信息");
        GUI();

    }

    public void GUI() {
        Toumin a = new Toumin();
        jPanel3 = new PCuntu("/PP/导出/选座位/矩形复制 2.png");
       // a.PToumin(jPanel3);
        jPanel4 = new PCuntu("/PP/导出/登录:注册/矩形22.png");
     
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new PCuntu("/PP/导出/主界面/背景.png");
        //jButton1 = new javax.swing.JButton();
        jButton1.setEnabled(true);
        //jButton1.setSize(166, 43);
        // = new javax.swing.JLabel();
        //矩形复制 2.png
        jPanel2 = new PCuntu("/PP/导出/选座位/矩形复制 2.png");
        //jRadioButton1 = new RB_SIC("/PP/导出/选座位/可选座位.png", "/PP/导出/选座位/编组 2复制 28.png", 18, 18);
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        //jTextField1 = new javax.swing.JTextField();
        
        jPanel3.setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        //a.PToumin(jPanel3);

        jPanel4.setBorder(new RoundBorder_30rf());

        jLabel3.setFont(new java.awt.Font("PingFang TC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("   您尚未登陆，是否登陆？");

        Toumin t3 = new Toumin();
        jButton3.setIcon(c.cuntu("/PP/导出/提示 登录/编组 6.png", 210, 53));
        t3.JBToumin(jButton3);
        jButton3.setText(null);
        jButton3.setEnabled(true);
        jButton3.addActionListener(this);

        jButton4.setIcon(c.cuntu("/PP/导出/提示 登录/编组 7.png", 210, 53));
        t3.JBToumin(jButton4);
        jButton4.setEnabled(true);
        jButton4.addActionListener(this);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,53, Short.MAX_VALUE))
                                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(336, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(255, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        //jButton1.setForeground(new java.awt.Color(255, 255, 255));
        t.JBToumin(jButton1);
        jButton1.setText(ci.getCname());
        //jButton1.addActionListener(this);

//        jLabel1.setIcon(c.cuntu("/PP/导出/电影票/编组_1.png", 313, 448));
//        jLabel1.setText("jLabel1");
//        jLabel1.setBorder(new RoundBorder_30r());
        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/编组_1.png

        t.PToumin(jPanel2);
        jPanel2.setBackground(null);
        jPanel2.setOpaque(false);

//        jRadioButton1.setText("jRadioButton1");
//        jPanel2.add(jRadioButton1);
        for (int i = 0; i < num; i++) {

            jRadioButton[i] = new RB_SIC("/PP/导出/选座位/编组 2.png", "/PP/导出/选座位/可选座位.png", 38, 38);//可选，已选
            //jRadioButton[i].setIcon(c.cuntu("/PP/导出/选座位/可选座位.png", 38, 38));       //("可选座位",18, 18);/Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/选座位/可选座位.png
            //t.JRBToumin(jRadioButton[i]);
            jRadioButton[i].setEnabled(true);
            jRadioButton[i].addActionListener(this);
            jRadioButton[i].setBackground(new Color(225, 225, 225));
            jPanel2.add(jRadioButton[i]);
            //System.out.println("初始化座位，均可选" + i);
        }
        for (Ticket lis : list) {
            for (int i = 0; i < num; i++) {
                if (lis.getSeat() == (i + 1)) {
                    jRadioButton[i].setEnabled(false);
                    jRadioButton[i].setIcon(c.cuntu("/PP/导出/选座位/编组 2复制 28.png", 38, 38));//("已售座位",18, 18);
                    // t.JRBToumin(jRadioButton[i]);
                    //System.out.println("已售座位，不可选" + i);
                }
            }
        }

        jLabel2.setIcon(c.cuntu("/PP/导出/选座位/编组 4复制.png", 554, 46));
        jButton2.setForeground(Color.white);
        jButton2.setText("选择您心仪的座位");
        jButton2.addActionListener(this);
        jButton2.setEnabled(true);
        t.JBToumin(jButton2);

        //jTextField1.setText("暂无选座信息");

       jTextField1.setForeground(new Color(225,225,225));
    jTextField1.setBackground(null);
        jTextField1.setOpaque(false);
        jTextField1.setBorder(null);
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(153, 153, 153)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(179, 179, 179))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(228, 228, 228))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addContainerGap())
        );

        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/<.png
        getContentPane().add(jPanel1);

        pack();
    }
///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/选座位/编组 2复制 28.png

    public void actionPerformed(ActionEvent e) {
      
        Object obj = e.getSource();

        System.out.println("1");
        if (obj == jButton2) {

            jPanel3.setBounds(jPanel1.getBounds());
          
            jPanel1.add(jPanel3);
            this.setVisible(true);
        } else if (obj == jButton4) {//立即登陆
            System.out.println("jb4");
            System.out.println(money + "");
            P14 p2 = new P14(ci, mo, se, ha, seatlist, money, null, null);
            p2.setVisible(true);
            System.out.println("4");
            // this.dispose();
        } else if (obj == jButton3) {//暂不登陆
            System.out.println("jb3");
            P11 p = new P11(ci, mo, se, ha, seatlist, money, null, null);
            p.setVisible(true);
            this.dispose();
            System.out.println("5");
        } else if (obj == jButton1) {//返回上层
            System.out.println("jb1");
            P9 P = new P9(ci, mo, se, ha, null, money, null, null);
            P.setVisible(true);
            this.dispose();
            System.out.println("6");
        } else {
            int l = 0;
            for (int k = 0; k < num; k++) {
                if (obj == jRadioButton[k]) {
                    l = k;
                    break;
                }
                //给出来的都是去掉电影表单座位的button
            }
            System.out.println(l);
            //初始背景都为白色。
            //如果i的背景是红色，文本减少，背景变白色。/PP/导出/选座位/可选座位.png
            //如果i的背景是白色，文本增加，背景变红色。"/PP/导出/选座位/编组 2.png"
            if (jRadioButton[l].getBackground().equals(new Color(225, 225, 225))) {
                //如果点按的不是电影列表的座位，则仍然可选，

                sb.append(l + 1 + " ");//文本叠加 sb=1
                this.seatlist.add(l + 1);//选座中加i
                jRadioButton[l].setForeground(new Color(225, 225, 225));
                jRadioButton[l].setText(l + 1 + "号");//有反应
                jTextField1.setText(sb + " ");//显示信息。
                jRadioButton[l].setBackground(new Color(225, 0, 0));//设置为不可选。变红。}}
            } else {//点按第二次按钮，该按钮变回去了，并且变为可选

                //把电影列表的座位删掉 设置为不可选 
                //将sb清空，并且将这个button[i]从表单中移走。
                sb = new StringBuffer();

                for (int m = 0; m < seatlist.size(); m++) {
                    if (seatlist.get(m).equals(l + 1)) {
                        seatlist.remove(m);
                    }
                }
                //将表单中还有的其他座位取出
                for (int seat : seatlist) {
                    sb.append(seat + " ");
                }
                //获取座位号
                jTextField1.setText(sb + " ");//获得当前的表单内容。
                jRadioButton[l].setBackground(new Color(225, 225, 225));
                jRadioButton[l].setText(null);//有反应

            }

            money = this.seatlist.size() * se.getPrice();
            if (this.seatlist.size() >= 5) {
                money = money * 0.9;
            }
            jButton2.setText(z.DoubletoString(money) + "元 " + " 确认选座");

        }
    }

    public static void main(String abc[]) {
        Cinema ci = new Cinema();
        Hall ha = new Hall();
        Session se = new Session();
        CinemaService cs = new CinemaServiceImpl();
        HallService hs = new HallServiceImpl();
        SessionService ss = new SessionServiceImpl();
        ci = cs.queryCinemaById(1);
        ha = hs.queryHallById(1);
        se = ss.querySessionById(3);
        Movie mo = new Movie();
        MovieService ms = new MovieServiceImpl();
        mo = ms.queryMovieById(2);
        P11 p = new P11(ci, mo, se, ha, null, Double.NaN, null, null);
        p.setVisible(true);

    }

}
