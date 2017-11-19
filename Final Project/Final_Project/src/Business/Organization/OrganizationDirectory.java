/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class OrganizationDirectory {
    private ArrayList <Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }
    
    public void deleteOrganization(Organization organization){
        organizationList.remove(organization);
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
}
