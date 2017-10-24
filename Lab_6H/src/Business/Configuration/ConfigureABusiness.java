/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configuration;

import Business.Business;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Person.UserAccount;
import Business.Person.UserAccountDirectory;
import Business.Supplier.Product;
import Business.Supplier.ProductCatalog;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;

/**
 *
 * @author shinychenw
 */
public class ConfigureABusiness {
    public static Business Initialize (String n){
        Business b = new Business(n);
        
        PersonDirectory pd = b.getPersonDirectory();
        
        Person p = pd.addPerson();
        p.setFirstName("Jialin");
        p.setLastName("Yang");
        
        p = pd.addPerson();
        p.setFirstName("Yuchen");
        p.setLastName("Wang");
        
        p = pd.addPerson();
        p.setFirstName("Yun");
        p.setLastName("Yang");
        
        p = pd.addPerson();
        p.setFirstName("Tong");
        p.setLastName("Xie");
        
        p = pd.addPerson();
        p.setFirstName("Ann");
        p.setLastName("Wells");
        
        p = pd.addPerson();
        p.setFirstName("John");
        p.setLastName("Adam");
        
        SupplierDirectory sd = b.getSupplierDirectory();
        Supplier s = sd.addSupplier();
        
        s.setSupplierName("YYY");
        ProductCatalog pc = s.getProductCatalog();
        Product pro = pc.addProduct();
        pro.setAvail(5);
        pro.setProductName("apple");
        
        
        UserAccountDirectory uad = b.getUserAccountDirectory();
        Person p2 = pd.findPersonByID(1);
        if(p2!=null){
            UserAccount ua = uad.addUserAccount();
            ua.setPerson(p2);
            ua.setUsername("yjl1");
            ua.setPassWord(MD5Util.md5("yjl1"));
            ua.setRole("System Admin");
            ua.setAccountStatus(true);
        }
        
        p2 = pd.findPersonByID(2);
        
        if(p2!=null){
            UserAccount ua = uad.addUserAccount();
            ua.setPerson(p2);
            ua.setUsername("yjl2");
            ua.setPassWord(MD5Util.md5("yjl2"));
            ua.setRole("Supplier");
            ua.setSupplier(s);
            ua.setAccountStatus(true);
        }   
        
        p2 = pd.findPersonByID(3);
        if(p2!=null){
            UserAccount ua = uad.addUserAccount();
            ua.setPerson(p2);
            ua.setUsername("yy");
            ua.setPassWord(MD5Util.md5("yy"));
            ua.setRole("Market Manager");
            ua.setAccountStatus(true);
        }
        
        p2 = pd.findPersonByID(4);
        if(p2!=null){
            UserAccount ua = uad.addUserAccount();
            ua.setPerson(p2);
            ua.setUsername("xt");
            ua.setPassWord(MD5Util.md5("xt"));
            ua.setRole("Sales Person");
            ua.setAccountStatus(true);
        }
        
        return b;
    }
}
