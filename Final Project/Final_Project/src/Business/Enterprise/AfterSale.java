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
        super(name,Type.Aftersale);
//        this.getOrganizationDirectory().getOrganizationList().add(new CustomerManageOrganization("CustomerManageOrganization"));
//        this.getOrganizationDirectory().getOrganizationList().add(new EquipmentManageOrganization("EquipmentManageOrganization"));
    }

    @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        ArrayList<Organization.Type> list = new ArrayList();
        list.add(Organization.Type.Customer);
        list.add(Organization.Type.Equipment);
        return list;
    }
}
