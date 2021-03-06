/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.ReceptionistOrganization;
import business.userAccount.UserAccount;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Diksha Godse
 */
public class PersonalDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonalDetailsJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem eco;

    public PersonalDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem eco) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        initComponents();
        if (userAccount.getPersonPicture() != null) {
            lblPersonPicture.setIcon(new ImageIcon(userAccount.getPersonPicture()));
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

        lblPersonPicture = new javax.swing.JLabel();
        btnUploadPersonPic = new javax.swing.JButton();
        lblPDemographics = new javax.swing.JLabel();
        btnSavePersonalInfo = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));

        lblPersonPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUploadPersonPic.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnUploadPersonPic.setForeground(new java.awt.Color(92, 112, 132));
        btnUploadPersonPic.setText("Upload person picture");
        btnUploadPersonPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPersonPicActionPerformed(evt);
            }
        });

        lblPDemographics.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblPDemographics.setForeground(new java.awt.Color(68, 82, 123));
        lblPDemographics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPDemographics.setText("Person Demographics");

        btnSavePersonalInfo.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnSavePersonalInfo.setForeground(new java.awt.Color(92, 112, 132));
        btnSavePersonalInfo.setText("save person picture");
        btnSavePersonalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePersonalInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblPDemographics, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUploadPersonPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSavePersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblPersonPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblPDemographics)
                .addGap(18, 18, 18)
                .addComponent(lblPersonPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUploadPersonPic)
                .addGap(18, 18, 18)
                .addComponent(btnSavePersonalInfo)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadPersonPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPersonPicActionPerformed
        // TODO add your handling code here:
        JFileChooser browseDriverLicenseFile = new JFileChooser();

        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseDriverLicenseFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseDriverLicenseFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseDriverLicenseFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();

            //Display image in JLable
            ImageIcon Ii = new ImageIcon(selectedImagePath);
            //Resize image to fit jlabel
            Image image = Ii.getImage().getScaledInstance(lblPersonPicture.getWidth(), lblPersonPicture.getHeight(), Image.SCALE_SMOOTH);
            lblPersonPicture.setIcon(new ImageIcon(image));

            // construct the buffered image
            BufferedImage bImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D bImageGraphics = bImage.createGraphics();
            bImageGraphics.drawImage(image, null, null);
            RenderedImage rImage = (RenderedImage) bImage;
            try {
                ImageIO.write(rImage, "JPG", new File("./src/userProfilePictures/"+userAccount.getUsername() + "capture.jpg"));
            } catch (IOException ex) {
                Logger.getLogger(PersonalDetailsJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            String filename = "/userProfilePictures/" + userAccount.getUsername() + "capture.jpg";
            userAccount.setPersonPicture(filename);
        }
    }//GEN-LAST:event_btnUploadPersonPicActionPerformed

    private void btnSavePersonalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePersonalInfoActionPerformed
        // TODO add your handling code here:
        ImageIcon myIcon = (ImageIcon) lblPersonPicture.getIcon();
        if (myIcon == null) {
            JOptionPane.showMessageDialog(this, "Please add person picture", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
//        userAccount.setPersonPicture((Image) myIcon.getImage());
    }//GEN-LAST:event_btnSavePersonalInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePersonalInfo;
    private javax.swing.JButton btnUploadPersonPic;
    private javax.swing.JLabel lblPDemographics;
    private javax.swing.JLabel lblPersonPicture;
    // End of variables declaration//GEN-END:variables
}
