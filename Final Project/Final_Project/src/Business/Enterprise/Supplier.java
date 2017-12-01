/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.Role.SupplierEquipmentManagerRole;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */

public class Supplier extends Enterprise{
    
    public Supplier(String name) {
        super(name, Type.Supplier);
        this.getOrganizationDirectory().addOrganization("Supplier", Organization.Type.Basic);

    }

    @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SupplierEquipmentManagerRole());
        return roleList;
    }
    
}
