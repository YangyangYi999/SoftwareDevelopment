/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class MasterOrderCatalog {
    private ArrayList<Order> orderCatalog;
    
    public MasterOrderCatalog(){
        orderCatalog = new ArrayList();
    }

    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    public void addOrder(Order o){
        orderCatalog.add(o);
    }
    
    public void removeOrder(Order o){
        orderCatalog.remove(o);
    }
}
