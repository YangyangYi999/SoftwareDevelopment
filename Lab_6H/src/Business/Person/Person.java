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
public class Person {
    private String lastName;
    private String firstName;
    private int personID;
    public static int count=0;
    
    public Person() {
        count++;
        personID=count;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPersonID() {
        return personID;
    }
    
    @Override
    public String toString(){
        return firstName+" "+lastName+" "+personID;
    }
}
