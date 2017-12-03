/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EquipmentManageOrganization;
import Business.Organization.OrderManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.Provider.EquipmentManager.ProviderEquipmentManagerWorkAreaJPanel;
import Interface.Provider.OrderManager.ProviderOrderManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shinychenw
 */
public class ProviderOrderManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,EcoSystem system,State state) {
        return new ProviderOrderManagerWorkAreaJPanel(userProcessContainer, account, enterprise,state,(OrderManageOrganization)organization);
    }
}
