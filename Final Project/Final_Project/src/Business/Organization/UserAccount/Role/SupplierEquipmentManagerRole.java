/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Supplier;
import Business.Organization.EquipmentManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import javax.swing.JPanel;
import Interface.Supplier.EquipmentManager.SupplierManageWorkAreaJPanel;

/**
 *
 * @author shinychenw
 */
public class SupplierEquipmentManagerRole extends Role {
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, State state) {
        return new SupplierManageWorkAreaJPanel(userProcessContainer, account, (EquipmentManageOrganization)organization,(Supplier)enterprise);
    }
}
