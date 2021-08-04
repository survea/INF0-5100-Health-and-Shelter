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
//        if (type == Enterprise.EnterpriseType.Camp) {
//            enterprise = new CampEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        if (type == Enterprise.EnterpriseType.Event) {
//            enterprise = new EventEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
        return enterprise;
    }

}
