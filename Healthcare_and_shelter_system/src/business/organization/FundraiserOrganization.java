/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.Organization;
import business.roles.CorporateRole;
import business.roles.FundAdminRole;
import business.roles.GeneralRole;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class FundraiserOrganization  extends Organization {

    public FundraiserOrganization() {
        super(Organization.OrganizationType.Fundrasier.getValue());
    }

    @Override
    public List<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundAdminRole());
        roles.add(new CorporateRole());
        roles.add(new GeneralRole());
        return roles;
    }
}
