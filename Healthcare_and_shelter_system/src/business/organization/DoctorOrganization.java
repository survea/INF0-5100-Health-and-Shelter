/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.Organization;
import business.roles.DoctorRole;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Organization.OrganizationType.Doctor.getValue());
    }
    
    @Override
    public List<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
