/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdminNGORole;

import business.EcoSystem;
import business.Organization;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.NGOOrganization;
import business.organization.OrganizationDirectory;
import business.roles.AdminRole;
import business.userAccount.UserAccount;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diksha Godse
 */
public class ManageShelterRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    Network network;
    EcoSystem system;
    NGOOrganization organization;
    public ManageShelterRequestJPanel(JPanel userProcessContainer, UserAccount account, NGOOrganization organization, Enterprise enterprise, Network network, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.network = network;
        this.system = business;
        initComponents();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblShelter = new javax.swing.JTable();
        btnAssignShelter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Assigned Shelter", "Status", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        tblShelter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organization Name", "Shelter  name", "Occupancy Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblShelter);

        btnAssignShelter.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnAssignShelter.setForeground(new java.awt.Color(91, 110, 137));
        btnAssignShelter.setText("Assign Shelter");
        btnAssignShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignShelterActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(91, 110, 137));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 76, 123));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shelter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(btnAssignShelter, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssignShelter)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignShelterActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equals("Assigned Shelter")) {
            JOptionPane.showMessageDialog(null, "Already Assigned Shelter");
            return;
        }
        
        int selectedRow1 = tblShelter.getSelectedRow();
        if (selectedRow1 < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        Organization org = (Organization) tblShelter.getValueAt(selectedRow1, 0);
        
        int age = request.getAge();
        
        if (request.getStatus().equalsIgnoreCase("Old Age Home Assigned")|request.getStatus().equalsIgnoreCase("Adult Care Shelter Assigned")|request.getStatus().equalsIgnoreCase("Child Care Shelter Assigned")){
            JOptionPane.showMessageDialog(null, "Shelter is already assigned!");
            return;
        }
        if(org.getOrganizationType().equalsIgnoreCase("OldAgeHome Organization") && age >=60){
            request.setStatus("Old Age Home Assigned");
            request.setAssignedShelter(org.getShelterName());
            org.shelterOccupiedCount(1);
        }else if(org.getOrganizationType().equalsIgnoreCase("AdultCare Organization") && age >=16 && age <60){
            request.setStatus("Adult Care Shelter Assigned");
            request.setAssignedShelter(org.getShelterName());
            org.shelterOccupiedCount(1);
        } else if(org.getOrganizationType().equalsIgnoreCase("ChildCare Organization") && age <16){
            request.setStatus("Child Care Shelter Assigned");
            request.setAssignedShelter(org.getShelterName());
            org.shelterOccupiedCount(1);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select the Shelter Accoring to Age Group");
        }

        populateTable();
        
    }//GEN-LAST:event_btnAssignShelterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        for (UserAccount HASUser : enterprise.getUserAccountDirectory().getUserAccountList()) {
            if (HASUser.getRole() instanceof AdminRole) {
                HASUser.getWorkQueue().removeWorkRequest(request);
            }
        }
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignShelter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblShelter;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        if (enterprise.enterpriseType.equalsIgnoreCase(Enterprise.EnterpriseType.NGO.getValue())) {
             for (UserAccount HASUser : enterprise.getUserAccountDirectory().getUserAccountList()) {
            if (HASUser.getRole() instanceof AdminRole) {
                for (WorkRequest request : HASUser.getWorkQueue().getWorkRequestList()) {
                    if ((request.getStatus().equalsIgnoreCase("Shelter Assigned"))|(request.getStatus().equalsIgnoreCase("Shelter Requested")) |(request.getStatus().equalsIgnoreCase("Awaiting for Shelter and Treatment"))) {
                        Object[] row = new Object[4];
                        row[0] = request;
                        row[1] = request.getAssignedShelter();
                        row[2] = request.getStatus();
                        row[3] = request.getAge();
                        model.addRow(row);
                    }
                }
            }
        }
         }
        
       DefaultTableModel model1 = (DefaultTableModel) tblShelter.getModel();
        model1.setRowCount(0);

        List<Organization> org =  enterprise.getOrganizationDirectory().getOrganizationList();

        for(Organization o : org){
                Object[] row = new Object[3];
                row[0] = o;
                row[1] = o.getShelterName();
                row[2] = o.getShelterOccupancy();
                model1.addRow(row);
        }
    }
}
