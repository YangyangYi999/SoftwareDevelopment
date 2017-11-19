/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount.Role;

import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author shinychenw
 */
public class AdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, organization);
    }
}
