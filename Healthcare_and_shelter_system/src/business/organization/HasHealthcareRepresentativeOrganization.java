/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.Organization;
import business.roles.DoctorRole;
import business.roles.Role;
import business.roles.HasHeathcareRepresentaiveRole;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class HasHealthcareRepresentativeOrganization extends Organization{
        public HasHealthcareRepresentativeOrganization() {
        super(Organization.OrganizationType.HAS_Healthcare_Representative.getValue());
    }
    
    @Override
    public List<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HasHeathcareRepresentaiveRole());
        return roles;
    }
}
