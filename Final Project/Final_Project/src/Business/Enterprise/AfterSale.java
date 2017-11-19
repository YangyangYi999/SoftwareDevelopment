/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.CustomerManageOrganization;
import Business.Organization.EquipmentManageOrganization;

/**
 *
 * @author shinychenw
 */
public class AfterSale extends Enterprise{
    
    public AfterSale(){
        this.setName("AfterSale");
        this.getOrganizationDirectory().getOrganizationList().add(new CustomerManageOrganization());
        this.getOrganizationDirectory().getOrganizationList().add(new EquipmentManageOrganization());
    }
}
