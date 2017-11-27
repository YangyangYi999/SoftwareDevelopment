/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.EcoSystem;
import Business.Network.Network;
import Business.State.State;
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
    
    public Customer createCustomer() {
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customer customer){
        customerList.remove(customer);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public static boolean isValid(String str,EcoSystem system){
        for(Network net : system.getNetworkList().getNetworkList()){
            for(State s:net.getStateDirectory().getStateList()){
                for(Customer cus:s.getCustomerDirectory().getCustomerList()){
                    if(str.equals(cus.getUsername())){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
}
