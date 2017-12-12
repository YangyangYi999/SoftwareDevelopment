/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.UserAccount.Role.AdminRole;
import Business.Organization.UserAccount.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class BasicOrganization extends Organization{
    public BasicOrganization(String name) {
        super(name);
    }
    public BasicOrganization(){
        super("BasicOrganization");
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new AdminRole());
        return roleList;
    }
    
}
