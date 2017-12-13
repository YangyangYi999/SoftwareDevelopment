/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Equipment;

import Business.Organization.Employee.Employee;
import java.util.Date;

/**
 *
 * @author BoyangWei
 */
public class UpdateRecord {
    private Date updateDate;
    private Employee employee;

    public Date getUpdateDate() {
        return updateDate;
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public UpdateRecord(Employee employee){
        this.employee = employee;
        updateDate = new Date();
    }
    
}
