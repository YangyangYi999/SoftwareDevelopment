/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MarketManager;

import Business.Person.Salesman;
import Business.Supplier.Product;
import java.util.Comparator;

/**
 *
 * @author shinychenw
 */
public class SortSalesman implements Comparator{
    public int compare(Object o1, Object o2) {
          Salesman s1 = (Salesman) o1;
          Salesman s2 = (Salesman) o2;
          if (s1.getRevenue() > s2.getRevenue())
           return -1;
           return 1;
         }
}
