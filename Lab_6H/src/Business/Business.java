/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Configuration.ConfigureABusiness;
import Business.Market.MarketList;
import Business.Market.MarketOfferCatalog;
import Business.Order.MasterOrderCatalog;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Person.UserAccount;
import Business.Person.UserAccountDirectory;
import Business.Supplier.SupplierDirectory;

/**
 *
 * @author shinychenw
 */
public class Business {
    private String name;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private MarketOfferCatalog marketOfferCatalog;
    private MarketList marketList;
    
    public Business(String n) {
        name = n;
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        supplierDirectory = new SupplierDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        marketOfferCatalog = new MarketOfferCatalog();
        marketList = new MarketList();
         ConfigureABusiness.readSupplierDirectoryCSV(this);
         ConfigureABusiness.readPersonCSV(this);
         ConfigureABusiness.readAccountsCSV(this);
         ConfigureABusiness.readMarketList(this);
         ConfigureABusiness.readMarketOffer(this);
         ConfigureABusiness.readMasterOrderCatalogCSV(this);
            
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public MarketList getMarketList() {
        return marketList;
    }

    public void setMarketList(MarketList marketList) {
        this.marketList = marketList;
    }
    
    
    public int findUserAccountNumByPerson(Person p){
        int n = 0;
        for(UserAccount ua: this.getUserAccountDirectory().getUserAccountList()){
            if(ua.getPerson() == p)
                n++;
        }
        return n;
    }
    
    
    
}
