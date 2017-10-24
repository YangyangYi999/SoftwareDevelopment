/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Market.MarketOffer;
import Business.Person.Customer;
import Business.Person.Salesman;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private Customer customer;
    private Salesman salesman;
    private static int count=0;

    public Order() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public OrderItem addOrderItem(MarketOffer m, int q,double price,double gap){
        OrderItem o = new OrderItem();
        o.setMarketOffer(m);
        o.setQuantity(q);
        o.setActualPrice(price);
        o.setGap(gap);
        orderItemList.add(o);
        return o;
    }
    
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
}
