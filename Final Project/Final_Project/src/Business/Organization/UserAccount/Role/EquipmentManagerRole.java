/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.Organization.EquipmentManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.Aftersale.EquipmentManager.EquipmentManagerWorkArea;
import javax.swing.JPanel;
import Interface.Supplier.SupplierManageWorkAreaJPanel;

/**
 *
 * @author shinychenw
 */
public class EquipmentManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization) {
        return new EquipmentManageWorkAreaJPanel(userProcessContainer, account, (EquipmentManageOrganization)organization);
    }
   
}
