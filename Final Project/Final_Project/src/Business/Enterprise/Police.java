/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Alert.AlertDirectory;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class Police extends Enterprise{
    private AlertDirectory alertDirectory;

    public AlertDirectory getAlertDirectory() {
        return alertDirectory;
    }
   
    public Police(String name) {
        super(name, Type.Police);
        this.alertDirectory = new AlertDirectory();
    }
  @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        ArrayList<Organization.Type> list = new ArrayList();
        list.add(Organization.Type.AlertManage);
        list.add(Organization.Type.AlertHandle);
        return list;
    }
    
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList = new ArrayList<>();
//        roleList.add(new PolicemanRole());
//        roleList.add(new PoliceOfficerRole());
//        return roleList;
//    }
    
}
