/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;
import business.Organization;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public class OrganizationDirectory {
    private List<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.OrganizationType type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.OrganizationType.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Nurse.getValue())) {
            organization = new NurseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Receptionist.getValue())) {
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.OrganizationType.HAS_Healthcare_Representative.getValue())) {
            organization = new HasHealthcareRepresentativeOrganization();
            organizationList.add(organization);
        } 
//        else if (type.getValue().equals(Organization.OrganizationType.Fundrasier.getValue())) {
//            organization = new FundraiserOrganization();
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Organization.OrganizationType.Volunteer.getValue())) {
//            organization = new VolunteerOrganization();
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Organization.OrganizationType.NGOOrganization.getValue())) {
//            organization = new NGOOrganization();
//            organizationList.add(organization);
//        }
        return organization;
    }
    
    public void removeOrganization(Organization organization) {
        organizationList.remove(organization);
    }
    
}
