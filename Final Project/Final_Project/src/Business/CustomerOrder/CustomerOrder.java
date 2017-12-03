/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerOrder;

import Business.Customer.Customer;
import Business.Enterprise.Provider;
import Business.Equipment.Equipment;
import java.util.Date;

/**
 *
 * @author BoyangWei
 */
public class CustomerOrder {
    private Equipment equipment;
    private Date orderDate;
    private Provider provider;
    private Customer customer;
    private int quantity;
    private String status;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
    
    public CustomerOrder(Equipment e,int quantity,Provider p,Customer c){
        this.orderDate = new Date();
        this.equipment = e;
        this.provider = p;
        this.customer = c;
        this.quantity = quantity;
    }
}
