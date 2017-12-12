/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Organization.BasicOrganization;
import Business.State.StateDirectory;

/**
 *
 * @author shinychenw
 */
public class Network extends BasicOrganization{
    
    private StateDirectory stateDirectory;
    public Network(String name) {
        this.setName(name);
        stateDirectory = new StateDirectory();
    }

    public StateDirectory getStateDirectory() {
        return stateDirectory;
    }
    
    public String toString(){
        return this.getName();
    }
}
