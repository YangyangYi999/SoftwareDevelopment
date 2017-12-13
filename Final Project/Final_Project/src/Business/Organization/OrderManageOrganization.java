/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Equipment.MasterOrderCatalog;
import Business.Equipment.Order;
import Business.Organization.UserAccount.Role.OrderManagerRole;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.Role.SupplierOrderConfirmRole;
import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class OrderManageOrganization extends Organization{
    
    private MasterOrderCatalog inmoc,outmoc;

    public MasterOrderCatalog getInmoc() {
        return inmoc;
    }

    public MasterOrderCatalog getOutmoc() {
        return outmoc;
    }

    public OrderManageOrganization(String name) {
        super(name);
        inmoc = new MasterOrderCatalog();
        outmoc = new MasterOrderCatalog();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new OrderManagerRole());
        roleList.add(new SupplierOrderConfirmRole());
        return roleList;
    }
    
}
