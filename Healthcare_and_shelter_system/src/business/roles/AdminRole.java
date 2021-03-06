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
import business.organization.FundraiserOrganization;
import business.organization.NGOOrganization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.AdminFundRole.FundsAdminWorkAreaJPanel;
import userInterface.AdminHospitalRole.HospitalAdminWorkAreaJPanel;
import userInterface.AdminNGORole.NGOAdminWorkAreaJPanel;
import userInterface.AdminVolunteerRole.VolunteerAdminWorkAreaJPanel;

/**
 *
 * @author Diksha Godse
 */
public class AdminRole extends Role{  

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Volunteer.getValue())){
                return new VolunteerAdminWorkAreaJPanel(userProcessContainer, enterprise,account,network,business);
        }else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.NGO.getValue())){
                return new NGOAdminWorkAreaJPanel(userProcessContainer, account, (NGOOrganization)organization, enterprise,network, business);
        }else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.FundRaiser.getValue())){
                return new FundsAdminWorkAreaJPanel(userProcessContainer, account, (FundraiserOrganization)organization, enterprise,network, business);
        }else{
         return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise,account,network,business);
        }     }
}
