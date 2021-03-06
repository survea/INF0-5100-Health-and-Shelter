/*
/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.Organization;
import business.enterprise.FundEnterprise;
import business.organization.FundraiserOrganization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.corporateRole.CorporateFundRaiserJPanel;

/**
 *
 * @author dhairyasheel
 */
public class CorporateRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new CorporateFundRaiserJPanel(userProcessContainer, account, (FundraiserOrganization)organization, (FundEnterprise)enterprise,network, business);
    }
    
}
