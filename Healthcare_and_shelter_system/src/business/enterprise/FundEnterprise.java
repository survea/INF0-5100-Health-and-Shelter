/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.FundraiserOrganization;
import business.Organization;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class FundEnterprise extends Enterprise{
        public FundEnterprise(String name) {
        super(name, EnterpriseType.FundRaiser);
    }

    @Override
    public List<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization> getSupportedType() {
        List<Organization> organization = new ArrayList<>();
        organization.add(new FundraiserOrganization());
        return organization;
    }
}
