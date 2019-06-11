/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

/**
 *
 * @author hmqhmq
 */

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author hmqhmq
 */
public class P10 extends JFrame implements ActionListener,MouseListener{
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
P10(Cinema ci,Movie mo,Session se,Hall ha,List<Integer> seatlist,Double money,User u,Ticket ti)
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
public void GUI(){ }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
