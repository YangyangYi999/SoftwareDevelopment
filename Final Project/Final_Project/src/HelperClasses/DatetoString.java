/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BoyangWei
 */
public class DatetoString {
     public static String DatetoString(Date date){
       SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); 
       String str = sdf.format(date);
      return str;
    }
    
}
