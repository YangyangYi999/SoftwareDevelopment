/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Secure;
import Business.Organization.AlertManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.SecureOfficer.SecureOfficerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author yiyangyang
 */
public class SecureOfficerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, State state) {
        return new SecureOfficerWorkAreaJPanel(userProcessContainer,account,(AlertManageOrganization)organization,(Secure)enterprise,state); //To change body of generated methods, choose Tools | Templates.
    }
    
}
