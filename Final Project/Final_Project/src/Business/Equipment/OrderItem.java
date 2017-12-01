/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Equipment;

/**
 *
 * @author Lucy Bai
 */
public class OrderItem {
    private int quatity;
    private double salesPrice;
    private Equipment equipment;
  
    public OrderItem (){
        equipment=new Equipment();
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }


    @Override
    public String toString() {
        return equipment.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
