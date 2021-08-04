/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.roles.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author Diksha Godse
 */
public class ConfigureASystem {
        public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
//        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
            Employee employee = system.getEmployeeDirectory().createEmployee("admin");

            UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }
}
