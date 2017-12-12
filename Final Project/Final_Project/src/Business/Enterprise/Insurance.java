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
public class Insurance extends Enterprise{
    private AlertDirectory alertDirectory;

    public AlertDirectory getAlertDirectory() {
        return alertDirectory;
    }
    
    
    public Insurance(String name) {
        super(name, Type.Insurance);
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
