/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.Organization;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.NGOOrganization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.AdminNGORole.NGOAdminWorkAreaJPanel;

/**
 *
 * @author dhairyasheel
 */
public class NGOAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
       return new NGOAdminWorkAreaJPanel(userProcessContainer, account,(NGOOrganization) organization, enterprise,network, business);
     }
    
}
