/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public class EmployeeDirectory {
    private List<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
        public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public Employee uniqueEmployee(String name) {
        for (Employee emp : employeeList) {
            if (emp.getName().equals(name)) {
                return emp;
            }
        }
        return null;
    }
    
}
