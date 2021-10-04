/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.Organization;
import business.roles.LabAssistantRole;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public class LabOrganization extends Organization{
    public LabOrganization() {
        super(Organization.OrganizationType.Lab.getValue());
    }

    @Override
    public List<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }
    
}
