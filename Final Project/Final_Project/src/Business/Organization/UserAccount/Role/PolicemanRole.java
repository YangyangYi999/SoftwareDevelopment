/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Police;
import Business.Organization.AlertHandleOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.Policeman.PolicemanWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shinychenw
 */
public class PolicemanRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, State state) {
        return new PolicemanWorkAreaJPanel(userProcessContainer,account,(AlertHandleOrganization)organization,(Police)enterprise,state);
    }
    
}
