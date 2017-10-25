/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author shinychenw
 */
public class Salesman extends Person{
    private int rank;
    private double revenue;
    private double gap;
    private double salary;

    public Salesman() {
        salary=1000;
    }
    
    

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public static int getCount() {
        return count;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getGap() {
        return gap;
    }

    public void setGap(double gap) {
        this.gap = gap;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    @Override
    public String toString(){
        return this.getFirstName()+" "+this.getLastName();
    }
}
