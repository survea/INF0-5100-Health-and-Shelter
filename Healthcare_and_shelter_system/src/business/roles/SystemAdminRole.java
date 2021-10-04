/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;
import business.network.Network;
import business.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.systemAdminRole.SystemAdminMainWorkAreaJPanel;

/**
 *
 * @author dhairyasheel
 */
public class SystemAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new SystemAdminMainWorkAreaJPanel(userProcessContainer, account, business);
    }

}
