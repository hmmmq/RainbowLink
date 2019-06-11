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
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author hmqhmq
 */
public class P18 extends JFrame implements ActionListener,MouseListener{
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
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
P18(Cinema ci,Movie mo,Session se,Hall ha,List<Integer> seatlist,Double money,User u,Ticket ti)
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
public void GUI(){

        jPanel1 = new PCuntu("/PP/导出/主界面/背景.png");
        Cuntu e=new Cuntu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.addMouseListener(this);

        jLabel1.setIcon(e.cuntu("/PP/导出/启动页/正在热映 copy.png",128,102
        ));

        jLabel2.setFont(new java.awt.Font("PingFang SC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" 注册成功");

        jLabel3.setFont(new java.awt.Font("PingFang SC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("现在您可访问Rainbow Link所有内容");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/主界面/背景.png

        pack();
}
 public static void main(String abc[]) {
       ArrayList<Integer> seatlist = new ArrayList<>();
       seatlist.add(10);
       Cinema ci = new Cinema();
       Hall ha = new Hall();
       Session se = new Session();
       Movie mo=new Movie();
       User u=new User();
       UserService us=new UserServiceImpl();
       CinemaService cs = new CinemaServiceImpl();
       HallService hs = new HallServiceImpl();
       SessionService ss=new SessionServiceImpl();
       MovieService ms=new MovieServiceImpl();
       se = ss.querySessionById(2);
       ha = hs.queryHallById(2);
       ci = cs.queryCinemaById(1);
       mo=ms.queryMovieById(2);
       u=us.queryUserByid(2);
       P18 p = new P18(ci, mo, se, ha, seatlist, 90d, u, null);
       p.setVisible(true);
 //s,h,c,m,13,8,2,16
 //2212
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       Object o=e.getSource();// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      if(o==jPanel1){
        P19 p=new P19(ci, mo, se, ha, seatlist, money, u, ti);
        p.setVisible(true);
        this.dispose();
    }
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
}
