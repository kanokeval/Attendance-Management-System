
package atteandance.management;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
public class Add_Attandence extends javax.swing.JFrame {

    /**
     * Creates new form student_page
     */
    public Add_Attandence() 
    {
        initComponents();
        setLocation(250,150);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attendancegroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendancetable = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        studid = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        lbltitle = new javax.swing.JLabel();
        lblattendance = new javax.swing.JLabel();
        rbtpresent = new javax.swing.JRadioButton();
        rbtabsent = new javax.swing.JRadioButton();
        btnsubmit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 71, 79));

        jPanel2.setBackground(new java.awt.Color(222, 238, 231));
        jPanel2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jPanel2InputMethodTextChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 71, 79));
        jLabel1.setText("ADD ATTANDENCE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        attendancetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name"
            }
        ));
        attendancetable.setEnabled(false);
        jScrollPane1.setViewportView(attendancetable);

        btnview.setBackground(new java.awt.Color(0, 153, 153));
        btnview.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 153, 153));
        btnback.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        studid.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        studid.setForeground(new java.awt.Color(222, 238, 231));
        studid.setText("Student ID");

        txtid.setBackground(new java.awt.Color(0, 0, 0));
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(222, 238, 231));
        lbltitle.setText("Attendance Details");

        lblattendance.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblattendance.setForeground(new java.awt.Color(222, 238, 231));
        lblattendance.setText("Attendance");

        attendancegroup.add(rbtpresent);
        rbtpresent.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        rbtpresent.setForeground(new java.awt.Color(0, 153, 0));
        rbtpresent.setText("Present");
        rbtpresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtpresentActionPerformed(evt);
            }
        });

        attendancegroup.add(rbtabsent);
        rbtabsent.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        rbtabsent.setForeground(new java.awt.Color(255, 0, 0));
        rbtabsent.setText("Absent");
        rbtabsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtabsentActionPerformed(evt);
            }
        });

        btnsubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnsubmit.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(0, 153, 153));
        btncancel.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsubmit)
                        .addGap(85, 85, 85)
                        .addComponent(btncancel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(studid)
                                    .addComponent(lblattendance))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtpresent)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtabsent, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(lbltitle)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnview)
                .addGap(94, 94, 94)
                .addComponent(btnback)
                .addContainerGap(565, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbltitle)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studid))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblattendance)
                            .addComponent(rbtpresent)
                            .addComponent(rbtabsent))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsubmit)
                            .addComponent(btncancel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnview))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jPanel2InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2InputMethodTextChanged

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        try
        {
            ConnectionProject cp = new ConnectionProject();
            String query="select * from AddStudent";
            ResultSet rs=cp.stmt.executeQuery(query);
            attendancetable.setModel(DbUtils.resultSetToTableModel(rs)); 
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void rbtpresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtpresentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtpresentActionPerformed

    private void rbtabsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtabsentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtabsentActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
            
            String id=txtid.getText();
            String attendance=null;
            if(rbtpresent.isSelected())
                attendance="Present";
            else
                attendance="Absent";
            
            try
            {
                if(txtid.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please Enter Id");
                }
                else
                {
                    ConnectionProject cp = new ConnectionProject();
                    String query="select * from AddStudent where id='"+id+"'";
                    ResultSet rs=cp.stmt.executeQuery(query);
                    
                    if(rs.next())
                    {
                        String query1="insert into AddAttendance values('"+id+"','"+attendance+"')";
                        cp.stmt.executeUpdate(query1);
                        JOptionPane.showMessageDialog(null, "Inserted Successfully" + "\n" + "Id : " + id + "\n" +"Attendance : " + attendance);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Not Found Id");
                    }
                    rs.close();
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
                
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_btncancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Attandence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup attendancegroup;
    private javax.swing.JTable attendancetable;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblattendance;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JRadioButton rbtabsent;
    private javax.swing.JRadioButton rbtpresent;
    private javax.swing.JLabel studid;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables


}
