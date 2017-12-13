/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Alert;

import Business.Equipment.Equipment;
import java.util.ArrayList;

/**
 *
 * @author BoyangWei
 */
public class AlertDirectory {
    private ArrayList<Alert> alertList;

    public ArrayList<Alert> getAlertList() {
        return alertList;
    }
    public AlertDirectory(){
        this.alertList = new ArrayList();
    }

    
    public void deleteAlert(Alert a){
        alertList.remove(a);
    }
    
}
