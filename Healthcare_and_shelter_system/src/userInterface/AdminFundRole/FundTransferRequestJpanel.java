/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdminFundRole;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.FundEnterprise;
import business.network.Network;
import business.organization.FundraiserOrganization;
import business.roles.CorporateRole;
import business.userAccount.UserAccount;
import business.workQueue.BillPayRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhairyasheel
 */
public class FundTransferRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form FundTransferRequestJpanel
     */
    JPanel userProcessContainer;
    FundEnterprise enterprise;
    UserAccount userAccount;
    Network network;
    EcoSystem system;
    FundraiserOrganization organization;
    public FundTransferRequestJpanel(JPanel userProcessContainer, UserAccount account, FundraiserOrganization organization,  FundEnterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = business;
        this.organization = organization;
        
        populateTotalFunds();
        populateRequestTable();
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
        tblHospitalRequest = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblTotalFunds = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        tblHospitalRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Amount Requested", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHospitalRequest);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 75, 125));
        jLabel2.setText("Total Funds:");

        lblTotalFunds.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        lblTotalFunds.setForeground(new java.awt.Color(189, 21, 21));
        lblTotalFunds.setText("jLabel3");

        btnApprove.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(62, 84, 147));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 76, 123));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Fund Request ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotalFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(btnApprove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotalFunds))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApprove)
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int row = tblHospitalRequest.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) tblHospitalRequest.getValueAt(row, 0);
        enterprise.setFundsUsed(request.getApproxPatientFee());
        WorkRequest r = request.getRequest();
        System.out.println(r);
        if(request.getStatus().equalsIgnoreCase("Funds Processed")){
            JOptionPane.showMessageDialog(null, "Funds are already processed!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        r.setStatus("Funds Processed");
        r.setMessage("Funds Processed Successfully!");
        request.setStatus("Funds Processed");
        request.setMessage("Funds Processed Successfully!");
        JOptionPane.showMessageDialog(null, "Funds Processed Successfully!");
        populateTotalFunds();
        populateRequestTable();
            
    }//GEN-LAST:event_btnApproveActionPerformed
    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblHospitalRequest.getModel();

        model.setRowCount(0);
        for (WorkRequest r : userAccount.getWorkQueue().getWorkRequestList()) {
            if (r.getStatus().equals("Pending payment")) {
                Object[] row = new Object[5];
                row[0] = r;
                row[1] = r.getApproxPatientFee();
                row[2] = r.getStatus();
                row[3] = r.getMessage();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotalFunds;
    private javax.swing.JTable tblHospitalRequest;
    // End of variables declaration//GEN-END:variables

    private void populateTotalFunds() {
        lblTotalFunds.setText(String.valueOf(enterprise.getFundsCollected()));
    }
}
