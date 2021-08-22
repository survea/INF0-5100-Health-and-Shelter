/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.systemAdminRole;

import business.EcoSystem;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
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
public class SystemAdminMainWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminMainWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem system;

    public SystemAdminMainWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        initComponents();
        if(userAccount.getPersonPicture() == null)
            userAccount.setPersonPicture("/userProfilePictures/default_profile_picture.jpg");
        setProfilePicture();
        this.lblPersonName.setText(userAccount.getUsername());

        //lblPicture.setIcon(new ImageIcon(userAccount.getPersonPicture()));
        //lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userProfilePictures/" + userAccount.getUsername() + "capture.jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageEnterpriseAdmins = new javax.swing.JButton();
        btnManageEnterpriseAdmins1 = new javax.swing.JButton();
        lblPicture = new javax.swing.JLabel();
        btnUpdateProfile = new javax.swing.JButton();
        lblPersonName = new javax.swing.JLabel();
        lblEcosystemName = new javax.swing.JLabel();
        btnAboutUs1 = new javax.swing.JButton();
        btnManageEnterpriseAdmins2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        btnManageNetwork.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmins.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnManageEnterpriseAdmins.setText("Manage Enterprise admins");
        btnManageEnterpriseAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminsActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmins1.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnManageEnterpriseAdmins1.setText("Statistics");
        btnManageEnterpriseAdmins1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdmins1ActionPerformed(evt);
            }
        });

        btnUpdateProfile.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnUpdateProfile.setText("Update Profile");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        lblPersonName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblPersonName.setText("test name");

        lblEcosystemName.setBackground(new java.awt.Color(254, 254, 254));
        lblEcosystemName.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblEcosystemName.setForeground(new java.awt.Color(60, 76, 123));
        lblEcosystemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcosystemName.setText("SYSTEM ADMIN");

        btnAboutUs1.setBackground(new java.awt.Color(254, 254, 254));
        btnAboutUs1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAboutUs1.setForeground(new java.awt.Color(200, 35, 24));
        btnAboutUs1.setText("Logout");
        btnAboutUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUs1ActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmins2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnManageEnterpriseAdmins2.setText("Manage Funds");
        btnManageEnterpriseAdmins2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdmins2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnManageEnterpriseAdmins1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageEnterpriseAdmins, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageEnterprise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblPersonName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btnManageNetwork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(lblEcosystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAboutUs1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnManageEnterpriseAdmins2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageEnterprise, btnManageEnterpriseAdmins});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEcosystemName)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblPersonName)))
                .addGap(10, 10, 10)
                .addComponent(btnAboutUs1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageNetwork)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageEnterprise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageEnterpriseAdmins)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageEnterpriseAdmins2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnManageEnterpriseAdmins1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateProfile)
                .addGap(23, 23, 23))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageEnterprise, btnManageEnterpriseAdmins, btnManageNetwork});

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1800, Short.MAX_VALUE)
                .addGap(0, 282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, system);
        jSplitPane1.setRightComponent(manageNetworkJPanel);
//        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, system);
        jSplitPane1.setRightComponent(manageEnterpriseJPanel);
//        userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageEnterpriseAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminsActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, system);
        jSplitPane1.setRightComponent(manageEnterpriseAdminJPanel);
//        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseAdminsActionPerformed

    private void btnManageEnterpriseAdmins1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdmins1ActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieDateSet = new DefaultPieDataset();
        pieDateSet.setValue("ONE", new Integer(10));
        pieDateSet.setValue("TWO", new Integer(20));
        pieDateSet.setValue("THREE", new Integer(30));
        pieDateSet.setValue("FOUR", new Integer(40));
        JFreeChart pieChart = ChartFactory.createPieChart("Pie chart", pieDateSet);
        PiePlot p = (PiePlot) pieChart.getPlot();
        ChartFrame frame = new ChartFrame("Pie Chart", pieChart);
        frame.setVisible(true);
        frame.setSize(450, 500);
    }//GEN-LAST:event_btnManageEnterpriseAdmins1ActionPerformed

    private void btnAboutUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUs1ActionPerformed
        // TODO add your handling code here:
        HomeJPanel fundPanel = new HomeJPanel(userProcessContainer, system);
        userProcessContainer.add("HomeJPanel", fundPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.logout(system);
    }//GEN-LAST:event_btnAboutUs1ActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        // TODO add your handling code here:
        PersonalDetailsJPanel requestPanel = new PersonalDetailsJPanel(userProcessContainer, userAccount, system);
        jSplitPane1.setRightComponent(requestPanel);
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void btnManageEnterpriseAdmins2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdmins2ActionPerformed
        // TODO add your handling code here:
         ManageFunds manageEnterpriseAdminJPanel = new ManageFunds(userProcessContainer, system);
        jSplitPane1.setRightComponent(manageEnterpriseAdminJPanel);
    }//GEN-LAST:event_btnManageEnterpriseAdmins2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs1;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageEnterpriseAdmins;
    private javax.swing.JButton btnManageEnterpriseAdmins1;
    private javax.swing.JButton btnManageEnterpriseAdmins2;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblEcosystemName;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblPicture;
    // End of variables declaration//GEN-END:variables

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
}
