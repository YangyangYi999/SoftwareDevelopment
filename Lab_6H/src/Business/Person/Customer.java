/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author shinychenw
 */
public class Customer extends Person{

    private int orderNum;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public static int getCount() {
        return count;
    }

    public String toString(){
    return this.getFirstName()+" "+this.getLastName();
    }
}
