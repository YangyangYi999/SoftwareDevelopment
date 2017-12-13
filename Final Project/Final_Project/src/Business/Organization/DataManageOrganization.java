/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Alert.AlertDirectory;
import Business.Organization.UserAccount.Role.DataManagerRole;
import Business.Organization.UserAccount.Role.InsuranceEventManagerRole;
import Business.Organization.UserAccount.Role.PoliceOfficerRole;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.Role.SecureOfficerRole;
import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class DataManageOrganization extends Organization{

    public DataManageOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new DataManagerRole());
        return roleList;        
    }
    
}
