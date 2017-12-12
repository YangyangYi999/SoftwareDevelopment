/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.SystemAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author BoyangWei
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole(){
       
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, State state) {
       return new SystemAdminWorkAreaJPanel(system,userProcessContainer,account);
    }

    
}
