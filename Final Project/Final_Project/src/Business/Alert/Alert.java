/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Alert;

import Business.Equipment.Equipment;
import java.util.Date;

/**
 *
 * @author BoyangWei
 */
public class Alert {
    private Equipment equipment;
    private Date date;
    private String status;
    private int alertID;
    private static int count=0;
    private String message;
    private String guard;
    private String insStatus;
    private String insurance;
    private String insResult;
    private String polStatus;
    private String police;
    private String polResult;

    public String getPolStatus() {
        return polStatus;
    }

    public void setPolStatus(String polStatus) {
        this.polStatus = polStatus;
    }

    public String getPolice() {
        return police;
    }

    public void setPolice(String police) {
        this.police = police;
    }

    public String getPolResult() {
        return polResult;
    }

    public void setPolResult(String polResult) {
        this.polResult = polResult;
    }
    
    public String getInsResult() {
        return insResult;
    }

    public void setInsResult(String insResult) {
        this.insResult = insResult;
    }
    
    public String getInsStatus() {
        return insStatus;
    }

    public void setInsStatus(String insStatus) {
        this.insStatus = insStatus;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getGuard() {
        return guard;
    }

    public void setGuard(String guard) {
        this.guard = guard;
    }
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    public int getAlertID() {
        return alertID;
    }
    
    public Equipment getEquipment() {
        return equipment;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Alert(Equipment equ){
        count++;
        alertID = count;
        this.equipment = equ;
        this.date = new Date();
        this.status = "Unhandled";
        this.message = "";
    }
    @Override
    public String toString(){
        return this.equipment.getName();
    }
}
