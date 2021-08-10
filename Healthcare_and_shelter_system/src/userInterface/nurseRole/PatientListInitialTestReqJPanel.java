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
import business.userAccount.UserAccount;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diksha Godse
 */
public class PatientListInitialTestReqJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientListInitialTestReqJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private NurseOrganization nurseOrganization;
    private Enterprise enter;
    Network network;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public PatientListInitialTestReqJPanel(JPanel userProcessContainer, UserAccount account, NurseOrganization organization, Enterprise enter, Network network, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.nurseOrganization = organization;
        this.enter = enter;
        this.network = network;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Patient ID", "Gender", "Age", "Request", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        processJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        processJButton.setText("PATIENT REGISTRATION");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        assignJButton.setText("BACK");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PATIENT REGISTRATION");
        jLabel1.setToolTipText("");

        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        refreshJButton.setText("REFRESH");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367)
                        .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignJButton)
                    .addComponent(processJButton)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 4);
        System.out.println(request.getStatus());

        if (request.getStatus().equals("Awaiting initial checkup - nurse")) {
//            userAccount.getWorkQueue().getWorkRequestList().add(request);
            PatientInitialTestJPanel patientNurseRequestJpanel = new PatientInitialTestJPanel(userProcessContainer, userAccount, (NurseOrganization) nurseOrganization, business, enter, network, request);
            userProcessContainer.add("PatientInitialTestJPanel", patientNurseRequestJpanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "The Patient is already taken");
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest req : userAccount.getWorkQueue().getWorkRequestList()) {
            if ((req.getTypeOfRequest().equals("InitialCheckupNurseAssigned")) && (req.getStatus().equals("Awaiting initial checkup - nurse"))) {
                System.out.println(req);
                Object[] row = new Object[6];
                System.out.println(req);
                row[0] = req.getPatientfirstname();
                row[1] = req.getPatientlastname();
                row[2] = req.getPgender();
//                row[3] = req.getPage();
                row[4] = req;
                row[5] = req.getStatus();
                model.addRow(row);
            }
        }
    }
}
