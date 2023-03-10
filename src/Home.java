
import java.awt.Color;



/**
 *
 * @author ELCOT
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton btn_home = new javax.swing.JButton();
        javax.swing.JButton btn_sales = new javax.swing.JButton();
        javax.swing.JButton btnQuanLy = new javax.swing.JButton();
        javax.swing.JButton btnThongKe = new javax.swing.JButton();
        javax.swing.JButton btnthoat = new javax.swing.JButton();
        javax.swing.JPanel jpLayout = new javax.swing.JPanel();
        javax.swing.JButton btnQuanLy1 = new javax.swing.JButton();
        javax.swing.JButton btn_sales1 = new javax.swing.JButton();
        javax.swing.JButton btn_sales2 = new javax.swing.JButton();
        javax.swing.JButton btn_home1 = new javax.swing.JButton();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background 2.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(245, 210, 103));
        btn_home.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btn_home.setText("ACCOUNTS          ");
        btn_home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 164, 0), 3));
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_home.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_home.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_homeFocusGained(evt);
            }
        });
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_homeMouseReleased(evt);
            }
        });
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 190, 50));

        btn_sales.setBackground(new java.awt.Color(245, 210, 103));
        btn_sales.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btn_sales.setForeground(new java.awt.Color(51, 51, 51));
        btn_sales.setText("  SALES               ");
        btn_sales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 164, 0), 3));
        btn_sales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sales.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_sales.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 190, 50));

        btnQuanLy.setBackground(new java.awt.Color(245, 210, 103));
        btnQuanLy.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnQuanLy.setForeground(new java.awt.Color(51, 51, 51));
        btnQuanLy.setText("CUSTOMER DETAILS");
        btnQuanLy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 164, 0), 3));
        btnQuanLy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanLy.setPreferredSize(new java.awt.Dimension(140, 49));
        btnQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 190, 50));

        btnThongKe.setBackground(new java.awt.Color(245, 210, 103));
        btnThongKe.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(51, 51, 51));
        btnThongKe.setText("ORDERS  ");
        btnThongKe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 164, 0), 3));
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        getContentPane().add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 50));

        btnthoat.setBackground(new java.awt.Color(245, 210, 103));
        btnthoat.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnthoat.setText("SIGN OUT ");
        btnthoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color( 219, 164, 0), 3));
        btnthoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnthoat.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnthoat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnthoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 100, 40));

        jpLayout.setBackground(Color.decode("#e6e6e6")
        );
        jpLayout.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 0), new java.awt.Color(0, 51, 51)));
        jpLayout.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jpLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 900, 500));

        btnQuanLy1.setBackground(new java.awt.Color(245, 210, 103));
        btnQuanLy1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnQuanLy1.setForeground(new java.awt.Color(51, 51, 51));
        btnQuanLy1.setText("       BILLING         ");
        btnQuanLy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 164, 0), 3));
        btnQuanLy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanLy1.setPreferredSize(new java.awt.Dimension(140, 49));
        btnQuanLy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLy1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuanLy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, 50));

        btn_sales1.setBackground(new java.awt.Color(245, 210, 103));
        btn_sales1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btn_sales1.setForeground(new java.awt.Color(51, 51, 51));
        btn_sales1.setText("EMPLOYEE DETAILS   ");
        btn_sales1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 164, 0), 3));
        btn_sales1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sales1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_sales1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_sales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sales1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 190, 50));

        btn_sales2.setBackground(new java.awt.Color(245, 210, 103));
        btn_sales2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btn_sales2.setForeground(new java.awt.Color(51, 51, 51));
        btn_sales2.setText("  SALES             ");
        btn_sales2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 164, 0), 3));
        btn_sales2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sales2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_sales2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_sales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sales2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sales2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 40));

        btn_home1.setBackground(new java.awt.Color(245, 210, 103));
        btn_home1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btn_home1.setText("STOCK DETAILS      ");
        btn_home1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 164, 0), 3));
        btn_home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_home1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_home1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_home1FocusGained(evt);
            }
        });
        btn_home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_home1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_home1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_home1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_home1MouseReleased(evt);
            }
        });
        btn_home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ALAN COFFEE SHOP (1).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, 70, 610, 560));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background 2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background 2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background 2.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background 2.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background 2.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ALAN COFFEE SHOP (1).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -90, 470, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_homeFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_homeFocusGained

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed

    }//GEN-LAST:event_btn_homeMousePressed

    private void btn_homeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_homeMouseReleased

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        //reloadPanel(2);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salesActionPerformed
      //  reloadPanel(1);
    }//GEN-LAST:event_btn_salesActionPerformed

    private void btnQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyActionPerformed
        // TODO add your handling code here:

        //reloadPanel(3);

    }//GEN-LAST:event_btnQuanLyActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
     //   reloadPanel(4);
        //        this.dispose();
        //        Run.rerun();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        dispose();
        loginpage log2 = new loginpage();
        log2.setVisible(true);
      /*  int kq=JOptionPane.showConfirmDialog(null, "????ng xu???t kh???i t??i kho???n " +Run.tk.GetUsername()+ "?","FBI Warning",JOptionPane.YES_NO_OPTION);
        if(kq==0)
        {
            //    MP3 mp3 = new MP3 ("src/Sound/tyaran.MP3");
            //  mp3.play();
            Run.frmlg.setVisible(true);
            Run.frmlg.thoat();
            this.setVisible(false);
        }*/

    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnQuanLy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLy1ActionPerformed
        // TODO add your handling code here:

     //   reloadPanel(3);

    }//GEN-LAST:event_btnQuanLy1ActionPerformed

    private void btn_sales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sales1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sales1ActionPerformed

    private void btn_sales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sales2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sales2ActionPerformed

    private void btn_home1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_home1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home1FocusGained

    private void btn_home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home1MouseClicked

    private void btn_home1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home1MouseEntered

    private void btn_home1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home1MouseExited

    private void btn_home1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home1MousePressed

    private void btn_home1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home1MouseReleased

    private void btn_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
