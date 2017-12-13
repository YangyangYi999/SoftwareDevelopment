/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Statistic;
import Business.Organization.DataManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.Statistic.DataManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shinychenw
 */
public class DataManagerRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,EcoSystem system,State state) {
        return new DataManagerWorkAreaJPanel(userProcessContainer, account, (DataManageOrganization)organization,(Statistic)enterprise,state);
    }
}
