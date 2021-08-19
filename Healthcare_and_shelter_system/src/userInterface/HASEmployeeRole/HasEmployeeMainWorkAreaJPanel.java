/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HASEmployeeRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.HasHealthcareRepresentativeOrganization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import userInterface.HomeJPanel;
import userInterface.MainJFrame;
import userInterface.PersonalDetailsJPanel;

/**
 *
 * @author Diksha Godse
 */
public class HasEmployeeMainWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HasEmployeeMainWorkAreaJPanel
     */
//    public HasEmployeeMainWorkAreaJPanel() {
//        initComponents();
//    }
    JPanel userProcessContainer;
    UserAccount account;
    HasHealthcareRepresentativeOrganization organization;
    Enterprise enterprise;
    EcoSystem business;

    public HasEmployeeMainWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HasHealthcareRepresentativeOrganization organization, Enterprise enterprise, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        initComponents();
        if (account.getPersonPicture() == null) {
            account.setPersonPicture("/userProfilePictures/default_profile_picture.jpg");
        }
        setProfilePicture();
        lblPersonName.setText(account.getUsername());
        lblEnterpriseName.setText(enterprise.getName());
    }

    private void setProfilePicture() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("./src" + account.getPersonPicture()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblPicture.setIcon(imageIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        lblEcosystemName = new javax.swing.JLabel();
        btnAboutUs2 = new javax.swing.JButton();
        lblEnterpriseName = new javax.swing.JLabel();
        btnUpdateProfile = new javax.swing.JButton();
        btnMAnageHealthCareReq1 = new javax.swing.JButton();
        manageOrganizationJButton2 = new javax.swing.JButton();
        manageOrganizationJButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));

        lblPersonName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblPersonName.setText("test name");

        lblEcosystemName.setBackground(new java.awt.Color(254, 254, 254));
        lblEcosystemName.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblEcosystemName.setForeground(new java.awt.Color(60, 76, 123));
        lblEcosystemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcosystemName.setText("HOSPITAL ADMIN");

        btnAboutUs2.setBackground(new java.awt.Color(254, 254, 254));
        btnAboutUs2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAboutUs2.setForeground(new java.awt.Color(200, 35, 24));
        btnAboutUs2.setText("Logout");
        btnAboutUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUs2ActionPerformed(evt);
            }
        });

        lblEnterpriseName.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblEnterpriseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnUpdateProfile.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnUpdateProfile.setText("UPDATE PROFILE");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        btnMAnageHealthCareReq1.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnMAnageHealthCareReq1.setText("VIEW STATISTICS");
        btnMAnageHealthCareReq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAnageHealthCareReq1ActionPerformed(evt);
            }
        });

        manageOrganizationJButton2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        manageOrganizationJButton2.setText("WORK REQUEST STATUS");
        manageOrganizationJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButton2ActionPerformed(evt);
            }
        });

        manageOrganizationJButton1.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        manageOrganizationJButton1.setText("UNASSIGNED WORK REQUESTS");
        manageOrganizationJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAboutUs2)
                    .addComponent(btnMAnageHealthCareReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(manageOrganizationJButton1)
                    .addComponent(manageOrganizationJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEcosystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMAnageHealthCareReq1, btnUpdateProfile, manageOrganizationJButton1, manageOrganizationJButton2});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblEcosystemName)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblPersonName)))
                .addGap(10, 10, 10)
                .addComponent(btnAboutUs2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageOrganizationJButton1)
                .addGap(18, 18, 18)
                .addComponent(manageOrganizationJButton2)
                .addGap(18, 18, 18)
                .addComponent(btnMAnageHealthCareReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateProfile)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMAnageHealthCareReq1, btnUpdateProfile, manageOrganizationJButton1, manageOrganizationJButton2});

        jSplitPane2.setLeftComponent(jPanel4);

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));
        jPanel5.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButton1ActionPerformed
        // TODO add your handling code here:

//        HASEmployeeWorkRequestsJPanel hasWorkRquestsWorkPanel = new HASEmployeeWorkRequestsJPanel(userProcessContainer, account, (HasHealthcareRepresentativeOrganization) organization, enterprise, business);
//        userProcessContainer.add("HASEmployeeWorkRequestsJPanel", hasWorkRquestsWorkPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        HASEmployeeWorkRequestsJPanel hasWorkRquestsWorkPanel = new HASEmployeeWorkRequestsJPanel(userProcessContainer, account, (HasHealthcareRepresentativeOrganization) organization, enterprise, business);
        jSplitPane2.setRightComponent(hasWorkRquestsWorkPanel);
    }//GEN-LAST:event_manageOrganizationJButton1ActionPerformed

    private void manageOrganizationJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButton2ActionPerformed
        // TODO add your handling code here:
//        HASEmployeeWorkStatusJPanel workStatusPanel = new HASEmployeeWorkStatusJPanel(userProcessContainer, account, (HasHealthcareRepresentativeOrganization) organization, enterprise, business);
//        userProcessContainer.add("WorkStatusPanel", workStatusPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
        HASEmployeeWorkStatusJPanel workStatusPanel = new HASEmployeeWorkStatusJPanel(userProcessContainer, account, (HasHealthcareRepresentativeOrganization) organization, enterprise, business);
        jSplitPane2.setRightComponent(workStatusPanel);
    }//GEN-LAST:event_manageOrganizationJButton2ActionPerformed

    private void btnAboutUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUs2ActionPerformed
        // TODO add your handling code here:
        HomeJPanel fundPanel = new HomeJPanel(userProcessContainer, business);
        userProcessContainer.add("HomeJPanel", fundPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.logout(business);
    }//GEN-LAST:event_btnAboutUs2ActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        // TODO add your handling code here:
        PersonalDetailsJPanel requestPanel = new PersonalDetailsJPanel(userProcessContainer, account, business);
        jSplitPane2.setRightComponent(requestPanel);
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void btnMAnageHealthCareReq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAnageHealthCareReq1ActionPerformed
        // TODO add your handling code here:
        //        HASStatisticsJPanel hsjp = new HASStatisticsJPanel(userProcessContainer, userAccount, enterprise, network, system);
        //        userProcessContainer.add("manageHealthCareRequestsJPanel", hsjp);
        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        layout.next(userProcessContainer);

//        HASStatisticsJPanel hsjp = new HASStatisticsJPanel(userProcessContainer, userAccount, enterprise, network, system);
//        jSplitPane2.setRightComponent(hsjp);
    }//GEN-LAST:event_btnMAnageHealthCareReq1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs2;
    private javax.swing.JButton btnMAnageHealthCareReq1;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel lblEcosystemName;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JButton manageOrganizationJButton1;
    private javax.swing.JButton manageOrganizationJButton2;
    // End of variables declaration//GEN-END:variables
}
