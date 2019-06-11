package ADmin;

import PP.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class A1 extends javax.swing.JFrame {

    public A1() {

//        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
//        int x = (int) screensize.getWidth() / 2 - this.getSize().width/ 2;
//        int y = (int) screensize.getHeight() / 2 -this.getSize().height/ 2;
//        this.setLocation(x, y);

//        this.setLocationRelativeTo(null);//在屏幕中居中显示
//        this.setVisible(true); 
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mm = new javax.swing.JButton();
        sm = new javax.swing.JButton();
        hm = new javax.swing.JButton();
        cm = new javax.swing.JButton();
        sa = new javax.swing.JButton();
        tm = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 630));

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("欢迎使用影票管理系统");

        jButton1.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("添加电影");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mm.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
        mm.setForeground(new java.awt.Color(51, 51, 51));
        mm.setText("维护电影");
        mm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmActionPerformed(evt);
            }
        });

        sm.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
        sm.setForeground(new java.awt.Color(51, 51, 51));
        sm.setText("场次维护");
        sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smActionPerformed(evt);
            }
        });

        hm.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
        hm.setForeground(new java.awt.Color(51, 51, 51));
        hm.setText("场厅维护");
        hm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmActionPerformed(evt);
            }
        });

        cm.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
        cm.setForeground(new java.awt.Color(51, 51, 51));
        cm.setText("影院维护");
        cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmActionPerformed(evt);
            }
        });

        sa.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
        sa.setForeground(new java.awt.Color(51, 51, 51));
        sa.setText("场次添加");
        sa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saActionPerformed(evt);
            }
        });

        tm.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
        tm.setForeground(new java.awt.Color(51, 51, 51));
        tm.setText("影票管理");
        tm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
        exit.setForeground(new java.awt.Color(51, 51, 51));
        exit.setText("安全退出");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>

    private void mmActionPerformed(java.awt.event.ActionEvent evt) {                                   

         new A3().setVisible(true);
         dispose();
    }                                  

    private void smActionPerformed(java.awt.event.ActionEvent evt) {                                   

        new A7().setVisible(true);
        dispose();
    }                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        new A2().setVisible(true);
        dispose();
    }                                        

    private void cmActionPerformed(java.awt.event.ActionEvent evt) {                                   
       
        new A4().setVisible(true);
        dispose();

    }                                  

    private void hmActionPerformed(java.awt.event.ActionEvent evt) {                                   

        new A5().setVisible(true);
        dispose();
        
    }                                  

    private void saActionPerformed(java.awt.event.ActionEvent evt) {                                   

        new A6().setVisible(true);
        dispose();
    }                                  

    private void tmActionPerformed(java.awt.event.ActionEvent evt) {                                   

        new A8().setVisible(true);
        dispose();

    }                                  

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     

        System.exit(0);
    }                                    

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new A1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton cm;
    private javax.swing.JButton exit;
    private javax.swing.JButton hm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mm;
    private javax.swing.JButton sa;
    private javax.swing.JButton sm;
    private javax.swing.JButton tm;
    // End of variables declaration
}
