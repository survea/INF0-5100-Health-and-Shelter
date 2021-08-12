/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.PatientRole;

import business.EcoSystem;
import business.Organization;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.HasHealthcareRepresentativeOrganization;
import business.roles.AdminRole;
import business.userAccount.UserAccount;
import business.workQueue.PatientTestRequest;
import business.workQueue.ShelterRequest;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Diksha Godse
 */
public class PatientRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegistrationJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;

    public PatientRegistrationJPanel(JPanel mainWorkArea, EcoSystem system) {
        this.userProcessContainer = mainWorkArea;
        this.system = system;
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

        jLabel1 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        lblRequestType = new javax.swing.JLabel();
        cmbRequestType = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("REGISTRATION INFORMATION");

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name");

        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Age");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Height");

        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Weight");

        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Gender");

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Declined To Answer" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblRequestType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRequestType.setText("Request");

        cmbRequestType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Treatement", "Shelter", "Both" }));
        cmbRequestType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRequestTypeActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCity.setText("Location");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity)
                                .addGap(18, 18, 18)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblRequestType)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(cmbRequestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(backJButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRequestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequestType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String fname = fName.getText();
        String lname = lName.getText();

        String gender = genderCombo.getSelectedItem().toString();
        String request = cmbRequestType.getSelectedItem().toString();
        String pic = null;

        if (fname.equals("") || lname.equals("") || age.getText().isEmpty() || height.getText().isEmpty() || weight.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all the fields!");
            return;
        }

        try {
            int age1 = Integer.parseInt(age.getText());
            int height1 = Integer.parseInt(height.getText());
            int weight1 = Integer.parseInt(weight.getText());
            if ((age1 > 110) || (age1 < 1)) {
                JOptionPane.showMessageDialog(null, "Please enter a Valid age!");
                return;
            }
//            pic = getPic(fname);
            Optional<Network> network;
            network = system.getNetworkList().stream()
                    .filter(x -> x.getName().equalsIgnoreCase(txtCity.getText()))
                    .findFirst();
            Network currentNetwork = network.get();
//            Network currentNetwork = system.getNetworkList().get(0);
            for (Enterprise ent : currentNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.enterpriseType.equalsIgnoreCase(Enterprise.EnterpriseType.Volunteer.getValue())) {
                    for(UserAccount adminUser : ent.getUserAccountDirectory().getUserAccountList()) {
                        if(adminUser.getRole() instanceof AdminRole) {
                           
                            
                            if(request.equalsIgnoreCase("treatement")){
                                 PatientTestRequest req = new PatientTestRequest();

                                req.setPatientid(PROPERTIES);
                                req.setPatientfirstname(fname);
                                req.setPatientlastname(lname);
                                req.setPheight(height1);
                                req.setPweight(weight1);
                                req.setPgender(gender);
                                req.setPimage(pic);
                                 req.setTypeOfRequest("AssignHospital");
                                req.setStatus("Awaiting hospital For initial checkup");
                                adminUser.getWorkQueue().getWorkRequestList().add(req);
                            } else {
                                ShelterRequest r = new ShelterRequest();
                                r.setTypeOfRequest("AssignShelter");
                                r.setStatus("Awaiting for Shelter");
                                r.setAssignedfor("Assign Shelter");
                                r.setShelterRequestName(fname +" "+ lname);
                                adminUser.getWorkQueue().getWorkRequestList().add(r);
                            }
                            //if (org.toString().equals(has_HealthcareOrg)) {
                                
                                //req.setPimage("Have to upload");

//                                req.setReceiver(user);
//                                user.getWorkQueue().getWorkRequestList().add(req);

//                            }
//                            if (org.toString().equals(has_ShelterOrg)) {
//
//                            }
                            fName.setText("");
                            lName.setText("");
                            age.setText("");
                            height.setText("");
                            weight.setText("");
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Patient registered succesfully. Patient can be diagnosised now");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter number for Age, Height and Weight!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void cmbRequestTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRequestTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRequestTypeActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> cmbRequestType;
    private javax.swing.JTextField fName;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JTextField height;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lName;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblRequestType;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
