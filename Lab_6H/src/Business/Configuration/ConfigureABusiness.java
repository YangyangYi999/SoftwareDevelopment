/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configuration;

import Business.Business;
import Business.Market.Market;
import Business.Market.MarketOffer;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Person.Customer;
import Business.Person.Person;
import Business.Person.Salesman;
import Business.Person.UserAccount;
import Business.Supplier.Product;
import Business.Supplier.Supplier;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author shinychenw
 */
public class ConfigureABusiness {
  public static void setAfterRead(Business business){
      for(Person p: business.getPersonDirectory().getPersonList()){
          for(UserAccount u: business.getUserAccountDirectory().getUserAccountList())
              if(u.getPerson() == p && u.getRole().equals("Sales Person")){
                  Person np = new Salesman();
                  np = p;
                  p = np;
                  break;
              }
      }
      
      
      
  }
  public static void readPersonCSV( Business business){
       String csvFile ="personList.csv";
        BufferedReader br = null;
        String cvsSplitBy = ",";
         String line = "";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
            String[] atribute = line.split(cvsSplitBy);
            Person p = business.getPersonDirectory().addPerson();
            p.setFirstName(atribute[0]);
            p.setLastName(atribute[1]);
            }
    }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
  
  public static void readSupplierDirectoryCSV(Business business){
    String csvFile = "supplierCatalog.csv";
    BufferedReader br = null;
    String cvsSplitBy = ",";
    String line = "";
  try{
        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                 String[] atribute = line.split(cvsSplitBy);
                Supplier s = business.getSupplierDirectory().addSupplier();
                s.setSupplierName(atribute[0]);
                readSupplierProducts(s);
                
            }
  
  }
  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
  }
 static void readSupplierProducts(Supplier s){
    String csvFile =s.getSupplierName()+ ".csv";
//    if(s.getSupplierName().equals("Apple")){
//     csvFile ="C:\\Users\\BoyangWei\\Desktop\\TeamCSV\\Apple.csv";
//    }
    BufferedReader br = null;
    String cvsSplitBy = ",";
    String line = "";
  try{
        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                 String[] atribute = line.split(cvsSplitBy);
                 Product p = s.getProductCatalog().addProduct();
                 p.setProductName(atribute[0]);
                 p.setAvail(Integer.parseInt(atribute[1]));
                
            }
  
  }
  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
      
  }
  static Product findProductbyName(String name, Business business){
  for(Supplier s: business.getSupplierDirectory().getSupplierDirectory()){
      for(Product p : s.getProductCatalog().getProductCatalog()){
        if(p.getProductName().equals(name)){
            return p;
        }
      }
  }return null;
  }
  
  public static void readMarketList(Business business){
   String csvFile="marketList.csv";
  BufferedReader br = null;
    String cvsSplitBy = ",";
    String line = "";
  try{
        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                 String[] atribute = line.split(cvsSplitBy);
                 if(atribute.length>1){
                Market m = business.getMarketList().addMarket();
                m.setName(atribute[0]);
                readCustomerList(m);
                 }
            }
  
  }
  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
  
  }
  
  static void readCustomerList(Market market){
     String csvFile=market.getName()+".csv";
  BufferedReader br = null;
    String cvsSplitBy = ",";
    String line = "";
  try{
        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                 String[] atribute = line.split(cvsSplitBy);
                 
                 for(int i=0;i<atribute.length;i++){
                 Customer cus = new Customer();
                 String[] name = atribute[i].split("\\s");
                 cus.setFirstName(name[0]);
                 cus.setLastName(name[1]);
                 market.getCustomerList().add(cus);
                         }
            }
            
  }
  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
  }
  
  
  static Market getMarket(String s, Business business){
  for(Market m : business.getMarketList().getMarketList()){
  if(m.getName().equals(s)){
  return m;
  }
  }return null;
  }  
  public static void readMarketOffer(Business business){
  String csvFile= "marketOffer.csv";
  BufferedReader br = null;
    String cvsSplitBy = ",";
    String line = "";
  try{
        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                 String[] atribute = line.split(cvsSplitBy);
                 if(atribute.length>1){
                MarketOffer mo = business.getMarketOfferCatalog().addMarketOffer();
                mo.setFloorPrice(Integer.parseInt(atribute[0]));
                mo.setCeilingPrice(Integer.parseInt(atribute[1]));
                mo.setTargetPrice(Integer.parseInt(atribute[2]));
                mo.setProduct(findProductbyName(atribute[3],business));
//                System.out.println(atribute[3]);
//                System.out.println(mo.getProduct().getProductName());
                mo.setMarket(getMarket(atribute[4],business));
                 }
            }
  
  }
  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
  
  }
  
  public static Person getPersonbyName(String first,String last, Business business){
  for(Person p : business.getPersonDirectory().getPersonList()){
   if(p.getFirstName().equals(first)&&p.getLastName().equals(last)){
      return p;
   }
  }
  return null;
  
  }
  
  
  
  
  
  public static void readMasterOrderCatalogCSV(Business business){
   String csvFile = "orderCatalog.csv";
   BufferedReader br = null;
   String cvsSplitBy = ",";
   String line = "";
  try{
        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
             String[] atribute = line.split(cvsSplitBy);
             if(atribute.length==1)
                 continue;
             Order order = new Order();
             business.getMasterOrderCatalog().addOrder(order);
             readOrderItemCSV(order,business);
             try{
             Person cus= new Customer();
             Person p = getPersonbyName(atribute[0],atribute[1],business);
             cus.setFirstName(p.getFirstName());
             cus.setLastName(p.getLastName());
             cus.setPersonID(p.getPersonID());
             business.getPersonDirectory().removePerson(p);
             business.getPersonDirectory().getPersonList().add(cus);
             order.setCustomer((Customer)cus);
             for(Market m: business.getMarketList().getMarketList()){
                 for(Customer c: m.getCustomerList()){
                     if(c.getLastName().equals(cus.getLastName())&&c.getFirstName().equals(cus.getFirstName())){
                         m.getCustomerList().remove(c);
                         m.getCustomerList().add((Customer)cus);
                         break;
                     }     
                 }
             }
             Person s = new Salesman();
             Person person = getPersonbyName(atribute[2],atribute[3],business);
             s.setFirstName(person.getFirstName());
             s.setLastName(person.getLastName());
             s.setPersonID(person.getPersonID());
             order.setSalesman((Salesman)s); 
             business.getPersonDirectory().removePerson(person);
             business.getPersonDirectory().getPersonList().add(s);
             }catch(Exception e){
              System.out.println("This person don't exist.");
            }
            }
  
  }
  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
  }
  
  static void readOrderItemCSV(Order order,Business business){
   String csvFile = "order"+String.valueOf(order.getOrderNumber())+".csv";
   BufferedReader br = null;
   String cvsSplitBy = ",";
   String line = "";
  try{
        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
              String[] atribute = line.split(cvsSplitBy);
              if(atribute.length>1){
              OrderItem oi = new OrderItem();
              if(atribute.length>1){
              oi.setQuantity(Integer.parseInt(atribute[0]));
              oi.setActualPrice(Double.parseDouble(atribute[1]));
              for(MarketOffer mo: business.getMarketOfferCatalog().getMarketOfferCatalog()){
                  if(mo.getId().equals(atribute[2])){
                     oi.setMarketOffer(mo);
                     break;
                  }
              }
              oi.setGap(oi.getActualPrice()-oi.getMarketOffer().getTargetPrice());
              order.getOrderItemList().add(oi);
              }
              }
            }
  
  }
  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
  
  }
  
  public static Supplier getSupplier(String name,Business business){
      if(!name.equals("null")){
      for(Supplier s: business.getSupplierDirectory().getSupplierDirectory()){
          if(s.getSupplierName().equals(name)){
              return s;
          }
      }
      }
      return null;
  }
          
          
          
          
  public static void readAccountsCSV(Business business){
   String csvFile = "userAccountList.csv";
   BufferedReader br = null;
   String cvsSplitBy = ",";
   String line = "";
  try{
        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
             String[] atribute = line.split(cvsSplitBy);
             UserAccount acc = business.getUserAccountDirectory().addUserAccount();
//            for(int i =0;i<atribute.length;i++){
//             System.out.println(atribute[i]);}
             acc.setUsername(atribute[0]);
             acc.setPassWord(atribute[1]);
             acc.setRole(atribute[2]);
             if(atribute[3].equals("TRUE")){
             acc.setAccountStatus(true);}else{acc.setAccountStatus(false);}
             if(getSupplier(atribute[4],business)!=null)
             {acc.setSupplier(getSupplier(atribute[4],business));}
             acc.setPerson(getPersonbyName(atribute[5],atribute[6],business));
            }
  
  }
  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
  }
}
