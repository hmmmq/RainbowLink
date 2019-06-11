/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PP;

import com.fancy.entity.Cinema;
import com.fancy.entity.Hall;
import com.fancy.entity.Session;
import com.fancy.service.CinemaService;
import com.fancy.service.HallService;
import com.fancy.service.MovieService;
import com.fancy.service.SessionService;
import com.fancy.service.impl.CinemaServiceImpl;
import com.fancy.service.impl.HallServiceImpl;
import com.fancy.service.impl.MovieServiceImpl;
import com.fancy.service.impl.SessionServiceImpl;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class A6 extends javax.swing.JFrame {

    private List<Cinema> cinemalist;
    private List<Hall> halllist;
    private List<Session> sessionlist;
    private CinemaService cinemaservice = new CinemaServiceImpl();
    private HallService hallservice = new HallServiceImpl();
    private SessionService sessionservice = new SessionServiceImpl();
    private MovieService movieservice = new MovieServiceImpl();

    public A6() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sessiontable = new javax.swing.JTable(){
            public boolean isCellEditable( int row, int column) {
                return false;
            }

        };
        jScrollPane2 = new javax.swing.JScrollPane();
        cinematable = new javax.swing.JTable(){
            public boolean isCellEditable( int row, int column) {
                return false;
            }

        };
        jScrollPane3 = new javax.swing.JScrollPane();
        halltable = new javax.swing.JTable(){
            public boolean isCellEditable( int row, int column) {
                return false;
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcIdText = new javax.swing.JTextField();
        jmIdText = new javax.swing.JTextField();
        jtimeText = new javax.swing.JTextField();
        jremainText = new javax.swing.JTextField();
        jpriceText = new javax.swing.JTextField();
        jhallText = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1120, 630));
        setMinimumSize(new java.awt.Dimension(1120, 630));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 630));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 630));

        sessiontable.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "场次编号", "场厅编号", "影院编号","电影编号","开始时间","价格","剩余座位"
            }
        ) {
            boolean[] columnEditables = new boolean[] {
                false, false, false, false,false,false,false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        sessionlist=sessionservice.queryAllSession();
        fillsessiontable(sessionlist);
        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        sessiontable.setDefaultRenderer(Object.class, r);
        sessiontable.setRowHeight(70);
        sessiontable.setFont(new Font("楷体", 0, 10));
        sessiontable.getTableHeader().setFont(new Font("楷体", 1, 15));
        sessiontable.getTableHeader().setBackground(Color.orange);
        sessiontable.getTableHeader().setReorderingAllowed(false); // 不可交换顺序
        sessiontable.getTableHeader().setResizingAllowed(false); // 不可拉动表格
        sessiontable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sessiontableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(sessiontable);

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
        r.setHorizontalAlignment(JLabel.CENTER);
        cinematable.setDefaultRenderer(Object.class, r);
        cinematable.setRowHeight(70);
        cinematable.getTableHeader().setFont(new Font("楷体", 1, 20));
        cinematable.getTableHeader().setBackground(Color.orange);
        cinematable.getTableHeader().setReorderingAllowed(false); // 不可交换顺序
        cinematable.getTableHeader().setResizingAllowed(false); // 不可拉动表格
        cinematable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cinematableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(cinematable);

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
        halltable.getTableHeader().setResizingAllowed(false);
        halltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                halltableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(halltable);

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("剩余座位：");

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("影院编号：");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("电影价格：");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("开始时间：");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("场厅编号：");

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("电影编号：");

        add.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(51, 51, 51));
        add.setText("添加场次");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(51, 51, 51));
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
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jmIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(add)
                                            .addComponent(jtimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jhallText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jremainText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(back))))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jcIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jhallText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jmIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jremainText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back)
                            .addComponent(add))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>

    private void sessiontableMousePressed(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        int sessionrow = -1;
        sessionrow = sessiontable.getSelectedRow();
        if (sessionrow != -1) {
            jtimeText.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(sessionlist.get(sessionrow).getBeginTime()));
            jpriceText.setText(String.valueOf(sessionlist.get(sessionrow).getPrice()));
            jmIdText.setText(String.valueOf(sessionlist.get(sessionrow).getmId()));
        }
    }                                         

    private void halltableMousePressed(java.awt.event.MouseEvent evt) {                                       
        int halrow = -1;
        halrow = halltable.getSelectedRow();
        if (halrow != -1) {
            jhallText.setText(String.valueOf(halllist.get(halrow).gethId()));
            jremainText.setText(String.valueOf(halllist.get(halrow).getCapacity()));
            sessionlist = sessionservice.querySessionByHid(halllist.get(halrow).gethId());
            fillsessiontable(sessionlist);
        }
        // TODO add your handling code here:
    }                                      

    private void cinematableMousePressed(java.awt.event.MouseEvent evt) {                                         

        int cinemarow = -1;
        cinemarow = cinematable.getSelectedRow();
        if (cinemarow != -1) {
            jcIdText.setText(String.valueOf(cinemalist.get(cinemarow).getCid()));
            halllist = hallservice.queryAllHallcId(cinemalist.get(cinemarow).getCid());
            fillhalltableTable(halllist);
        }
        // TODO add your handling code here:
    }                                        

    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    

        		// TODO Auto-generated method stub
		if(judge()) {
			try {
				int hId=Integer.parseInt(jhallText.getText());
				int cId=Integer.parseInt(jcIdText.getText());
				int mId=Integer.parseInt(jmIdText.getText());
				String time=jtimeText.getText();
				 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");				 
				 Date beginTime=sdf.parse(time);
				 double price=Double.parseDouble(jpriceText.getText());
				 int remain=Integer.parseInt(jremainText.getText());
				 if(cinemaservice.queryCinemaById(cId)!=null) {
					 if(hallservice.queryHallById(hId)!=null) {
						 if(movieservice.queryMovieById(mId)!=null) {
							Session session=new Session(hId,cId,mId,beginTime,price,remain);
							if(sessionservice.addSession(session)==1) {
								JOptionPane.showMessageDialog(null, "添加成功"); 
								reset();
							}else {
								JOptionPane.showMessageDialog(null, "添加失败"); 
							}
									
						 }else {
							 JOptionPane.showMessageDialog(null, "不存在此电影"); 
						 }
					 }else {
						 JOptionPane.showMessageDialog(null, "不存在此场厅"); 
					 }
				 }else {
					 JOptionPane.showMessageDialog(null, "不存在此影院厅"); 
				 }
				
			} catch (NumberFormatException e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "输入格式错误");
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "时间输入格式错误");
			}
		}
	// TODO add your handling code here:
    }                                   

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        
        new A1().setVisible(true);
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
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
            java.util.logging.Logger.getLogger(A6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new A6().setVisible(true);
            }
        });
    }

    private void fillsessiontable(List<Session> sessionlist2) {
        DefaultTableModel dtm = (DefaultTableModel) sessiontable.getModel();
        dtm.setRowCount(0); // 设置成0行
        int sessionRow = sessionlist2.size();
        for (int i = 0; i < sessionRow; i++) {

            Vector v = new Vector();
            v.add(sessionlist2.get(i).getsId());
            v.add(sessionlist2.get(i).gethId());
            v.add(sessionlist2.get(i).getcId());
            v.add(sessionlist2.get(i).getmId());
            v.add(sessionlist2.get(i).getBeginTime());
            v.add(sessionlist2.get(i).getPrice());
            v.add(sessionlist2.get(i).getRemain());
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

    private void fillhalltableTable(List<Hall> halllist2) {
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

    public boolean judge() {
        if ("".equals(jcIdText.getText())) {
            JOptionPane.showMessageDialog(null, "影院编号不能为空");
            return false;
        }
        if ("".equals(jhallText.getText())) {
            JOptionPane.showMessageDialog(null, "场厅编号不能为空");
            return false;
        }
        if ("".equals(jmIdText.getText())) {
            JOptionPane.showMessageDialog(null, "电影编号不能为空");
            return false;
        }
        if ("".equals(jpriceText.getText())) {
            JOptionPane.showMessageDialog(null, "电影价格不能为空");
            return false;
        }
        if ("".equals(jtimeText.getText())) {
            JOptionPane.showMessageDialog(null, "场次时间不能为空");
            return false;
        }
        if ("".equals(jremainText.getText())) {
            JOptionPane.showMessageDialog(null, "剩余座位不能为空");
            return false;
        }
        return true;
    }

    public void reset() {
        jcIdText.setText("");
        jhallText.setText("");
        jmIdText.setText("");
        jpriceText.setText("");
        jtimeText.setText("");
        jremainText.setText("");

    }
    // Variables declaration - do not modify
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTable cinematable;
    private javax.swing.JTable halltable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jcIdText;
    private javax.swing.JTextField jhallText;
    private javax.swing.JTextField jmIdText;
    private javax.swing.JTextField jpriceText;
    private javax.swing.JTextField jremainText;
    private javax.swing.JTextField jtimeText;
    private javax.swing.JTable sessiontable;
    // End of variables declaration
}
