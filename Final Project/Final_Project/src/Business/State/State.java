/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.Customer.CustomerDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.BasicOrganization;

/**
 *
 * @author shinychenw
 */
public class State extends BasicOrganization{
    private EnterpriseDirectory enterpriseDirectory;
    private CustomerDirectory customerDirectory;

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public State(String name){
        this.setName(name);
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    public String toString(){
     return this.getName();
    }
}

