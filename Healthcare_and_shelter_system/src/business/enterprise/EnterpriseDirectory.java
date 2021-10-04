/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class EnterpriseDirectory {

    private List<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public List<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(List<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.NGO) {
            enterprise = new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.FundRaiser) {
            enterprise = new FundEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Volunteer) {
            enterprise = new PersonEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public Enterprise removeEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = fetchEnterprise(name, type);
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterpriseList.remove(enterprise);
        }
        if (type == Enterprise.EnterpriseType.FundRaiser) {
            enterprise = new PersonEnterprise(name);
            enterpriseList.remove(enterprise);
        }
        return enterprise;
    }

    public Enterprise fetchEnterprise(String name, Enterprise.EnterpriseType type) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getName().equals(name) && enterprise.getEnterpriseType().equals(type)) {
                return enterprise;
            }

        }
        return null;
    }

}
