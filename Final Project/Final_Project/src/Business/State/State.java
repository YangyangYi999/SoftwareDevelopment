/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.BasicOrganization;

/**
 *
 * @author shinychenw
 */
public class State extends BasicOrganization{
    private EnterpriseDirectory enterpriseDirectory;
    public State(){
        this.setName("State");
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
}
