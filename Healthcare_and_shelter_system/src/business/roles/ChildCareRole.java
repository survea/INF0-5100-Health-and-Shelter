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
import business.organization.OldAgeHomeOrganization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.oldAgeHomeRole.OldAgeHomeJPanel;

/**
 *
 * @author dhairyasheel
 */
public class ChildCareRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
       return new OldAgeHomeJPanel(userProcessContainer, account, (OldAgeHomeOrganization) organization, enterprise,network, business);
    }
    
}
