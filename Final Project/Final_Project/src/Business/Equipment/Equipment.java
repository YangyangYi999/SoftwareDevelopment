/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Equipment;

import Business.Alert.Alert;
import Business.Alert.AlertDirectory;
import Business.Customer.Customer;
import Business.Enterprise.Insurance;
import Business.Enterprise.Secure;
import Business.Organization.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author shinychenw
 */
public class Equipment {
    private String name;
    private int stock;
    private boolean alert = false;
    private WorkQueue sendedRequests;
    private Date manufacturedDate;
    private ArrayList<UpdateRecord> updatedRecords;
    private AlertDirectory alertDirectory;
    private Insurance insurance;
    private Secure secure;
    private String status;
    private double price;


    public void setSendedRequests(WorkQueue sendedRequests) {
        this.sendedRequests = sendedRequests;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public void setUpdatedRecords(ArrayList<UpdateRecord> updatedRecords) {
        this.updatedRecords = updatedRecords;
    }

    public void setAlertDirectory(AlertDirectory alertDirectory) {
        this.alertDirectory = alertDirectory;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setSecure(Secure secure) {
        this.secure = secure;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = Status;
    }
    

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public ArrayList<UpdateRecord> getUpdatedRecords() {
        return updatedRecords;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Secure getSecure() {
        return secure;
    } 


    public AlertDirectory getAlertDirectory() {
        return alertDirectory;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public boolean isAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        this.alert = alert;
    }

    public WorkQueue getSendedRequests() {
        return sendedRequests;
    }
    
    public Equipment(String name){
        this.sendedRequests = new WorkQueue();
        this.updatedRecords = new ArrayList();
        this.manufacturedDate = new Date();
        this.name= name;
        this.status = "on sale";
    }
    
    private void sendAlert(Customer c){
        if(!alert){
            double i = Math.random()*100;
            if(i>50) {
            Alert a = new Alert(c);
          secure.getAlertDirectory().getAlertList().add(a);
          alert = true;
            }
                
        }
    }
    
    private void sendStatus(){
        if(this.status=="normal"){
            double i = Math.random()*100;
            if(i>98){
                this.status = "abnormal";
            }
        }
    }
    
    public void startTimer(Customer customer){
         TimerTask task = new TimerTask(){
             @Override
             public void run() {
                sendStatus();
                sendAlert(customer);
             } 
         };
          Timer timer = new Timer();
          timer.schedule(task, 0, 1000*5);//20min
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
}
