/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import javax.swing.filechooser.FileSystemView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author hmqhmq
 */
public class P21 extends JFrame implements ActionListener,MouseListener{
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
Toumin t=new Toumin();
ZhuanHuan z=new ZhuanHuan();
Cuntu c=new Cuntu();

 private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel right1;
    private javax.swing.JPanel right2;
    private javax.swing.JPanel right3;
P21(Cinema ci,Movie mo,Session se,Hall ha,List<Integer> seatlist,Double money,User u,Ticket ti) throws Exception
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
public void GUI() throws Exception{
    jPanel1 = new PCuntu("/PP/导出/主界面/背景.png");
    jButton1 = new javax.swing.JButton();
     jLabel1 = new javax.swing.JLabel();
        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/编组复制.png
     right1 = new PCuntu("/PP/导出/电影票/编组复制.png");
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        right2 = new PCuntu("/PP/导出/电影票/编组.png");
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
    
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        right3 = new PCuntu("/PP/导出/电影票/编组复制 2df.png");
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
///Users/hmqhmq/NetBeansProjects/Ticket/src
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        t.JBToumin(jButton1);
        jButton1.setText("<");
        jButton1.addActionListener(this);
         System.out.println(mo.getmPicaddress());
         
        jLabel1.setIcon(c.cuntu(mo.getmPicaddress(),400,600));
        jLabel1 .setFont(new java.awt.Font("PingFang HK", 0, 36));
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(new RoundBorder_30r());
///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/编组_1.png
        t.PToumin(right1);
         jLabel11.setFont(new java.awt.Font("PingFang HK", 0, 36));
        jLabel11.setText(mo.getmName());

        jLabel12.setText(mo.getMlocality());

        if(mo.getmType()=="3D"){ jLabel13.setText("3D");}
        jLabel13.setBorder(new RoundBorder_10r());
         if(mo.getmType()=="3D"){
       jLabel14.setText("IMAX3D");}
        jLabel14.setBorder(new RoundBorder_10r());
         if(mo.getmType()=="3D"){
        jLabel15.setText("4D");}
        jLabel15.setBorder(new RoundBorder_10r());

        javax.swing.GroupLayout right1Layout = new javax.swing.GroupLayout(right1);
        right1.setLayout(right1Layout);
        right1Layout.setHorizontalGroup(
            right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right1Layout.createSequentialGroup()
                .addGap(180, 180, 180)//122
                .addComponent(jLabel11)
                .addContainerGap(0,0))//javax.swing.GroupLayout.DEFAULT_SIZE Short.MAX_VALUE
            .addGroup(right1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel13)
                .addGap(123, 123, 123)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))//115
        );
        right1Layout.setVerticalGroup(
            right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        right2.setBorder(new RoundBorder_30rf());
        t.PToumin(right2);

        jLabel21.setText(ci.getCname());

        jLabel22.setText(ha.gethName());
           Random1 r=new Random1();
           StringBuffer s=r.Random2();
         try {
             jLabel24.setText("取票码："+s);
         } catch (Exception ex) {
             Logger.getLogger(P21.class.getName()).log(Level.SEVERE, null, ex);
         }
///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/启动页/正在热映 copy.png
            File desktopDir = FileSystemView.getFileSystemView() .getHomeDirectory();
            String desktopPath = desktopDir.getAbsolutePath();
		
		String format="png";
		String contents="Success to take the ticket!"+"\n"+"User Name  :"+"\n"+u.getuName()+"\n"+"\n Movie Session:\n"+"\n"+se.getBeginTime()+"\nCollection of tickect code:"+"\n"+s;
              HashMap map=new HashMap();
		map.put(EncodeHintType.CHARACTER_SET, "utf-8");
		map.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.M);
		map.put(EncodeHintType.MARGIN, 0);
		try {
			BitMatrix bm = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE,250,250);
			Path file=new File(desktopPath+"/"+r+".png").toPath();
			MatrixToImageWriter.writeToPath(bm, format, file);
                        
		} catch (WriterException e) {
			e.printStackTrace();
		
	} catch (IOException ex) {
             Logger.getLogger(P21.class.getName()).log(Level.SEVERE, null, ex);
         }
       jLabel23.setIcon(c.cuntu2(desktopPath+"/"+r+".png",250,250));
        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/1557233542.png

     

        javax.swing.GroupLayout right2Layout = new javax.swing.GroupLayout(right2);
        right2.setLayout(right2Layout);
        right2Layout.setHorizontalGroup(
            right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right2Layout.createSequentialGroup()
                .addGap(230, 230,230)//2号厅
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right2Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGroup(right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right2Layout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120))//影院
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right2Layout.createSequentialGroup()
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)))))//二维码
        );
        right2Layout.setVerticalGroup(
            right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right2Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/编组.png

        t.PToumin(right3);
        jLabel31.setFont(new java.awt.Font("PingFang HK", 0, 15));
        jLabel31.setText("实付金额："+money+"元");
    
        jLabel32.setFont(new java.awt.Font("PingFang SC", 0, 15));
        jLabel32.setText("电影票号："+mo.getmId());
        jLabel32.setBorder(null);
      
        jLabel33.setFont(new java.awt.Font("PingFang HK", 0, 15));
        
        jLabel33.setText("购买时间:"+new getDate().getDate());
        jLabel34.setFont(new java.awt.Font("PingFang SC", 0, 36));
        jLabel34.setText(money+"元");

        javax.swing.GroupLayout right3Layout = new javax.swing.GroupLayout(right3);
        right3.setLayout(right3Layout);
        right3Layout.setHorizontalGroup(
            right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(right3Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(right3Layout.createSequentialGroup()
                        .addGroup(right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE,280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        right3Layout.setVerticalGroup(
            right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(right2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(right1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(right3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(right1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(right2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(right3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ///Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/<.png
        // /Users/hmqhmq/NetBeansProjects/Ticket/src/PP/导出/电影票/编组复制 2df.png
        //
        right3.setBorder(new RoundBorder_30rf());

        getContentPane().add(jPanel1);

        pack();



}



 public static void main(String abc[]) throws Exception {
       ArrayList<Integer> seatlist = new ArrayList<>();
       seatlist.add(9);
        Cinema ci = new Cinema();
        Hall ha = new Hall();
        Session se = new Session();
         Movie mo=new Movie();
        CinemaService cs = new CinemaServiceImpl();
        HallService hs = new HallServiceImpl();
        SessionService ss=new SessionServiceImpl();
        MovieService ms=new MovieServiceImpl();
           se = ss.querySessionById(2);
            ha = hs.queryHallById(2);
             ci = cs.queryCinemaById(1);
           mo=ms.queryMovieById(2);
           User u=new User();
           UserService us=new UserServiceImpl();
           u=us.queryUserByid(7);
           Ticket ti=new Ticket();
           TicketService ts=new TicketServiceImpl();
           ti=ts.queryAllTicketuId(u.getUid()).get(0);
       P21 p = new P21(ci, mo, se, ha, seatlist, 90d, u,ti);
        p.setVisible(true);
 //s,h,c,m,13,8,2,16
 //2212
    }


    @Override
    
    public void actionPerformed(ActionEvent e) {
       Object o=e.getSource();// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   if(o==jButton1){P2 p=new P2(null,null, null, null,null, 0d, u, null);
   p.setVisible(true);}

   
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
}
