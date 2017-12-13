/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerOrder;

import java.util.ArrayList;

/**
 *
 * @author BoyangWei
 */
public class CustomerOrderDirectory {
     private ArrayList<CustomerOrder> customerOrderList;

    public ArrayList<CustomerOrder> getCustomerOrderList() {
        return customerOrderList;
    }
     
    public CustomerOrderDirectory(){
        this.customerOrderList = new ArrayList();
    }
}
