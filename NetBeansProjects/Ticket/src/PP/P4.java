package PP;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

/**
 *
 * @author 10637
 */
public class P4 extends javax.swing.JFrame implements ActionListener, MouseListener{
    
    // Variables declaration - do not modify
    private javax.swing.JLabel check;
    private javax.swing.JLabel back;
    private javax.swing.JPanel mbuy;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mName2;
    private javax.swing.JLabel mdetail2;
    // End of variables declaration
    
    
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
    
    
    P4(Cinema ci, Movie mo, Session se, Hall ha, List<Integer> seatlist, Double money, User u, Ticket ti) {
        this.ci = ci;
        this.mo = mo;
        this.se = se;
        this.ha = ha;
        this.seatlist = seatlist;
        this.money = money;
        this.u = u;
        this.ti = ti;
        jPanel2 = new PCuntu(mo.getmheng());
        mdetail2 = new javax.swing.JLabel();
        check = new javax.swing.JLabel();
        mName2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        GUI4();
    }

    private void GUI4() {

        jPanel2 = new PCuntu(mo.getmheng());
        mdetail2 = new javax.swing.JLabel();
        check = new javax.swing.JLabel();
        mName2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        mbuy= new PCuntu("/PP/导出/主界面/分组 4 copy.png");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1120, 630));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        setPreferredSize(new java.awt.Dimension(120, 630));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(1120, 630));
        jPanel2.setMinimumSize(new java.awt.Dimension(1120, 630));
        jPanel2.setPreferredSize(new java.awt.Dimension(1120, 630));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mdetail2.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        mdetail2.setForeground(new java.awt.Color(245, 237, 237));
        mdetail2.setText(mo.getMlocality());
        jPanel2.add(mdetail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        check.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        check.setForeground(new java.awt.Color(245, 241, 241));
        check.setText("查看详情>");
        check.addMouseListener(this);
        jPanel2.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        mName2.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        mName2.setForeground(new java.awt.Color(255, 255, 255));
        mName2.setText(mo.getmName());
        jPanel2.add(mName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        back.setFont(new java.awt.Font("微软雅黑", 1, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("<");
        back.addMouseListener(this);
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        mbuy.setOpaque(false);
        mbuy.addMouseListener(this);
        jPanel2.add(mbuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, 180, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 630));

        pack();
    }// </editor-fold>

   
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        Object d = e.getSource();
        if (d == back) {
            new P2(null, mo, null, null, null, 0.0, null, null).setVisible(true);
          
            dispose();
        } 
        if (d == check) {
          new P5(null, mo, null, null, null, 0.0, null, null).setVisible(true);
       
            this.dispose();
        } 
        if(d==mbuy){
            
            dispose();
        }

//        throw new UnsupportedOperationException("Not supported yet.");
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

}

