/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount;

import Business.Organization.Employee.Employee;
import Business.Organization.UserAccount.Role.Role;

/**
 *
 * @author shinychenw
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;

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

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public UserAccount(){
    
    }
    
    public UserAccount(String username,String password,Role role,Employee employee){
        this.employee=employee;
        this.username= username;
        this.password = password;
        this.role = role;
    }
            
    @Override
    public String toString() {
        return username;
    }
}
