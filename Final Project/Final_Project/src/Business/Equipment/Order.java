/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Equipment;

import java.util.ArrayList;

/**
 *
 * @author Lucy Bai
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private static int count=0;
    private String name;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Order(){
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<OrderItem>();
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
    public OrderItem addOrderItem(Equipment p, int q, double price){
        OrderItem o =new OrderItem();
        o.setEquipment(p);
        o.setQuatity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
    }
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    
}