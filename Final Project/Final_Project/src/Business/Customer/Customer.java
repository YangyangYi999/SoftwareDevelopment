/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organization.WorkQueue.WorkQueue;
import Business.Organization.WorkQueue.WorkRequest;


/**
 *
 * @author shinychenw
 */
public class Customer {
    private String username;
    private String password;
    private WorkQueue workQueue;
    private String Location;

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    public Customer(){
        workQueue = new WorkQueue();
    }
    
    
    
}
