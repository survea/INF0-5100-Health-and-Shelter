/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.EmployeeDirectory;
import business.roles.Role;
import business.userAccount.UserAccountDirectory;
import business.workQueue.WorkQueue;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationId;
    private static int counter = 0;
    private String organizationType;
    private int ShelterOccupancy = 0;
    private String ShelterName;
    public enum OrganizationType {
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        Nurse("Nurse Organization"),
        Pharmacy("Pharmacy"),
        Receptionist("Receptionist Organization"),
        HAS_Healthcare_Representative("HAS Healthcare Organization"),
        HAS_Shelter_Representative("HAS shelter Organization"),
        NGOOrganization("NGO Organization"),
        Fundrasier("Fundraiser Organization"),
        ChildCare("ChildCare Organization"),
        AdultCare("AdultCare Organization"),
        OldAgeHome("OldAgeHome Organization");
        

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        this.organizationType = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        organizationId = counter;
        ++counter;
    }
        public Organization(){
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        organizationId = counter;
        ++counter;   
    }

    public abstract List<Role> getSupportedRole();

    public String getShelterName() {
        return ShelterName;
    }

    public void setShelterName(String ShelterName) {
        this.ShelterName = ShelterName;
    }

    public int getShelterOccupancy() {
        return ShelterOccupancy;
    }

    public void setShelterOccupancy(int ShelterOccupancy) {
        this.ShelterOccupancy = this.ShelterOccupancy + ShelterOccupancy;
    }

    public void shelterOccupiedCount(int ShelterOccupancy) {
        this.ShelterOccupancy = this.ShelterOccupancy - ShelterOccupancy;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType.getValue();
    }   
    @Override
    public String toString() {
        return name;
    }
}
