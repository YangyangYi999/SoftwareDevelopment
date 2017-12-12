/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.Type;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class EnterpriseDirectory {
    private ArrayList <Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }
    
    public Enterprise createEnterprise(String name,Type type) {
        Enterprise enterprise =null;
        switch(type){
            case Aftersale: {
                enterprise = new AfterSale(name); break;
            }  
            case Distributor:{
                enterprise = new Distributor(name); break;
            }
            case Insurance:{
                enterprise = new Insurance(name); break;
            }
            case Police:{
                enterprise = new Police(name);break;
            }
            case Provider:{
                enterprise = new Provider(name);break;
            }
            case Secure:{
                enterprise = new Secure(name);break;
            }
            case Statistic:{
                enterprise = new Statistic(name);break;
            }
            case Supplier:{
                enterprise = new Supplier(name);break;
            }
    }
        enterpriseList.add(enterprise);
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    
}
