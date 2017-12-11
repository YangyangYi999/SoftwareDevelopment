/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Police;
import Business.Organization.AlertManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.PoliceOfficer.PoliceOfficerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author yiyangyang
 */
public class PoliceOfficerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, State state) {
        return new PoliceOfficerWorkAreaJPanel(userProcessContainer,account,(AlertManageOrganization)organization,(Police)enterprise,state);  
    }
    
}
