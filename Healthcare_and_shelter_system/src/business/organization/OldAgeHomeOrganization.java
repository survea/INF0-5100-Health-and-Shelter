/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.Organization;
import business.roles.NurseRole;
import business.roles.OldAgeHomeRole;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class OldAgeHomeOrganization extends Organization {

    public OldAgeHomeOrganization() {
        super(Organization.OrganizationType.OldAgeHome.getValue());
    }
    
    @Override
    public List<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OldAgeHomeRole());
        return roles;
    }
}
