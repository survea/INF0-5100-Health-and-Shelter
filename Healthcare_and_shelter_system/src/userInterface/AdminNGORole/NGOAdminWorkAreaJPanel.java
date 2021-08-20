/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdminNGORole;

import business.EcoSystem;
import static business.EcoSystem.business;
import business.Organization;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.NGOOrganization;
import business.roles.AdminRole;
import business.userAccount.UserAccount;
import business.workQueue.PatientTestRequest;
import business.workQueue.ShelterRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import userInterface.HomeJPanel;
import userInterface.MainJFrame;
import userInterface.PersonalDetailsJPanel;

/**
 *
 * @author Diksha Godse
 */
public class NGOAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    Network network;
    EcoSystem system;
    NGOOrganization organization;
    public NGOAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, NGOOrganization organization, Enterprise enterprise, Network network, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.network = network;
        this.system = business;
        initComponents();
        if(userAccount.getPersonPicture() == null)
            userAccount.setPersonPicture("/userProfilePictures/default_profile_picture.jpg");
        setProfilePicture();
        this.lblPersonName.setText(userAccount.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subMainFrame = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnShelterRequest = new javax.swing.JButton();
        btnManageEnterpriseAdmins2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        btnAboutUs2 = new javax.swing.JButton();
        btnUpdateProfile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(254, 254, 254));

        subMainFrame.setBackground(new java.awt.Color(254, 254, 254));
        subMainFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        jButton2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jButton2.setText("Add New Shelter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnShelterRequest.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnShelterRequest.setText("Manage Shelter Request");
        btnShelterRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShelterRequestActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmins2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnManageEnterpriseAdmins2.setText("Statistics");
        btnManageEnterpriseAdmins2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdmins2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 76, 123));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shelter Admin ");

        lblPersonName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblPersonName.setText("test name");

        btnAboutUs2.setBackground(new java.awt.Color(254, 254, 254));
        btnAboutUs2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAboutUs2.setForeground(new java.awt.Color(200, 35, 24));
        btnAboutUs2.setText("Logout");
        btnAboutUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUs2ActionPerformed(evt);
            }
        });

        btnUpdateProfile.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnUpdateProfile.setText("Update Profile");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAboutUs2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnShelterRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageEnterpriseAdmins2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageEnterpriseAdmins2, btnShelterRequest, btnUpdateProfile, jButton2});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblPersonName)))
                .addGap(18, 18, 18)
                .addComponent(btnAboutUs2)
                .addGap(56, 56, 56)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShelterRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageEnterpriseAdmins2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateProfile)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageEnterpriseAdmins2, btnShelterRequest, btnUpdateProfile, jButton2});

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout subMainFrameLayout = new javax.swing.GroupLayout(subMainFrame);
        subMainFrame.setLayout(subMainFrameLayout);
        subMainFrameLayout.setHorizontalGroup(
            subMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        subMainFrameLayout.setVerticalGroup(
            subMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(subMainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(subMainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShelterRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShelterRequestActionPerformed
        // TODO add your handling code here:
        ManageShelterRequestJPanel workStatusPanel = new ManageShelterRequestJPanel(userProcessContainer, userAccount, organization, enterprise,network, business);
        jSplitPane1.setRightComponent(workStatusPanel);
//        userProcessContainer.add("WorkStatusPanel", workStatusPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnShelterRequestActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         AddNewShelterJPanel workStatusPanel = new AddNewShelterJPanel(userProcessContainer, userAccount, organization, enterprise,network, business);
       jSplitPane1.setRightComponent(workStatusPanel);
//         userProcessContainer.add("WorkStatusPanel", workStatusPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnManageEnterpriseAdmins2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdmins2ActionPerformed
        // TODO add your handling code here:
                int treatementReqCount = 0;
        int shelterReqCount = 0;
//        JPanel jPanel1 = new JPanel();
//        jPanel1.setLayout(new java.awt.BorderLayout());
        for (WorkRequest workReq : userAccount.getWorkQueue().getWorkRequestList()) {
             if (workReq instanceof ShelterRequest) {
                shelterReqCount++;
            }
        }
        DefaultPieDataset pieDateSet = new DefaultPieDataset();
        pieDateSet.setValue("Awaiting for Shelter", shelterReqCount);
        JFreeChart pieChart = ChartFactory.createPieChart("Pie chart", pieDateSet);
        PiePlot p = (PiePlot) pieChart.getPlot();

        ChartFrame frame = new ChartFrame("Pie Chart", pieChart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_btnManageEnterpriseAdmins2ActionPerformed

    private void btnAboutUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutUs2ActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        // TODO add your handling code here:
        PersonalDetailsJPanel requestPanel = new PersonalDetailsJPanel(userProcessContainer, userAccount, system);
        jSplitPane1.setRightComponent(requestPanel);
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

private void setProfilePicture() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("./src" + userAccount.getPersonPicture()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(70, 70,
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblPicture.setIcon(imageIcon);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs2;
    private javax.swing.JButton btnManageEnterpriseAdmins2;
    private javax.swing.JButton btnShelterRequest;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JPanel subMainFrame;
    // End of variables declaration//GEN-END:variables

}
