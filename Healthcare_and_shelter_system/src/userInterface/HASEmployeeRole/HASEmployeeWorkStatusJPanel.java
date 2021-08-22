/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HASEmployeeRole;

import business.EcoSystem;
import business.Organization;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.HasHealthcareRepresentativeOrganization;
import business.organization.ReceptionistOrganization;
import business.roles.AdminRole;
import business.roles.Role;
import business.userAccount.UserAccount;
import business.workQueue.PatientTestRequest;
import business.workQueue.WorkRequest;
import static java.awt.image.ImageObserver.PROPERTIES;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diksha Godse
 */
public class HASEmployeeWorkStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HAsEmployeeWorkStatusJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    HasHealthcareRepresentativeOrganization organization;
    Enterprise enterprise;
    EcoSystem business;

    public HASEmployeeWorkStatusJPanel(JPanel userProcessContainer, UserAccount account, HasHealthcareRepresentativeOrganization organization, Enterprise enterprise, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        initComponents();
        populateTable();
        populateJComboBox();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if ((request.getStatus().equals("Awaiting hospital For initial checkup")) || (request.getStatus().equals("Pending hospital assignment"))) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getPatientfirstname();
                row[2] = request.getPsymptoms();
                row[3] = request.getPdiagnosis();
                row[4] = userAccount.getUsername();
                row[5] = request.getStatus();
                model.addRow(row);
            }
        }
    }

    public void populateJComboBox() {
        cmbNetworkHospital.removeAllItems();
        for (Network network : business.getNetworkList()) {
            for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital.getValue())) {
                    cmbNetworkHospital.addItem(enter);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbNetworkHospital = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        cmbNetworkHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkHospitalActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("ASSIGN TO HOSPITAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Name", "Symptoms", "Diagonsis", "Assigned to", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(cmbNetworkHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbNetworkHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNetworkHospitalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Enterprise ent = (Enterprise) cmbNetworkHospital.getSelectedItem();
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equals("Awaiting initial checkup reports")) {
            JOptionPane.showMessageDialog(null, "Patient Already Added");
            return;
        }
        if (ent.enterpriseType.equalsIgnoreCase(Enterprise.EnterpriseType.Hospital.getValue())) {
            for (UserAccount userAcc : ent.getUserAccountDirectory().getUserAccountList()) {
                if (userAcc.getRole() instanceof AdminRole) {
                    request.setTypeOfRequest("InitialCheckupRequest");
                    request.setStatus("Awaiting initial checkup reports");
                    request.setReceiver(userAcc);
                    //req.setPimage("Have to upload");
                    ((UserAccount) userAcc).getWorkQueue().getWorkRequestList().add(request);

                    // updating work request of render HAS employee
//                    WorkRequest currentReq = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
//
//                    Optional<WorkRequest> selectedWorkReq;
//                    selectedWorkReq = userAccount.getWorkQueue().getWorkRequestList().stream()
//                            .filter(x -> x == currentReq)
//                            .findFirst();
//                    ((WorkRequest) selectedWorkReq.get()).setStatus("Awaiting initial checkup reports");
//                    ((WorkRequest) selectedWorkReq.get()).setTypeOfRequest("InitialCheckupRequest");
//                    ((WorkRequest) selectedWorkReq.get()).setReceiver(userAcc);
                }
            }
//            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
//                String receptionOrg = Organization.OrganizationType.Receptionist.getValue();
//                if ((org.toString().equals(receptionOrg))) {
//                    request.setTypeOfRequest("PriorCheckup");
//                    request.setStatus("Awaiting prior checkup reports");
//                    request.setReceiver(userAccount);
//                    WorkRequest currentReq = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
//
//                    Optional<WorkRequest> selectedWorkReq;
//                    selectedWorkReq = userAccount.getWorkQueue().getWorkRequestList().stream()
//                            .filter(x -> x == currentReq)
//                            .findFirst();
//                    ((WorkRequest) selectedWorkReq.get()).setStatus("Awaiting prior checkup reports");
//                    ((WorkRequest) selectedWorkReq.get()).setTypeOfRequest("PriorCheckup");
//                    ((ReceptionistOrganization) org).getWorkQueue().getWorkRequestList().add(request);
//
//                }
//            }
        }
        JOptionPane.showMessageDialog(null, "Assigned to the Hospital, pending initial checkup");
        populateTable();
        populateJComboBox();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbNetworkHospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
