/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.CustomerOrder.CustomerOrderDirectory;
import Business.Equipment.EquipmentDirectory;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class Provider extends Enterprise{
    private EquipmentDirectory equpmentDirectory;
    private CustomerOrderDirectory customerOrderDirectory;

    public CustomerOrderDirectory getCustomerOrderDirectory() {
        return customerOrderDirectory;
    }
    
    public EquipmentDirectory getEqupmentDirectory() {
        return equpmentDirectory;
    }
    
    public Provider(String name) {
        super(name, Type.Provider);
        this.equpmentDirectory = new EquipmentDirectory ();
        this.customerOrderDirectory = new CustomerOrderDirectory();
    }

    @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
