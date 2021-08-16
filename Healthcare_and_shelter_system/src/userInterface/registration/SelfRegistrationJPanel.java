/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.registration;

import business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author dhairyasheel
 */
public class SelfRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelfRegistrationJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    public SelfRegistrationJPanel(JPanel userProcessContainerÏ, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainerÏ;
    }
    /**
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addjPanel3 = new javax.swing.JPanel();
        lblCourseCode = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        lblCourseName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblkeywords = new javax.swing.JLabel();
        lblCredits = new javax.swing.JLabel();
        txtGpa = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblCredits1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        lblCourseCode2 = new javax.swing.JLabel();
        txtStudentID2 = new javax.swing.JTextField();
        txtStudentID3 = new javax.swing.JTextField();
        lblCourseCode3 = new javax.swing.JLabel();
        lblCourseCode4 = new javax.swing.JLabel();
        lblCourseCode5 = new javax.swing.JLabel();
        addjPanel4 = new javax.swing.JPanel();
        lblCourseCode1 = new javax.swing.JLabel();
        txtStudentID1 = new javax.swing.JTextField();
        lblCourseName1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        lblCredits2 = new javax.swing.JLabel();
        txtGpa1 = new javax.swing.JTextField();
        lblCredits4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));

        addjPanel3.setBackground(new java.awt.Color(254, 254, 254));
        addjPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Personal Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        lblCourseCode.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseCode.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseCode.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseCode.setText("First Name:");

        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });

        lblCourseName.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseName.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseName.setText("Last Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblkeywords.setBackground(new java.awt.Color(254, 254, 254));
        lblkeywords.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblkeywords.setForeground(new java.awt.Color(114, 150, 180));
        lblkeywords.setText("Date of Birth:");

        lblCredits.setBackground(new java.awt.Color(254, 254, 254));
        lblCredits.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCredits.setForeground(new java.awt.Color(114, 150, 180));
        lblCredits.setText("Age:");

        lblCredits1.setBackground(new java.awt.Color(254, 254, 254));
        lblCredits1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCredits1.setForeground(new java.awt.Color(114, 150, 180));
        lblCredits1.setText("Gender: ");

        jRadioButton1.setText("Female");

        jRadioButton2.setText("Male");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Other");

        lblCourseCode2.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseCode2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseCode2.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseCode2.setText("Height:");

        txtStudentID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentID2ActionPerformed(evt);
            }
        });

        txtStudentID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentID3ActionPerformed(evt);
            }
        });

        lblCourseCode3.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseCode3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseCode3.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseCode3.setText("Weight:");

        lblCourseCode4.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseCode4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseCode4.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseCode4.setText("lbs");

        lblCourseCode5.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseCode5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseCode5.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseCode5.setText("ft");

        javax.swing.GroupLayout addjPanel3Layout = new javax.swing.GroupLayout(addjPanel3);
        addjPanel3.setLayout(addjPanel3Layout);
        addjPanel3Layout.setHorizontalGroup(
            addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addjPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblCourseCode))
                    .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCredits1)
                        .addComponent(lblkeywords)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addjPanel3Layout.createSequentialGroup()
                        .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudentID)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addGap(166, 166, 166)
                        .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addjPanel3Layout.createSequentialGroup()
                                .addComponent(lblCourseName)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addjPanel3Layout.createSequentialGroup()
                                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCredits)
                                    .addComponent(lblCourseCode2))
                                .addGap(18, 18, 18)
                                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addjPanel3Layout.createSequentialGroup()
                                        .addComponent(txtStudentID2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCourseCode5))))))
                    .addGroup(addjPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addjPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCourseCode3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStudentID3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCourseCode4)
                .addGap(253, 253, 253))
        );
        addjPanel3Layout.setVerticalGroup(
            addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseCode)
                    .addComponent(lblCourseName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblkeywords)
                        .addComponent(lblCredits)
                        .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(txtStudentID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseCode2)
                    .addComponent(lblCourseCode5)
                    .addComponent(lblCredits1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseCode3)
                    .addComponent(lblCourseCode4))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        addjPanel4.setBackground(new java.awt.Color(254, 254, 254));
        addjPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Other Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        lblCourseCode1.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseCode1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseCode1.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseCode1.setText("Email:");

        txtStudentID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentID1ActionPerformed(evt);
            }
        });

        lblCourseName1.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseName1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseName1.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseName1.setText("Contact No:");

        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });

        lblCredits2.setBackground(new java.awt.Color(254, 254, 254));
        lblCredits2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCredits2.setForeground(new java.awt.Color(114, 150, 180));
        lblCredits2.setText("Location:");

        lblCredits4.setBackground(new java.awt.Color(254, 254, 254));
        lblCredits4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCredits4.setForeground(new java.awt.Color(114, 150, 180));
        lblCredits4.setText("Request for:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Health Care", "Shelter", "Both Health care and Shelter" }));

        javax.swing.GroupLayout addjPanel4Layout = new javax.swing.GroupLayout(addjPanel4);
        addjPanel4.setLayout(addjPanel4Layout);
        addjPanel4Layout.setHorizontalGroup(
            addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel4Layout.createSequentialGroup()
                .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addjPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCredits4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addjPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCredits2)
                            .addComponent(lblCourseCode1))
                        .addGap(18, 18, 18)
                        .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addjPanel4Layout.createSequentialGroup()
                                .addComponent(txtStudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)
                                .addComponent(lblCourseName1)
                                .addGap(18, 18, 18)
                                .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addjPanel4Layout.setVerticalGroup(
            addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCourseName1)
                        .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCourseCode1)
                        .addComponent(txtStudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGpa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCredits2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCredits4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(72, 74, 95));
        jButton1.setText("SUBMIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addjPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addjPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(addjPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addjPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtStudentID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentID1ActionPerformed

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void txtStudentID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentID2ActionPerformed

    private void txtStudentID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentID3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addjPanel3;
    private javax.swing.JPanel addjPanel4;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseCode1;
    private javax.swing.JLabel lblCourseCode2;
    private javax.swing.JLabel lblCourseCode3;
    private javax.swing.JLabel lblCourseCode4;
    private javax.swing.JLabel lblCourseCode5;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCourseName1;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblCredits1;
    private javax.swing.JLabel lblCredits2;
    private javax.swing.JLabel lblCredits4;
    private javax.swing.JLabel lblkeywords;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtGpa1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentID1;
    private javax.swing.JTextField txtStudentID2;
    private javax.swing.JTextField txtStudentID3;
    // End of variables declaration//GEN-END:variables
}
