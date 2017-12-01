/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class Provider extends Enterprise{
    
    public Provider(String name) {
        super(name, Enterprise.Type.Provider);
    }
     @Override
    public ArrayList<Organization.Type> getSupportedOrg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
