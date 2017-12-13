/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Equipment;

import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class EquipmentDirectory {
    private ArrayList <Equipment> equipmentList;

    public EquipmentDirectory() {
        equipmentList = new ArrayList();
    }
    
    public Equipment createEquipment(String name,int quantity,double price) {
        
        Equipment equipment = new Equipment(name);
        equipment.setStock(quantity);
        equipment.setPrice(price);
        equipmentList.add(equipment);
        return equipment;
    }
    
    public void deleteEquipment(Equipment equipment){
        equipmentList.remove(equipment);
    }

    public ArrayList<Equipment> getEquipmentList() {
        return equipmentList;
    }
    
    
}
