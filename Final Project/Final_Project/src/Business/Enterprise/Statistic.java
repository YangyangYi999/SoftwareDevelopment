/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Alert.AlertDirectory;
import Business.Organization.Organization;
import Business.Organization.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class Statistic extends Enterprise{
    
    private AlertDirectory secureAlertDirectory,policeAlertDirectory;
    private WorkQueue customerRequestDirectory;
    
    public Statistic(String name) {
        super(name, Type.Statistic);
        secureAlertDirectory = new AlertDirectory();
        policeAlertDirectory = new AlertDirectory();
        customerRequestDirectory = new WorkQueue();
    }

    public AlertDirectory getSecureAlertDirectory() {
        return secureAlertDirectory;
    }

    public AlertDirectory getPoliceAlertDirectory() {
        return policeAlertDirectory;
    }

    public WorkQueue getCustomerRequestDirectory() {
        return customerRequestDirectory;
    }

    

    
    @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        ArrayList<Organization.Type> list = new ArrayList();
        list.add(Organization.Type.DataManage);
        return list;
    }
    
}
