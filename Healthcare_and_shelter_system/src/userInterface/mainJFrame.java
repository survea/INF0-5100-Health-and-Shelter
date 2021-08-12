/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.ConfigureASystem;
import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.Organization;
import business.employee.Employee;
import business.roles.CorporateRole;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.AdminFundRole.CorporateRegisterJPanel;
import userInterface.AdminFundRole.GeneralRegisterJPanel;
import userInterface.PatientRole.PatientRegistrationJPanel;

/**
 *
 * @author Diksha Godse
 */
public class mainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public mainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
//        system = ConfigureASystem.configure();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        btnCorporateRole = new javax.swing.JButton();
        btnGeneralRole = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        mainWorkArea = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        btnCorporateRole.setText("Cooperate Donate");
        btnCorporateRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorporateRoleActionPerformed(evt);
            }
        });

        btnGeneralRole.setText("General Donate");
        btnGeneralRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralRoleActionPerformed(evt);
            }
        });

        jButton3.setText("Register Self");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Register Needy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(btnCorporateRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGeneralRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordField)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginJButton)
                .addGap(32, 32, 32)
                .addComponent(logoutJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnCorporateRole)
                .addGap(18, 18, 18)
                .addComponent(btnGeneralRole)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(50, 50, 50))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        mainWorkArea.setLayout(new java.awt.CardLayout());

        jLabel3.setText("Healthcare and shelter for all");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel3)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        mainWorkArea.add(jPanel2, "card2");

        jSplitPane1.setRightComponent(mainWorkArea);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        if ((userName == null || userName.equals("")) && (password == null || password.equals(""))) {
            jLabel1.setForeground(Color.RED);
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter user name and password!");
            return;
        }
        if (userName == null || userName.equals("")) {
            jLabel1.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter user name!");
            return;
        } else {
            jLabel1.setForeground(Color.BLACK);
        }

        if (password == null || password.equals("")) {
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter password!");
            return;
        } else {
            jLabel2.setForeground(Color.BLACK);
        }
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;

        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : system.getNetworkList()) {

                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step 3:check against each organization for each enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inNetwork = network;
                                inEnterprise = enterprise;
                                //System.out.println(inNetwork);
                                //System.out.println(inEnterprise);
                                inOrganization = organization;
                                //System.out.println(inOrganization);
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        inNetwork = network;
                        //System.out.println(inEnterprise);
                        break;
                    }
                    if (inOrganization != null) {
                        //System.out.println(inOrganization);
                        break;
                    }
                }
                if (inEnterprise != null) {
                    //System.out.println(inEnterprise);
                    break;
                }
            }
        }

        if (userAccount == null) {
            jLabel1.setForeground(Color.RED);
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Invalid Credentials! Please re-enter!");
            return;
        } else {
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            //System.out.println(userAccount.getRole());
            //System.out.println(userAccount.getRole().getEcoSystem());
            //System.out.println(inEnterprise);
            //System.out.println(inOrganization);
            mainWorkArea.add("workArea", userAccount.getRole().createWorkArea(mainWorkArea, userAccount, inOrganization, inEnterprise, inNetwork, system));
            layout.next(mainWorkArea);
        }

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);

    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        mainWorkArea.removeAll();
        JPanel blankJP = new JPanel();
        mainWorkArea.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) mainWorkArea.getLayout();
        crdLyt.next(mainWorkArea);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btnCorporateRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorporateRoleActionPerformed
        // TODO add your handling code here:
        CorporateRegisterJPanel fundPanel = new CorporateRegisterJPanel(mainWorkArea,system);
        mainWorkArea.add("CorporateRegisterJPanel", fundPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnCorporateRoleActionPerformed

    private void btnGeneralRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralRoleActionPerformed
        // TODO add your handling code here:
        GeneralRegisterJPanel fundPanel = new GeneralRegisterJPanel();
        mainWorkArea.add("GeneralRegistrationJPanel", fundPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnGeneralRoleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if((!userNameJTextField.getText().isEmpty()) && (!loginJButton.isEnabled())){
        int selectionButton = JOptionPane.YES_NO_OPTION;
        int selectionResult = JOptionPane.showConfirmDialog(null, "The current user session" +userNameJTextField.getText() + " will be terminated, Do you want to proceed?", 
                "Warning", selectionButton);
        if (selectionResult == JOptionPane.YES_OPTION) {
            PatientRegistrationJPanel prjp = new PatientRegistrationJPanel(mainWorkArea, system);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        mainWorkArea.add("PatientRegistrationJPanel", prjp);
        layout.next(mainWorkArea);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        userNameJTextField.setText("");
        passwordField.setText("");
        }
        }else{
        PatientRegistrationJPanel prjp = new PatientRegistrationJPanel(mainWorkArea, system);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        mainWorkArea.add("PatientRegistrationJPanel", prjp);
        layout.next(mainWorkArea);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorporateRole;
    private javax.swing.JButton btnGeneralRole;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPanel mainWorkArea;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
