/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.UserAccount.Role.DistributorEquipmentManagerRole;
import Business.Organization.UserAccount.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class Distributor extends Enterprise{
    
    public Distributor(String name) {
        super(name,Type.Distributor);
    }

   
 @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new DistributorEquipmentManagerRole());
        return roleList;
    }

    @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        ArrayList<Organization.Type> list = new ArrayList();
        list.add(Organization.Type.Order);
        list.add(Organization.Type.Equipment);
        return list;    }
    
}
