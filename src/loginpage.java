
import Database.tables;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class loginpage extends javax.swing.JFrame {
    
    
    
      private JTextField jTextFld_uname;  
    private JPasswordField txt_upwd;
 

 
    public loginpage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JTextField txtuname = new javax.swing.JTextField();
        javax.swing.JPasswordField txt_upwd = new javax.swing.JPasswordField();
        javax.swing.JButton log_button = new javax.swing.JButton();
        javax.swing.JButton log_exit = new javax.swing.JButton();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("User Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });
        txtuname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtunameKeyReleased(evt);
            }
        });
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 230, 30));
        getContentPane().add(txt_upwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 230, 30));

        log_button.setBackground(new java.awt.Color(0, 153, 255));
        log_button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        log_button.setForeground(new java.awt.Color(255, 255, 255));
        log_button.setText("LOGIN");
        log_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(log_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 100, 30));

        log_exit.setBackground(new java.awt.Color(255, 0, 102));
        log_exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        log_exit.setForeground(new java.awt.Color(255, 255, 255));
        log_exit.setText("EXIT");
        log_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_exitActionPerformed(evt);
            }
        });
        getContentPane().add(log_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 100, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("LOGIN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 0));
        jLabel7.setText("Don't Have An account ?.. Register");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 270, -1));

        jLabel8.setText("ForgetPassword ?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ALAN COFFEE SHOP.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 630, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunameActionPerformed

    private void log_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_buttonActionPerformed
    
        tables con = new tables();
        String User_name=  jTextFld_uname.getText();
         String password = String.valueOf( txt_upwd.getPassword());
        String table = "user";
        String column1 = "User_name";
        String column2 = "password";
        try {
            ResultSet rs;   
            rs = con.user(table,column1,User_name,column2,password);
            if (rs.next()) {
                Home list = new Home();
                loginpage.this.setVisible(false);
                list.setVisible(true);
                //list.showData();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Username Or Password", "Login Failed", 2);
            }
            rs.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
      
    }//GEN-LAST:event_log_buttonActionPerformed

    private void log_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_log_exitActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
 dispose();
Signup sig = new Signup();
 sig.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtunameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtunameKeyReleased

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
