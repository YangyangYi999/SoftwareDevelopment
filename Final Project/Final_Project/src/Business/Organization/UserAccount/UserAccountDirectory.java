/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.UserAccount;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.UserAccount.Role.Role;
import Business.State.State;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public static boolean isValid(String str, EcoSystem system){
        for(Network network:system.getNetworkList().getNetworkList()){
            for(State state:network.getStateDirectory().getStateList()){
                for(Enterprise en: state.getEnterpriseDirectory().getEnterpriseList()){
                    if(!en.getUserAccountDirectory().checkIfUsernameIsUnique(str)){
                        return false;
                    }else{
                        for(Organization org: en.getOrganizationDirectory().getOrganizationList()){
                            if(!org.getUserAccountDirectory().checkIfUsernameIsUnique(str)){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
