/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import Business.Configuration.MD5Util;

/**
 *
 * @author shinychenw
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<UserAccount>();
    }
    
    public UserAccount addUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void removeUserAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
    }
    
    
    public UserAccount findUserAccount(String userid){
        for(UserAccount ua: userAccountList){
            if(userid.equals(ua.getUsername())){
                return ua;
            }
        }
        return null;
    } 
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    
}
