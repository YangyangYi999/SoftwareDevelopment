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
        this.equipment = equ;
        this.date = new Date();
        this.status = "Unhandled";
    }
    
}
