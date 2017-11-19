/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.Employee.Employee;
import Business.Organization.UserAccount.Role.AdminRole;
import Business.Organization.UserAccount.UserAccount;

/**
 *
 * @author shinychenw
 */
public class ConfigureAEcoSystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new AdminRole());
        
        return system;
    }
}
