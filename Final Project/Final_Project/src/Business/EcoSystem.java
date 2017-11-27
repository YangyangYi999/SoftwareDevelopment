/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.NetworkDirectory;
import Business.Organization.BasicOrganization;

/**
 *
 * @author shinychenw
 */
public class EcoSystem extends BasicOrganization{
    private static EcoSystem system;
    private NetworkDirectory networkDirectory;
    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    private EcoSystem() {
        this.setName("Anti-Theft System");
        networkDirectory = new NetworkDirectory();
        
    }

    public NetworkDirectory getNetworkList() {
        return networkDirectory;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
}
