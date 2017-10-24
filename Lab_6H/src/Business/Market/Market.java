/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import Business.Person.Customer;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class Market {
    private String name;
    private int revenue;
    private ArrayList<Customer> customerList;
    public Market(){
    customerList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public void addCustomer(Customer customer){
    this.customerList.add(customer);
    }
    
    @Override
    public String toString(){
        return getName();
    }
}
