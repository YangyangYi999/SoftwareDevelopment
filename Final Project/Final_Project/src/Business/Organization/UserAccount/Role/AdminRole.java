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
import Interface.EnterpriseAdmin.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shinychenw
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,State state) {
       return new AdminWorkAreaJPanel(enterprise,userProcessContainer,account,system); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
