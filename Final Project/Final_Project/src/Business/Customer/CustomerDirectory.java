/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class CustomerDirectory {
    private ArrayList <Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }
    
    public Customer createEnterprise() {
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
    
    public void deleteEnterprise(Customer customer){
        customerList.remove(customer);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    
}
