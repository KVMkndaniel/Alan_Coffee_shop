import javax.swing.JOptionPane;
import  models.User;
import Database.UserDB;
import Database.DbOperations;
import Database.tables;


/**
 *
 * @author ELCOT
 */
public class Signup extends javax.swing.JFrame {
    
    public Signup() {
        initComponents();
       //jButton_reg1.setEnabled(false);
    }
    
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$" ;
    public String mobileNumberPattern = "^[0-9]*$";
    
    
    private javax.swing.JLabel  titellabel1;
      private javax.swing.JTextField jTextField_fname;
      private javax.swing. JTextField jTextFieldlastname;
      private javax.swing.JTextField jTextFld_uname;
      private javax.swing.JTextField jTextFld_jCmBox1_gender;
       private javax.swing.JTextField jTextFld_phonenum;
       private javax.swing.JTextField jTextFld_email;
       private javax.swing.JPasswordField jTextField_pwd;
       private javax.swing.JPasswordField jTextField_cpasswd;
       private javax.swing.JButton jButton_reg1;
        private javax.swing.JButton jButton_exit1;
        private javax.swing.JButton jButton_back1;
    

    /**
     * Creates new form Signup
     */
    
    public void Clear(){
        jTextField_fname.setText("");
        jTextFieldlastname.setText("");
        jTextFld_uname.setText("");
         jTextFld_jCmBox1_gender.setText("");
        jTextFld_phonenum.setText("");
         jTextFld_email.setText("");
        jTextField_pwd.setText("");
        jTextField_cpasswd.setText("");
         jButton_reg1.setEnabled(false);
        
    }
    public void validateFields(){
           String First_name = jTextField_fname.getText();
       String Last_name = jTextFieldlastname.getText();
     String User_name =  jTextFld_uname.getText();
       String Gender =  jTextFld_jCmBox1_gender.getText();
     String  phone_number =  jTextFld_phonenum.getText();
       String email_id =  jTextFld_email.getText();
       String Password =jTextField_pwd.getText();
      String  ConfirmPassword = jTextField_cpasswd.getText();        
    
        if(email_id.matches(emailPattern)  && phone_number.matches(mobileNumberPattern) &&  phone_number.length() == 10 )
        {
        
               jButton_reg1.setEnabled(true);
        }   
        else { 
               jButton_reg1.setEnabled(false);
        }
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel titellabel1 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField_fname = new javax.swing.JTextField();
        javax.swing.JTextField jTextFieldlastname = new javax.swing.JTextField();
        javax.swing.JTextField jTextFld_uname = new javax.swing.JTextField();
        javax.swing.JComboBox<String> jTextFld_jCmBox1_gender = new javax.swing.JComboBox<>();
        javax.swing.JTextField jTextFld_phonenum = new javax.swing.JTextField();
        javax.swing.JTextField jTextFld_email = new javax.swing.JTextField();
        javax.swing.JTextField jTextField_pwd = new javax.swing.JTextField();
        javax.swing.JTextField jTextField_cpasswd = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JButton jButton_exit1 = new javax.swing.JButton();
        javax.swing.JButton jButton_reg1 = new javax.swing.JButton();
        javax.swing.JButton jButton_back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        titellabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        titellabel1.setForeground(new java.awt.Color(255, 255, 255));
        titellabel1.setText("SignUp");

        jTextField_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fnameActionPerformed(evt);
            }
        });
        jTextField_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_fnameKeyReleased(evt);
            }
        });

        jTextFieldlastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldlastnameKeyReleased(evt);
            }
        });

        jTextFld_uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFld_unameKeyReleased(evt);
            }
        });

        jTextFld_jCmBox1_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose the Gender", "Male", "Female", "Other" }));
        jTextFld_jCmBox1_gender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFld_jCmBox1_genderKeyReleased(evt);
            }
        });

        jTextFld_phonenum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFld_phonenumKeyReleased(evt);
            }
        });

        jTextFld_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFld_emailKeyReleased(evt);
            }
        });

        jTextField_pwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_pwdKeyReleased(evt);
            }
        });

        jTextField_cpasswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_cpasswdKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confrim Password      :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password                    :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email ID                     :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone Number           :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender                      :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Name                :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Last Name                : ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Frist Name                :");

        jButton_exit1.setBackground(new java.awt.Color(255, 0, 0));
        jButton_exit1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_exit1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_exit1.setText("Exit");
        jButton_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exit1ActionPerformed(evt);
            }
        });

        jButton_reg1.setBackground(new java.awt.Color(0, 255, 0));
        jButton_reg1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_reg1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_reg1.setText("Register");
        jButton_reg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_reg1MouseClicked(evt);
            }
        });
        jButton_reg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reg1ActionPerformed(evt);
            }
        });

        jButton_back1.setBackground(new java.awt.Color(102, 102, 102));
        jButton_back1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_back1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_back1.setText("Clear");
        jButton_back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_pwd)
                            .addComponent(jTextField_cpasswd)
                            .addComponent(jTextFld_phonenum)
                            .addComponent(jTextFld_uname)
                            .addComponent(jTextField_fname)
                            .addComponent(jTextFieldlastname)
                            .addComponent(jTextFld_email)
                            .addComponent(jTextFld_jCmBox1_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_exit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_reg1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jButton_back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(titellabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(titellabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFld_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFld_jCmBox1_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFld_phonenum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton_reg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_back1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_cpasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFld_email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exit1ActionPerformed
        // TODO add your handling code here:
         int a = JOptionPane.showConfirmDialog(null, "Do You really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
      

    }//GEN-LAST:event_jButton_exit1ActionPerformed

    private void jButton_reg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_reg1MouseClicked

    }//GEN-LAST:event_jButton_reg1MouseClicked

    private void jButton_reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reg1ActionPerformed

        User user1 = new User();
        user1.setFirst_name (jTextField_fname.getText());
        user1.setLast_name (jTextFieldlastname.getText());
        user1.setUser_name ( jTextFld_uname.getText());
        user1.setGender (  jTextFld_jCmBox1_gender.getText());
        user1.setphone_number ( jTextFld_phonenum.getText());
        user1.setemail_id (  jTextFld_email.getText());
        user1.setPassword (jTextField_pwd.getText());
        user1.setConfirmPassword(jTextField_cpasswd.getText());
        User.reg(user1);
        Clear();
        
    }//GEN-LAST:event_jButton_reg1ActionPerformed

    private void jButton_back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_back1ActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_jButton_back1ActionPerformed

    private void jTextField_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_fnameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jTextField_fnameKeyReleased

    private void jTextFieldlastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldlastnameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jTextFieldlastnameKeyReleased

    private void jTextFld_unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFld_unameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jTextFld_unameKeyReleased

    private void jTextFld_jCmBox1_genderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFld_jCmBox1_genderKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jTextFld_jCmBox1_genderKeyReleased

    private void jTextFld_phonenumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFld_phonenumKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jTextFld_phonenumKeyReleased

    private void jTextFld_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFld_emailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jTextFld_emailKeyReleased

    private void jTextField_pwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pwdKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jTextField_pwdKeyReleased

    private void jTextField_cpasswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cpasswdKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jTextField_cpasswdKeyReleased

    private void jTextField_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fnameActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
