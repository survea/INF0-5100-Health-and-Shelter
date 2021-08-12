/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.Organization;
import business.organization.NGOOrganization;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class NGOEnterprise extends Enterprise{
        public NGOEnterprise(String name) {
        super(name, EnterpriseType.NGO);
    }

    @Override
    public List<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization> getSupportedType() {
        List<Organization> organization = new ArrayList<>();
        organization.add(new NGOOrganization());
        return organization;
    }
}
