/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atteandance.management;

import javax.swing.JOptionPane;


public class LOGIN_PAGE extends javax.swing.JFrame {

    
    public LOGIN_PAGE() {
        initComponents();
        setLocation(250,150);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        lblmsg = new javax.swing.JLabel();
        btncancle = new javax.swing.JButton();
        btnteacher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(222, 238, 231));

        jLabel4.setBackground(new java.awt.Color(55, 71, 79));
        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel4.setText("ATTENDANCE");

        jLabel5.setBackground(new java.awt.Color(55, 71, 79));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setText("MANAGEMENT");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atteandance/management/Attendance icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel5)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(55, 71, 79));

        jLabel1.setBackground(new java.awt.Color(222, 238, 231));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 238, 231));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(222, 238, 231));
        jLabel2.setText("USERNAME\n");

        txtuser.setBackground(new java.awt.Color(0, 0, 0));
        txtuser.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(222, 238, 231));
        jLabel3.setText("PASSWORD");

        jButton1.setBackground(new java.awt.Color(222, 238, 231));
        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(55, 71, 79));
        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtpass.setBackground(new java.awt.Color(0, 0, 0));
        txtpass.setForeground(new java.awt.Color(255, 255, 255));

        lblmsg.setForeground(new java.awt.Color(204, 0, 51));

        btncancle.setBackground(new java.awt.Color(222, 238, 231));
        btncancle.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btncancle.setForeground(new java.awt.Color(55, 71, 79));
        btncancle.setText("cancle");
        btncancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancleActionPerformed(evt);
            }
        });

        btnteacher.setBackground(new java.awt.Color(222, 238, 231));
        btnteacher.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnteacher.setForeground(new java.awt.Color(55, 71, 79));
        btnteacher.setText("Teacher Login");
        btnteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnteacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(191, 191, 191)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(159, 159, 159)
                                    .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                            .addComponent(txtpass)))))
                            .addGap(19, 19, 19))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(btncancle)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnteacher)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btncancle))
                .addGap(42, 42, 42)
                .addComponent(btnteacher)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           String username = txtuser.getText();
           String password = txtpass.getText();
           
           if(username.equals("keval") && password.equals("keval123"))
           {
               JOptionPane.showMessageDialog(null,"Welcome Admin");
               this.dispose();
               HomePage h1 = new HomePage();
               h1.show();
           }
           
           else if(!username.equals("keval"))
           {
              lblmsg.setText("wrong username");
           }
 
           else if(!password.equals("keval123"))
           {
              lblmsg.setText("wrong password");
           }
           else
           {
               lblmsg.setText("invalid username and password");
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancleActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btncancleActionPerformed

    private void btnteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnteacherActionPerformed
            Teacher_Login t1 = new Teacher_Login();
            t1.show();
            this.dispose();
    }//GEN-LAST:event_btnteacherActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_PAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancle;
    private javax.swing.JButton btnteacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
