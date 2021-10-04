/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.DoctorOrganization;
import business.organization.LabOrganization;
import business.organization.NurseOrganization;
import business.Organization;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public class HospitalEnterprise extends Enterprise{
        public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public List<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization> getSupportedType() {
        List<Organization> organization = new ArrayList<>();
        organization.add(new DoctorOrganization());
        organization.add(new LabOrganization());
        organization.add(new NurseOrganization());
        return organization;
    }
}
