/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Employee.EmployeeDirectory;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.UserAccountDirectory;
import Business.Organization.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public abstract class Organization {
    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    private WorkQueue inboundworkQueue;
    private WorkQueue outboundworkQueue;
    
    public enum Type{
        Basic("Basic Organization"),
        Equipment("Equipment Manage Organization"),
        Customer("Customer Manage Organization"),
        Order("Order Manage Organization"),
        AlertManage("Alert Manage Organization"),
        AlertHandle("Alert handle Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        inboundworkQueue = new WorkQueue();
        outboundworkQueue = new WorkQueue();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
   
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getInboundworkQueue() {
        return inboundworkQueue;
    }

    public WorkQueue getOutboundworkQueue() {
        return outboundworkQueue;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
