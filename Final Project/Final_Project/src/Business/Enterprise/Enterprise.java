/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.BasicOrganization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author shinychenw
 */
public class Enterprise extends BasicOrganization{
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(){
        this.setName("Enterprise");
        organizationDirectory = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
