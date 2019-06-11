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
import com.fancy.service.impl.SessionServiceImpl;
import com.fancy.service.impl.TicketServiceImpl;
import com.fancy.service.impl.UserServiceImpl;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author hmqhmq
 */
public class P14 extends JFrame implements ActionListener,MouseListener {
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
Cinema ci;
CinemaService cs=new CinemaServiceImpl(); 
Hall ha; 
HallService hs=new HallServiceImpl(); 
Movie mo; 
MovieService ms; 
Ticket ti; 
TicketService ts=new TicketServiceImpl(); 
User u; 
UserService us=new UserServiceImpl(); 
double money;
Session se;
SessionService ss=new SessionServiceImpl();
List<Integer> seatlist;
int usertype;
P14(Cinema ci,Movie mo,Session se,Hall ha,List<Integer> seatlist,Double money,User u,Ticket ti)
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
public void GUI(){jPanel1 = new PCuntu("/PP/导出/主界面/背景.png");
        jPanel2 = new javax.swing.JPanel();
        Cuntu w=new Cuntu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new PCuntu("/PP/导出/登录:注册/矩形.png");
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton2 = new RB_SIC("/PP/导出/登录:注册/分组 4 copy复制.png", "/PP/导出/登录:注册/分组 4 copy复制334.png",260,50);
        jRadioButton1 = new RB_SIC("/PP/导出/登录:注册/编组.png","/PP/导出/登录:注册/椭圆形.png" ,18, 18);
        Toumin t=new Toumin();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        t.PToumin(jPanel2);
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("PingFang SC", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rainbow ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 20, 250, 60);

        jLabel2.setFont(new java.awt.Font("PingFang SC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("      登陆您的RainbowLink账户");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 80, 320, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("              忘记了密码？");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" 我已阅读《用户协议》和《隐私协议》");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("        我没有账户");
        jLabel4.addMouseListener(this);

        t.PToumin(jPanel4);

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPasswordField1.setBorder(new EmptyBorder(0,0,0,0));
        jPasswordField1.setFont(new java.awt.Font("PingFang SC", 2, 18)); // NOI18N

        jTextField2.setBorder(new EmptyBorder(0,0,0,0));
        jTextField2.setFont(new java.awt.Font("Malayalam Sangam MN", 2, 24)); // NOI18N
        jTextField2.addActionListener(this);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Cuntu c3=new Cuntu();
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<");
        jLabel7.addMouseListener(this);

        jRadioButton2.addActionListener(this);

        jRadioButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.select"));
        jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setBorder(null);
        jRadioButton1.setBorderPainted(false);
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setBorderPainted(false);
        jRadioButton1.addActionListener(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addGap(20, 20, 20)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();}
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
        P14 p = new P14(ci, null, se, ha, null, Double.NaN, null, null);
        p.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object obj=e.getSource();
        if(obj==jRadioButton2){//登陆
        String username=jTextField2.getText();
        String Password=jPasswordField1.getText();
        if(username.charAt(0)=='a'){
            usertype=1;
        }else{usertype=0;}
        u=new User(username,Password,usertype);
       try{u=us.login(u);}catch(Exception e2){System.out.println("null");}
        
       if(null!=u){
       P19 p=new P19(ci, mo, se, ha, seatlist, money, u, null);//登陆成功，跳转到支付界面。
        p.setVisible(true);
 
        //
        }
        else{
            System.out.println("fail");
           P14 p=new P14(ci, mo, se, ha, seatlist, money, null, null); //登陆失败,需要重新登陆。
            p.setVisible(true);
        }}
    }

    
    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Object obj=e.getSource();
    if(obj==jLabel4){//跳转到注册界面
        P16 p=new P16(ci, mo, se, ha, seatlist, money, null, null);
         p.setVisible(true);
      this.dispose();}
    if(obj==jLabel7){//返回上一层,到达选座页面，暂未登陆。
        if(ci!=null){
           P11 p=new P11(ci, mo, se, ha, seatlist, money, null, null);
           p.setVisible(true);}
        else{
        new P2(ci, mo, se, ha, seatlist, money, u, ti).setVisible(true);}
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
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}





