/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class NetworkDirectory {
    private ArrayList <Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList();
    }
    
    public Network createNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(Network network){
        networkList.remove(network);
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    
}
