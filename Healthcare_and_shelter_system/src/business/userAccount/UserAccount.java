/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.roles.Role;
import business.workQueue.WorkQueue;
import java.awt.Image;

/**
 *
 * @author Diksha Godse
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private Enterprise enterprise;
    private String personPicture = "/userProfilePictures/default_profile_picture.jpg";

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getPersonPicture() {
        return personPicture;
    }

    public void setPersonPicture(String personPicture) {
        this.personPicture = personPicture;
    }

    @Override
    public String toString() {
        return username;
    }
}
