/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.enterprise.EnterpriseDirectory;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author dhairyasheel
 */
public class SystemAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterpriseDirectory enterprise, Network network, EcoSystem business) {
//        return new SystemAdminWorkAreaJPanel(userProcessContainer, account, system);
return new JPanel(); //temporary
    }

}
