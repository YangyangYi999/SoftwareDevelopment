/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Alert.AlertDirectory;
import Business.Organization.Organization;
import Business.Organization.UserAccount.Role.PoliceOfficerRole;
import Business.Organization.UserAccount.Role.PolicemanRole;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.Role.SecureGuardRole;
import Business.Organization.UserAccount.Role.SecureOfficerRole;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class Secure extends Enterprise{
    private AlertDirectory alertDirectory;

    public AlertDirectory getAlertDirectory() {
        return alertDirectory;
    }
    public Secure(String name) {
        super(name, Type.Secure);
        this.alertDirectory = new AlertDirectory();
    }

    @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        ArrayList<Organization.Type> list = new ArrayList();
        list.add(Organization.Type.AlertManage);
        list.add(Organization.Type.AlertHandle);
        return list;
    }
    
    
       
}
