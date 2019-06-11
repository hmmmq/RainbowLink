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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.*;

public class P6 extends JFrame implements ActionListener,MouseListener{
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
Cinema ci;
CinemaService cs=new CinemaServiceImpl(); 
Hall ha; 
HallService hs; 
Movie mo; 
MovieService ms=new MovieServiceImpl(); 
Ticket ti; 
TicketService ts; 
User u; 
UserService us; 
double money;
Session se;
SessionService ss=new SessionServiceImpl();
List<Integer> seatlist;
int usertype;
private List<Cinema> cinlist;
private List<Session> seslist;
int i=0;
P6(Cinema ci,Movie mo,Session se,Hall ha,List<Integer> seatlist,Double money,User u,Ticket ti)
{//this.ci=ci;
this.mo=mo;
//this.se=se;
//this.ha=ha;
//this.seatlist=seatlist;
//this.mo=mo;
//this.money=money;
this.u=u;
//this.ti=ti;
cinlist=cs.queryAllCinema();
System.out.println("cinlist.size:"+cinlist.size());

GUI();
}
public void GUI(){
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new PCuntu("/img/P6背景_1.jpg");
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        seslist=ss.queryLowestpriceSessionByCid(cinlist.get(i).getCid());
        /*seslist=ss.queryLowestpriceSessionByCid(cinlist.get(i).getCid());
         jLabel13.setText(seslist.get(0).getPrice()+"元");
    */
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1120, 630));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 630));
        jPanel1.setRequestFocusEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/返回键.png"))); // NOI18N
        jLabel2.addMouseListener(this);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(this);
        
        //i=0,取出cinlist表单中的第一个。
        jLabel3.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel3.setText(cinlist.get(i).getCname());
       
          
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText(cinlist.get(i).getCaddress());

       
        //取出seslist表单中的对应cid的session实体，获得价钱
        jLabel11.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(192, 66, 66));
        jLabel11.setText(seslist.get(0).getPrice()+"元");
    
        //i 加一，往下走，下一个影城
           i++;
        jLabel15.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("起");



    
    
    
    
    
    
    
    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
            .addComponent(jLabel11)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel15)
            .addGap(93, 93, 93))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(9, 9, 9)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15))
            .addGap(0, 0, Short.MAX_VALUE))
    );

    
    
    jPanel5.setBackground(new java.awt.Color(255, 255, 255));
    jPanel5.addMouseListener((java.awt.event.MouseListener) this);

    jLabel5.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
    jLabel5.setText(cinlist.get(i).getCname());

    jLabel6.setForeground(new java.awt.Color(102, 102, 102));
    jLabel6.setText(cinlist.get(i).getCaddress());

    jLabel12.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(192, 66, 66));
    jLabel12.setText(seslist.get(0).getPrice()+"元");
    
    
    i++;
    
    
    jLabel16.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(102, 102, 102));
    jLabel16.setText("起");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel16)
            .addGap(96, 96, 96))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel16)))
    );
    
    

    jPanel6.setBackground(new java.awt.Color(255, 255, 255));
    jPanel6.setPreferredSize(new java.awt.Dimension(100, 52));
    jPanel6.addMouseListener(this);

    jLabel7.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
    jLabel7.setText(cinlist.get(i).getCname());

    jLabel8.setForeground(new java.awt.Color(102, 102, 102));
    jLabel8.setText(cinlist.get(i).getCaddress());

    jLabel13.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(192, 66, 66));
    
    System.out.println("seslist.size:"+seslist.size()+":"+i);
 
    seslist=ss.queryLowestpriceSessionByCid(cinlist.get(i).getCid());
    jLabel13.setText(seslist.get(0).getPrice()+"元");

    jLabel17.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(102, 102, 102));
    jLabel17.setText("起");

    
    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel17)
            .addGap(95, 95, 95))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(15, 15, 15)
            .addComponent(jLabel8))
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel17))
            .addContainerGap(39, Short.MAX_VALUE))
    );

    jPanel7.setBackground(new java.awt.Color(255, 255, 255));
    jPanel7.setPreferredSize(new java.awt.Dimension(100, 52));
    jPanel7.addMouseListener(this);

    jLabel9.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
    jLabel9.setText(cinlist.get(i).getCname());

    jLabel10.setForeground(new java.awt.Color(102, 102, 102));
    jLabel10.setText(cinlist.get(i).getCaddress());

    jLabel14.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(192, 66, 66));
    jLabel14.setText(seslist.get(0).getPrice()+"元");

    jLabel18.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
    jLabel18.setForeground(new java.awt.Color(102, 102, 102));
    jLabel18.setText("起");

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel18)
            .addGap(95, 95, 95))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jLabel9)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel10)))
            .addContainerGap(21, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel2)))
            .addContainerGap(72, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(63, 63, 63)
            .addComponent(jLabel2)
            .addGap(82, 82, 82)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    getContentPane().add(jPanel1);

    pack(); }

   public static void main(String abc[]){
       // Cinema ci = new Cinema();
       // Hall ha = new Hal
      
       // Session se = new Session();
        CinemaService cs = new CinemaServiceImpl();
       // HallService hs = new HallServiceImpl();
        SessionService ss = new SessionServiceImpl();
        //ci = cs.queryCinemaById(1);
        //ha = hs.queryHallById(1);
        //se = ss.querySessionById(3);
        Movie mo = new Movie();
        MovieService ms = new MovieServiceImpl();
         mo = ms.queryMovieById(3);
         P6 p = new P6(null, mo, null, null, null, Double.NaN, null, null);
        p.setVisible(true);
       
       
       
       
       
       
   }


    public void closeThis(){
        this.dispose();
    }
    public void mouseClicked(MouseEvent e) {
     // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mousePressed(MouseEvent e) {
       
        
        Object c = e.getSource();
       if(c==jPanel4){//选择影城。第i=0个影城。mid是上一个传进来的参数。
jPanel4.setBackground(Color.red);
jLabel3.setForeground(Color.white);
jLabel4.setForeground(Color.white);
jLabel11.setForeground(Color.white);
jLabel15.setForeground(Color.white);

}
       if(c==jPanel5){
jPanel5.setBackground(Color.red);
jLabel5.setForeground(Color.white);
jLabel6.setForeground(Color.white);
jLabel12.setForeground(Color.white);
jLabel16.setForeground(Color.white);
//确定电影院实体

//获得cid、sid

       }
       if(c==jPanel6){
jPanel6.setBackground(Color.red);
jLabel7.setForeground(Color.white);
jLabel8.setForeground(Color.white);
jLabel13.setForeground(Color.white);
jLabel17.setForeground(Color.white);   

       }
       if(c==jPanel7){
jPanel7.setBackground(Color.red);
jLabel9.setForeground(Color.white);
jLabel10.setForeground(Color.white);
jLabel14.setForeground(Color.white);
jLabel18.setForeground(Color.white);  

       }
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseReleased(MouseEvent e) {
        closeThis();
        Object c = e.getSource();
        if(c==jLabel2){
       new P2(ci, mo, se, ha, seatlist, money, u, ti).setVisible(true);
      
     this.dispose();
     
     }
       if(c==jPanel4){
           ci=cinlist.get(0);
           new P9(ci, mo, null, null, null, 0d, u, null).setVisible(true);
            this.dispose();
}
       if(c==jPanel5){
           ci=cinlist.get(1);
           new P9(ci, mo, null, null, null, 0d, u, null).setVisible(true);
            this.dispose();
       }
       if(c==jPanel6){
         ci=cinlist.get(2);
           new P9(ci, mo, null, null, null, 0d, u, null).setVisible(true);
            this.dispose();
       }
       if(c==jPanel7){
           ci=cinlist.get(3);
           new P9(ci, mo, null, null, null, 0d, u, null).setVisible(true); 
            this.dispose();
            
       }

       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
