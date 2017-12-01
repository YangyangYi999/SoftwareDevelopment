/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Equipment.EquipmentDirectory;
import Business.Organization.BasicOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public abstract class Enterprise extends BasicOrganization{
    private OrganizationDirectory organizationDirectory;
    private Type type;
    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
    public enum Type{
    Aftersale("Aftersale"),
    Distributor("Distributor"),
    Insurance("Insurance"),
    Police("Police"),
    Provider("Provider"),
    Secure("Secure"),
    Statistic("Statistic"),
    Supplier("Supplier");
    private String value;
    
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString(){
            return value;
        }
        
        private Type(String str){
            this.value = str;
        }
        
    }
    
     public abstract ArrayList<Organization.Type> getSupportedOrg();
     
    public Enterprise(String name,Type type){
        super(name);
        this.type= type;
        organizationDirectory = new OrganizationDirectory();
        
    }

    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
