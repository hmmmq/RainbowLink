
package PP;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class P1 extends javax.swing.JFrame implements KeyListener{
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel welcome;
    // End of variables declaration        

    public P1() {
        GUI1();
        
    }
                        
    private void GUI1() {

        jPanel1 = new PCuntu("/PP/导出/启动页/Image 1.png");
        ///com/zyp/module/module/启动页/Image 1.png
        welcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1120, 630));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 630));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addKeyListener(this);
  
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setFont(new java.awt.Font("方正等线", 1, 30)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("生  活  因  电  影  而  美  好  。");
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PP/导出/启动页/正在热映 copy.png"))); // NOI18N
        jLabel1.setText("copy");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 80, -1));

        jLabel2.setFont(new java.awt.Font("方正等线", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RainbowLink");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>                        
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
       
        P2 PP2 = new P2(null, null, null, null, null, 0.0, null, null);
        PP2.show();
        this.dispose();

    }                                    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new P1().setVisible(true);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     Object c=e.getSource();
     if(c==jPanel1){
     int keycode=e.getKeyCode();
     if(keycode=='\n'){
         new A1().setVisible(true);
     }
     }
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
}

   
