/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.Organization;
import business.roles.ChildCareRole;
import business.roles.OldAgeHomeRole;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class ChildCareOrganization extends Organization{

    public ChildCareOrganization() {
        super(Organization.OrganizationType.ChildCare.getValue());
    }

    
    @Override
    public List<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ChildCareRole());
        return roles;
    }
    
}
