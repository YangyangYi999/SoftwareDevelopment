/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Organization.UserAccount.Role.AdminRole;
import Business.Organization.UserAccount.Role.CustomerManagerRole;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class CustomerManageOrganization extends Organization{
    private CustomerDirectory customerDirectory;
    private WorkQueue workQueue;
    public CustomerManageOrganization(String name) {
        super(name);
        customerDirectory = new CustomerDirectory();
        workQueue = new WorkQueue();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new AdminRole());
        roleList.add(new CustomerManagerRole());
        return roleList;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    
}
