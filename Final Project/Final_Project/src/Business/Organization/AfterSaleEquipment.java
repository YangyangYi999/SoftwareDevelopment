/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author BoyangWei
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.Equipment.EquipmentDirectory;
import Business.Organization.UserAccount.Role.AdminRole;
import Business.Organization.UserAccount.Role.DistributorEquipmentManagerRole;
import Business.Organization.UserAccount.Role.EquipmentManagerRole;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.Role.SupplierEquipmentManagerRole;
import Business.Organization.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class AfterSaleEquipment extends Organization{
    private EquipmentDirectory equipmentDirectory;
    private WorkQueue workQueue;
    public AfterSaleEquipment(String name) {
        super(name);
        equipmentDirectory = new EquipmentDirectory();
        workQueue = new WorkQueue();
    }  
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new EquipmentManagerRole());
        return roleList;
    }

    public EquipmentDirectory getEquipmentDirectory() {
        return equipmentDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
   
}

