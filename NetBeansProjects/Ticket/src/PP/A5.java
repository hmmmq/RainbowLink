package PP;

import com.fancy.entity.Cinema;
import com.fancy.entity.Hall;
import com.fancy.service.CinemaService;
import com.fancy.service.HallService;
import com.fancy.service.SessionService;
import com.fancy.service.impl.CinemaServiceImpl;
import com.fancy.service.impl.HallServiceImpl;
import com.fancy.service.impl.SessionServiceImpl;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class A5 extends javax.swing.JFrame {

    private List<Cinema> cinemalist;
    private List<Hall> halllist;
    private CinemaService cinemaservice = new CinemaServiceImpl();
    private HallService hallservice = new HallServiceImpl();
    private SessionService sessionservice = new SessionServiceImpl();
    private int halrow = -1;

    public A5() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cinematable = new javax.swing.JTable(){
            public boolean isCellEditable( int row, int column) {
                return false;
            }

        };
        jScrollPane2 = new javax.swing.JScrollPane();
        halltable = new javax.swing.JTable(){
            public boolean isCellEditable( int row, int column) {
                return false;
            }

        };
        ll = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hallnametext = new javax.swing.JTextField();
        capacitytext = new javax.swing.JTextField();
        cIdtext = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 630));

        cinematable.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "影院编号", "影院名", "影院地址"
            }
        ) {
            boolean[] columnEditables = new boolean[] {
                false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        cinemalist=cinemaservice.queryAllCinema();
        fillCinemaTable(cinemalist);
        //		scrollPane.setViewportView(cinematable);
        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        cinematable.setDefaultRenderer(Object.class, r);
        cinematable.setRowHeight(70);
        //		cinematable.setFont(font);
        cinematable.getTableHeader().setFont(new Font("楷体", 1, 20));
        cinematable.getTableHeader().setBackground(Color.orange);
        cinematable.getTableHeader().setReorderingAllowed(false); // 不可交换顺序
        cinematable.getTableHeader().setResizingAllowed(false);
        cinematable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cinematableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(cinematable);

        halltable.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "场厅编号", "场厅名", "影院编号","场厅容量"
            }
        ) {
            boolean[] columnEditables = new boolean[] {
                false, false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        halllist=hallservice.queryAllHall();
        fillhalltableTable(halllist);
        r.setHorizontalAlignment(JLabel.CENTER);
        halltable.setDefaultRenderer(Object.class, r);
        halltable.setRowHeight(70);
        //		halltable.setFont(font);
        halltable.getTableHeader().setFont(new Font("楷体", 1, 20));
        halltable.getTableHeader().setBackground(Color.orange);
        halltable.getTableHeader().setReorderingAllowed(false); // 不可交换顺序
        halltable.getTableHeader().setResizingAllowed(false); // 不可拉动表格
        halltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                halltableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(halltable);

        ll.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        ll.setForeground(new java.awt.Color(255, 255, 255));
        ll.setText("大厅名称：");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("场厅容量：");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("影院编号：");

        hallnametext.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        hallnametext.setForeground(new java.awt.Color(51, 51, 51));

        capacitytext.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        capacitytext.setForeground(new java.awt.Color(51, 51, 51));
        capacitytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacitytextActionPerformed(evt);
            }
        });

        cIdtext.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        cIdtext.setForeground(new java.awt.Color(51, 51, 51));

        add.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add.setText("添加场厅");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        del.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        del.setText("删除场厅");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        update.setText("修改场厅");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        back.setText("返回上级");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hallnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(add)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(cIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(capacitytext, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(update)
                                .addGap(126, 126, 126)
                                .addComponent(del)
                                .addGap(141, 141, 141)
                                .addComponent(back)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hallnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(update)
                    .addComponent(del)
                    .addComponent(back))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>

    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    

        if (judge()) {
            try {
                int cId = Integer.parseInt(cIdtext.getText());
                int capacity = Integer.parseInt(capacitytext.getText());
                String cName = hallnametext.getText();

                Hall hall = new Hall(cName, cId, capacity);
                int judge = hallservice.addHall(hall);
                if (judge == 1) {
                    JOptionPane.showMessageDialog(null, "添加场厅成功");
                    halllist = hallservice.queryAllHallcId(cId);

                    fillhalltableTable(halllist);
                } else if (judge == 2) {
                    JOptionPane.showMessageDialog(null, "添加场厅失败");
                } else {
                    JOptionPane.showMessageDialog(null, "已存在此场厅");
                }
            } catch (NumberFormatException e2) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, "输入格式错误");
            }
        }
        // TODO add your handling code here:
    }                                   

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       

        if (judge()) {
            try {
                int cId = Integer.parseInt(cIdtext.getText());
                int capacity = Integer.parseInt(capacitytext.getText());
                String hName = hallnametext.getText();
                if (halrow != -1) {
                    halllist.get(halrow).setCapacity(capacity);
                    halllist.get(halrow).setcId(cId);
                    if (cinemaservice.queryCinemaById(cId) != null) {
                        halllist.get(halrow).sethName(hName);
                        if (hallservice.updateHall(halllist.get(halrow))) {
                            JOptionPane.showMessageDialog(null, "修改成功");
                            fillhalltableTable(halllist);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "不存在此影院");
                    }

                }

            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "格式错误");
            }
        }
        // TODO add your handling code here:
    }                                      

    private void delActionPerformed(java.awt.event.ActionEvent evt) {                                    

        if (judge()) {
            try {
                int cId = Integer.parseInt(cIdtext.getText());
                int capacity = Integer.parseInt(capacitytext.getText());
                String hName = hallnametext.getText();
                if (halrow != -1) {
                    halllist.get(halrow).setCapacity(capacity);
                    halllist.get(halrow).setcId(cId);
                    if (cinemaservice.queryCinemaById(cId) != null) {
                        if (sessionservice.querySessionByHid(halllist.get(halrow).gethId()).size() == 0) {
                            halllist.get(halrow).sethName(hName);
                            if (hallservice.delHall(halllist.get(halrow).gethId())) {
                                JOptionPane.showMessageDialog(null, "删除成功");
                                halllist.remove(halrow);
                                fillhalltableTable(halllist);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "该场厅有场次，无法删除");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "不存在此影院");
                    }

                }

            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "格式错误");
            }
        }
        // TODO add your handling code here:
    }                                   

    private void cinematableMousePressed(java.awt.event.MouseEvent evt) {                                         

        int cinemarow = -1;
        cinemarow = cinematable.getSelectedRow();
        if (cinemarow != -1) {
            cIdtext.setText(String.valueOf(cinemalist.get(cinemarow).getCid()));
            halllist = hallservice.queryAllHallcId(cinemalist.get(cinemarow).getCid());
            fillhalltableTable(halllist);
        }
        // TODO add your handling code here:
    }                                        

    private void capacitytextActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void halltableMousePressed(java.awt.event.MouseEvent evt) {                                       

        halrow = halltable.getSelectedRow();
        if (halrow != -1) {
            hallnametext.setText(halllist.get(halrow).gethName());
            capacitytext.setText(String.valueOf(halllist.get(halrow).getCapacity()));
        }
        // TODO add your handling code here:
    }                                      

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        
        new A1().setVisible(true);
        dispose();
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new A5().setVisible(true);
            }
        });
    }
    
    private void fillhalltableTable(List<Hall> halllist2) {
        // TODO Auto-generated method stub
        DefaultTableModel dtm = (DefaultTableModel) halltable.getModel();
        dtm.setRowCount(0); // 设置成0行
        int hallRow = halllist2.size();
        for (int i = 0; i < hallRow; i++) {
            Vector v = new Vector();
            v.add(halllist2.get(i).gethId());
            v.add(halllist2.get(i).gethName());
            v.add(halllist2.get(i).getcId());
            v.add(halllist2.get(i).getCapacity());
            dtm.addRow(v);
        }
    }

    private void fillCinemaTable(List<Cinema> cinemalist2) {
        DefaultTableModel dtm = (DefaultTableModel) cinematable.getModel();
        dtm.setRowCount(0); // 设置成0行
        int cinemaRow = cinemalist2.size();
        for (int i = 0; i < cinemaRow; i++) {
            Vector v = new Vector();
            v.add(cinemalist2.get(i).getCid());
            v.add(cinemalist2.get(i).getCname());
            v.add(cinemalist2.get(i).getCaddress());

            dtm.addRow(v);
        }

    }

    public boolean judge() {
        if ("".equals(hallnametext.getText())) {
            JOptionPane.showMessageDialog(null, "场厅名不能为空");
            return false;
        }
        if ("".equals(cIdtext.getText())) {
            JOptionPane.showMessageDialog(null, "影院编号不能为空");
            return false;
        }
        if ("".equals(capacitytext.getText())) {
            JOptionPane.showMessageDialog(null, "场厅容量不能为空");
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTextField cIdtext;
    private javax.swing.JTextField capacitytext;
    private javax.swing.JTable cinematable;
    private javax.swing.JButton del;
    private javax.swing.JTextField hallnametext;
    private javax.swing.JTable halltable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ll;
    private javax.swing.JButton update;
    // End of variables declaration
}
