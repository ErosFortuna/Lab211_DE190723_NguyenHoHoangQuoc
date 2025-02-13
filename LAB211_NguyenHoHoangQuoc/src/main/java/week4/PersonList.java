/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;

/**
 *
 * @author ASUS PC
 */
public class PersonList {
   private ArrayList<Person> people;
    
    public PersonList(){
        people =new ArrayList();
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    
    public void addPerson(Person person){
        people.add(person);
    }
    
    
    
    
}
