/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Alert.AlertDirectory;
import Business.Organization.UserAccount.Role.CustomerManagerRole;
import Business.Organization.UserAccount.Role.DistributorEquipmentManagerRole;
import Business.Organization.UserAccount.Role.InsuranceEmployeeRole;
import Business.Organization.UserAccount.Role.PolicemanRole;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.Role.SecureGuardRole;
import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class AlertHandleOrganization extends Organization{
    
    public AlertHandleOrganization(String name) {
        super(name);
      
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {       
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SecureGuardRole());
        roleList.add(new InsuranceEmployeeRole());
        roleList.add(new PolicemanRole());
        return roleList;    
    }
    
}
