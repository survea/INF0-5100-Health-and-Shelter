/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.nurseRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.NurseOrganization;
import business.roles.AdminRole;
import business.userAccount.UserAccount;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Diksha Godse
 */
public class PatientInitialTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientInitialTestJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    NurseOrganization nurseOrganization;
    EcoSystem business;
    Enterprise enter;
    WorkRequest request;
    Network network;
    JSplitPane jSplitPane2;
    private static final Pattern bloodPattern = Pattern.compile("^(A|B|AB|O)[-+]$");

    PatientInitialTestJPanel(JPanel userProcessContainer, UserAccount userAccount, NurseOrganization nurseOrganization, EcoSystem business, Enterprise enter, Network network, WorkRequest request, JSplitPane jSplitPane2) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.nurseOrganization = nurseOrganization;
        this.business = business;
        this.enter = enter;
        this.request = request;
        this.network = network;
        this.jSplitPane2 = jSplitPane2;
        initComponents();
        populatePatientData();
    }

    private int validateBloodGroup(String validate) {
        Matcher match = bloodPattern.matcher(validate);
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        patientfee = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        imagePlacer = new javax.swing.JLabel();
        bodyTemp = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        bldGrp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bldPres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        priority = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        gluLvl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        diagnosis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientSym = new javax.swing.JTextArea();

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Gender");

        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });

        patientfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientfeeActionPerformed(evt);
            }
        });

        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Age");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Body Temperature");

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("First Name");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Glucose Level");

        imagePlacer.setBackground(new java.awt.Color(254, 254, 254));

        btnSubmit.setText("SUBMIT RESULTS");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        bldGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bldGrpActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Blood Group");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Weight");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Blood Pressure");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        priority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Symptoms");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Height");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Possible Diagnosis");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("PATIENT PHOTO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Approx Diagnosis Fee");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Priority");

        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });

        diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" Patient Initial test form");

        patientSym.setColumns(20);
        patientSym.setRows(5);
        jScrollPane1.setViewportView(patientSym);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnSubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientfee)
                            .addComponent(priority)
                            .addComponent(diagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bodyTemp)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))))
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagePlacer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)))
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel13)
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel16))
                                    .addGap(2, 2, 2))
                                .addComponent(jLabel2))
                            .addGap(73, 73, 73)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bldPres, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gluLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bldGrp)
                                .addComponent(weight)
                                .addComponent(height)
                                .addComponent(age)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fName, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addComponent(lName))))
                    .addContainerGap(410, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {age, bldGrp, bldPres, diagnosis, fName, gender, gluLvl, height, imagePlacer, lName, patientfee, priority, weight});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(imagePlacer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(bodyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(51, 51, 51)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(patientfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnSubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bldGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bldPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gluLvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel16)
                    .addContainerGap(302, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {age, bldGrp, bldPres, bodyTemp, fName, gender, gluLvl, height, lName, weight});

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void diagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosisActionPerformed

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

    private void priorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priorityActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void bldGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bldGrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bldGrpActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //request.setTestResult(resultJTextField.getText());
        int check = 0;
        int checkBlood = 0;

        if (bldGrp.getText().isEmpty() || bldPres.getText().isEmpty() || bodyTemp.getText().isEmpty() || gluLvl.getText().isEmpty() || patientSym.getText().isEmpty() || diagnosis.getText().isEmpty() || priority.getText().isEmpty() || patientfee.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Patient Registration cannot be completed as one or more fields are empty");
        } else {
            int checkint = 0;
            check = 1;

            checkBlood = validateBloodGroup(bldGrp.getText());
            String fname = fName.getText();
            String lname = lName.getText();
            int age1 = 0;
            int height1 = 0;
            int weight1 = 0;
            float bTemp = 0;
            float gLevel = 0;
            float bPress = 0;
            int patientFee = 0;

            try {
                age1 = Integer.parseInt(age.getText());
                height1 = Integer.parseInt(height.getText());
                weight1 = Integer.parseInt(weight.getText());
                bTemp = Float.parseFloat(bodyTemp.getText());
                gLevel = Float.parseFloat(gluLvl.getText());
                bPress = Float.parseFloat(bldPres.getText());
                patientFee = Integer.parseInt(patientfee.getText());
                checkint = 1;
                if (checkBlood != 1) {
                    JOptionPane.showMessageDialog(null, "Please Enter the Blood Group in the format - 'B+'");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please Enter the Body Temperature, Blood Pressure, Glucose Level and Patient Fee in Digits!");
            }
            if (check == 1 && checkint == 1 && checkBlood != 0) {

                if ((request.getTypeOfRequest().equals("InitialCheckupNurseAssigned"))) {
                    request.setPatientid(patientFee);
                    request.setPatientfirstname(fName.getText());
                    request.setPatientlastname(lName.getText());
                    request.setAge(Integer.parseInt(age.getText()));
                    request.setPheight(Integer.parseInt(height.getText()));
                    request.setPweight(Integer.parseInt(weight.getText()));
                    request.setPgender(gender.getText());
                    request.setPbloodgrp(bldGrp.getText());
                    request.setPbloodpres(bldPres.getText());
                    request.setPbodytemp(Float.parseFloat(bodyTemp.getText()));
                    request.setPglucoselvl(Float.parseFloat(gluLvl.getText()));
                    request.setPsymptoms(patientSym.getText());
                    request.setPdiagnosis(diagnosis.getText());
                    request.setPpriority(priority.getText());
                    request.setReceiver(userAccount);
                    request.setApproxPatientFee(Integer.parseInt(patientfee.getText()));
                    userProcessContainer.remove(this);
                    request.setStatus("Admin Waiting");
                    request.setTypeOfRequest("NGODecision");
                    JOptionPane.showMessageDialog(null, "Patient Details sent to the System Admin for Approval!");
                    fName.setText("");
                    lName.setText("");
                    age.setText("");
                    height.setText("");
                    weight.setText("");
                    gender.setText("");
                    bldGrp.setText("");
                    bldPres.setText("");
                    bodyTemp.setText("");
                    gluLvl.setText("");
                    patientSym.setText("");
                    patientfee.setText("");
                    diagnosis.setText("");
                    priority.setText("");
//                    for (Enterprise enterp : network.getEnterpriseDirectory().getEnterpriseList()) {
//                        if (enterp.getEnterpriseType().equalsIgnoreCase(Enterprise.EnterpriseType.Volunteer.getValue())) {
//                            for (UserAccount hASAdmin : enterp.getUserAccountDirectory().getUserAccountList()) {
//                                if (hASAdmin.getRole() instanceof AdminRole) {
//                                    System.out.println(hASAdmin);
//                                    request.setReceiver(hASAdmin);
//                                    hASAdmin.getWorkQueue().getWorkRequestList().add(request);
//                                }
//                            }
//                        }
//                    }
                    PatientListInitialTestReqJPanel pitjp = new PatientListInitialTestReqJPanel(userProcessContainer, userAccount, nurseOrganization, enter, network, business, jSplitPane2);
                    jSplitPane2.setRightComponent(pitjp);
                    pitjp.populateTable();
                }
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void patientfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientfeeActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField bldGrp;
    private javax.swing.JTextField bldPres;
    private javax.swing.JTextField bodyTemp;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField diagnosis;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField gluLvl;
    private javax.swing.JTextField height;
    private javax.swing.JLabel imagePlacer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lName;
    private javax.swing.JTextArea patientSym;
    private javax.swing.JTextField patientfee;
    private javax.swing.JTextField priority;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables

    private void populatePatientData() {
        fName.setText(request.getPatientfirstname());
        lName.setText(request.getPatientlastname());
        age.setText(Integer.toString(request.getAge()));
        height.setText(Integer.toString(request.getPheight()));
        weight.setText(Integer.toString(request.getPweight()));
        gender.setText(request.getPgender());
//        String picture = request.getPimage();
//        System.out.println(picture);
//        ImageIcon pic1 = new ImageIcon(picture);
//        pic1 = new ImageIcon(pic1.getImage().getScaledInstance(130, 150, Image.SCALE_SMOOTH));
//        imagePlacer.setIcon(pic1);

                if(request.getPimage() == null)
            request.setPimage("/userProfilePictures/default_profile_picture.jpg");
        setProfilePicture(request);
    }

    private void setProfilePicture(WorkRequest request) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("./src" + request.getPimage()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(130, 150, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        imagePlacer.setIcon(imageIcon);
    }
}
