/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.Organization;
import business.organization.OrganizationDirectory;
import business.roles.Role;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public abstract class Enterprise extends Organization {

    public String enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int fundsCollected = 0;
    public abstract List<Role> getSupportedRole();

    public abstract List<Organization> getSupportedType();

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Hospital("Hospital"),
        NGO("Shelter"),
        FundRaiser("Fund Raiser"),
        Volunteer("Volunteer");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type.getValue();
        organizationDirectory = new OrganizationDirectory();
     }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
     public int getFundsCollected() {
        return fundsCollected;
    }

    public void setFundsCollected(int fundsCollected) {
        this.fundsCollected = this.fundsCollected + fundsCollected;
    }
    
    public void setFundsUsed(int fundsCollected) {
        this.fundsCollected = this.fundsCollected - fundsCollected;
    }
}
