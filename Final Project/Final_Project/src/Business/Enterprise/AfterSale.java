/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.CustomerManageOrganization;
import Business.Organization.EquipmentManageOrganization;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class AfterSale extends Enterprise{
    
    public AfterSale(String name){
        super(name,Enterprise.Type.Aftersale);
        this.getOrganizationDirectory().getOrganizationList().add(new CustomerManageOrganization());
        this.getOrganizationDirectory().getOrganizationList().add(new EquipmentManageOrganization());
    }

    @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
