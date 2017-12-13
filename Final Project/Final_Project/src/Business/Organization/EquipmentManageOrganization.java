/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Equipment.EquipmentDirectory;
import Business.Organization.UserAccount.Role.DistributorEquipmentManagerRole;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.Role.SupplierEquipmentManagerRole;
import Business.Organization.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class EquipmentManageOrganization extends Organization{
    private EquipmentDirectory equipmentDirectory;
    private WorkQueue workQueue;
    public EquipmentManageOrganization(String name) {
        super(name);
        equipmentDirectory = new EquipmentDirectory();
        workQueue = new WorkQueue();
    }  
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new DistributorEquipmentManagerRole());
        roleList.add(new SupplierEquipmentManagerRole());
        return roleList;
    }

    public EquipmentDirectory getEquipmentDirectory() {
        return equipmentDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
   
}
