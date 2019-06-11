package PP;

import com.fancy.entity.Cinema;
import com.fancy.entity.Session;
import com.fancy.service.CinemaService;
import com.fancy.service.SessionService;
import com.fancy.service.impl.CinemaServiceImpl;
import com.fancy.service.impl.SessionServiceImpl;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class A4 extends javax.swing.JFrame {

    private List<Cinema> cinemalist;
    private CinemaService cinemaservice = new CinemaServiceImpl();
    private int row = -1;
    private LayoutManager groupLayout;

    public A4() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addcinema = new javax.swing.JButton();
        update = new javax.swing.JButton();
        search = new javax.swing.JButton();
        del = new javax.swing.JButton();
        sercinnametest = new javax.swing.JTextField();
        cinenametext = new javax.swing.JTextField();
        sercinaddresstest = new javax.swing.JTextField();
        cineaddrtest = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cinemalist=cinemaservice.queryAllCinema();
        cinematable = new javax.swing.JTable(){
            public boolean isCellEditable( int row, int column)
            {
                return false;
            }};
            back = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setMaximumSize(new java.awt.Dimension(1120, 630));
            setMinimumSize(new java.awt.Dimension(1120, 630));
            setResizable(false);
            getContentPane().setLayout(new java.awt.CardLayout());

            jPanel1.setBackground(new java.awt.Color(51, 51, 51));
            jPanel1.setMaximumSize(new java.awt.Dimension(1120, 630));
            jPanel1.setMinimumSize(new java.awt.Dimension(1120, 630));

            jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 36)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("--影院维护--");

            jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("影院名：");

            jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("影院名：");

            jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("影院地址：");

            jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 22)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("影院地址：");

            addcinema.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            addcinema.setText("添加影院");
            addcinema.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addcinemaActionPerformed(evt);
                }
            });

            update.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            update.setText("修改影院");
            update.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    updateActionPerformed(evt);
                }
            });

            search.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            search.setText("搜索");
            search.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    searchActionPerformed(evt);
                }
            });

            del.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            del.setText("删除影院");
            del.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    delActionPerformed(evt);
                }
            });

            sercinnametest.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            sercinnametest.setForeground(new java.awt.Color(51, 51, 51));
            sercinnametest.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sercinnametestActionPerformed(evt);
                }
            });

            cinenametext.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            cinenametext.setForeground(new java.awt.Color(51, 51, 51));
            cinenametext.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cinenametextActionPerformed(evt);
                }
            });

            sercinaddresstest.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            sercinaddresstest.setForeground(new java.awt.Color(51, 51, 51));
            sercinaddresstest.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sercinaddresstestActionPerformed(evt);
                }
            });

            cineaddrtest.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
            cineaddrtest.setForeground(new java.awt.Color(51, 51, 51));
            cineaddrtest.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cineaddrtestActionPerformed(evt);
                }
            });

            cinematable.setModel(new DefaultTableModel(new Object[][] { },new String[] {"影院编号", "影院名字", "影院地址"})
                {
                    boolean[] columnEditables = new boolean[] {
                        false, false, false
                    };
                    public boolean isCellEditable(int row, int column) {
                        return columnEditables[column];
                    }
                });
                fillTable(cinemalist);
                DefaultTableCellRenderer r = new DefaultTableCellRenderer();
                r.setHorizontalAlignment(JLabel.CENTER);
                cinematable.setDefaultRenderer(Object.class, r);
                cinematable.setRowHeight(70);
                cinematable.getTableHeader().setFont(new Font("楷体", 1, 20));
                cinematable.getTableHeader().setBackground(Color.WHITE);
                cinematable.getTableHeader().setReorderingAllowed(false); // 不可交换顺序
                cinematable.getTableHeader().setResizingAllowed(false); // 不可拉动表格
                //cinematable.addMouseListener(this);
                jScrollPane1.setViewportView(cinematable);

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
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(265, 265, 265)
                                .addComponent(search))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(sercinnametest, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cinenametext)))
                                            .addGap(8, 8, 8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(addcinema)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(update)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cineaddrtest, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sercinaddresstest, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(del)
                                            .addGap(122, 122, 122)
                                            .addComponent(back))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(129, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sercinnametest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(sercinaddresstest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cinenametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(cineaddrtest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addcinema)
                            .addComponent(update)
                            .addComponent(del)
                            .addComponent(back))
                        .addGap(37, 37, 37))
                );

                getContentPane().add(jPanel1, "card2");

                pack();
            }// </editor-fold>

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       

        		if("".equals(sercinnametest.getText())&&!"".equals(sercinaddresstest.getText())) {
			cinemalist=cinemaservice.queryCinemaByCinemaAddress(sercinaddresstest.getText());
			fillTable(cinemalist);
		}
		if("".equals(sercinaddresstest.getText())&&!"".equals(sercinnametest.getText())) {
			cinemalist=cinemaservice.queryCinemaByCinemaName(sercinnametest.getText());
			fillTable(cinemalist);
		}
		if(!"".equals(sercinnametest.getText())&&!"".equals(sercinaddresstest.getText())) {
			cinemalist=cinemaservice.queryCinemaByCinemaNameAndCinemaAddress(sercinnametest.getText(), sercinaddresstest.getText());
			fillTable(cinemalist);
		}
        // TODO add your handling code here:
    }                                      

    private void sercinnametestActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void cinenametextActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void sercinaddresstestActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void cineaddrtestActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void delActionPerformed(java.awt.event.ActionEvent evt) {                                    

        if(row!=-1) {
			SessionService sessionservice=new SessionServiceImpl();
			List<Session> list=sessionservice.querySessionBycId(cinemalist.get(row).getCid());
			if(list.size()!=0) {
				JOptionPane.showMessageDialog(null, "无法删除影院,该影院有场次");
			}else {
			if(cinemaservice.delCinema(cinemalist.get(row).getCid())) {
				JOptionPane.showMessageDialog(null, "删除影院成功");
				cinemalist.remove(row);
				fillTable(cinemalist);
			}else {
				JOptionPane.showMessageDialog(null, "删除影院失败");
			}
			}
		}
        // TODO add your handling code here:
    }                                   

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       

        if(row!=-1) {
			cinemalist.get(row).setCaddress(cineaddrtest.getText());
			cinemalist.get(row).setCname(cinenametext.getText());
			if(cinemaservice.updateCinema(cinemalist.get(row))) {
				JOptionPane.showMessageDialog(null, "修改影院成功");
				fillTable(cinemalist);
			}else {
				JOptionPane.showMessageDialog(null, "修改影院失败");
			}
		}else {
			JOptionPane.showMessageDialog(null, "请选择影院");
		}
        // TODO add your handling code here:
    }                                      

    private void addcinemaActionPerformed(java.awt.event.ActionEvent evt) {                                          
  
        if(judge()) {
			Cinema cinema=new Cinema(cinenametext.getText(),cineaddrtest.getText());
			if(cinemaservice.addCinema(cinema)==1) {
				cinemalist=cinemaservice.queryAllCinema();
				JOptionPane.showMessageDialog(null, "添加影院成功");
				fillTable(cinemalist);
				reset();
			}else if(cinemaservice.addCinema(cinema)==2){
				JOptionPane.showMessageDialog(null, "添加影院失败");
			}else {
				JOptionPane.showMessageDialog(null, "影院重复,添加影院失败");
			}
		}
        // TODO add your handling code here:
    }                                         

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
     
        new A1().setVisible(true);
        dispose();
        
        // TODO add your handling code here:
    }

    	private void fillTable(List<Cinema> cinemalist2) {
		// TODO Auto-generated method stub
		DefaultTableModel dtm=(DefaultTableModel) cinematable.getModel();
		dtm.setRowCount(0);
		int row=cinemalist2.size();
		for(int i=0;i<row;i++) {
			Vector v=new Vector();
			v.add(cinemalist2.get(i).getCid());
			v.add(cinemalist2.get(i).getCname());
			v.add(cinemalist2.get(i).getCaddress());
			dtm.addRow(v);
		}
	}

	protected void cinematablemousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		
		 row=cinematable.getSelectedRow();
		 if(row!=-1) {
			 cinenametext.setText(cinemalist.get(row).getCname());
			 cineaddrtest.setText(cinemalist.get(row).getCaddress());
		 }else {
			 
		 }
		
	}
	public boolean judge() {
		if("".equals(cinenametext.getText())) {
			JOptionPane.showMessageDialog(null, "电影名字不能为空");
			return false;
		}
		if("".equals(cineaddrtest.getText())) {
			JOptionPane.showMessageDialog(null, "电影地址不能为空");
			return false;
		}
	
		return true;
	}
    public void reset() {
    	cinenametext.setText("");
    	cineaddrtest.setText("");
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(A4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new A4().setVisible(true);
            }
        });



    }
    // Variables declaration - do not modify
    private javax.swing.JButton addcinema;
    private javax.swing.JButton back;
    private javax.swing.JTextField cineaddrtest;
    private javax.swing.JTable cinematable;
    private javax.swing.JTextField cinenametext;
    private javax.swing.JButton del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JTextField sercinaddresstest;
    private javax.swing.JTextField sercinnametest;
    private javax.swing.JButton update;
    // End of variables declaration

}
