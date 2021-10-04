/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.enterprise.Enterprise;
import static business.enterprise.Enterprise.EnterpriseType.FundRaiser;
import business.enterprise.EnterpriseDirectory;
import business.network.Network;
import business.Organization;
import business.roles.CorporateRole;
import business.roles.FundAdminRole;
import business.roles.GeneralRole;
import business.roles.SystemAdminRole;
import business.userAccount.UserAccount;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public class ConfigureASystem {
        public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();
        //Create a network
         Network network =  system.createAndAddNetwork();
        
        //create an enterprise
        EnterpriseDirectory enterpriseDirectory = new EnterpriseDirectory();
        network.setEnterpriseDirectory(enterpriseDirectory);
       
        //initialize some organizations
        
        //have some employees 
        //create user account
//        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
            Employee employee = system.getEmployeeDirectory().createEmployee("admin");
            UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
            
            
        return system;
    }
}
