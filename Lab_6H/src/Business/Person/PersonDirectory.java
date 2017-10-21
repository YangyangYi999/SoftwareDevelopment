/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void removePerson(Person person){
        personList.remove(person);
    }
    
    public Person findPersonByID(int s){
        for(Person p: personList){
            if(p.getPersonID()==s)
                return p;
        }
        return null;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
}
