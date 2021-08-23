/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.labAssistantRole;

import business.EcoSystem;
import business.Organization;
import business.enterprise.Enterprise;
import business.organization.DoctorOrganization;
import business.organization.LabOrganization;
import business.roles.DoctorRole;
import business.userAccount.UserAccount;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Diksha Godse
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
//    public ProcessWorkRequestJPanel() {
//        initComponents();
//    }
//
//    ProcessWorkRequestJPanel(JPanel userProcessContainer, WorkRequest request, UserAccount userAccount, Enterprise enterprise) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    JPanel userProcessContainer;
    WorkRequest request;
    UserAccount account;
    Enterprise enterprise;
    JSplitPane jSplitPane2;
    LabOrganization organization;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, WorkRequest request, UserAccount account, Enterprise enterprise, LabOrganization organization, JSplitPane jSplitPane2) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account = account;
        this.jSplitPane2 = jSplitPane2;
        this.enterprise = enterprise;
        this.organization = organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(254, 254, 254));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText("LAB ASSISTANT RESULT PANEL");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        submitJButton.setText("SUBMIT RESULT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)
                                .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(submitJButton))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(submitJButton)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        try {
            if (resultJTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter the Test Results!");
                return;
            }
            String message = JOptionPane.showInputDialog(null, "Please Enter the Amount for the Test?", "Test", JOptionPane.INFORMATION_MESSAGE);
            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter The Appropriate Message");
                return;
            }
            int money = Integer.parseInt(message);
            System.out.println(money);
            request.setHospitalFee(money);
            System.out.println(request.getHospitalFee());
            System.out.println(request.getStatus());
            request.setStatus("Treatment/Test Completed");
            request.setLabMessage(resultJTextField.getText());
//            for (Organization organiz : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                if (organiz instanceof DoctorOrganization) {
//                    for (UserAccount docUser : organiz.getUserAccountDirectory().getUserAccountList()) {
//                        int pos = docUser.getWorkQueue().getWorkRequestList().indexOf(request);
//                        if(pos >= 0) {
//                            docUser.getWorkQueue().getWorkRequestList().set(pos, request);
//                        }
//                    }
//                }
//            }
            JOptionPane.showMessageDialog(null, "Test completed!");
//            userProcessContainer.remove(this);
//            Component[] componentArray = userProcessContainer.getComponents();
//            Component component = componentArray[componentArray.length - 1];
//            LabAssistantMainWorkAreaJPanel dwjp = (LabAssistantMainWorkAreaJPanel) component;
//            dwjp.populateTable();
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.previous(userProcessContainer);
            LabAssistantMainWorkAreaJPanel lamwajp = new LabAssistantMainWorkAreaJPanel(userProcessContainer, account, organization, EcoSystem.business, enterprise, jSplitPane2);
            jSplitPane2.setRightComponent(lamwajp);
            JOptionPane.showMessageDialog(null, "Results sent to doctor!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please Enter The Appropriate Amount");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please Enter The Appropriate Amount in digits!");

        }
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
