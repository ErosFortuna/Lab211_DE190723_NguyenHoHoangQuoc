/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ASUS PC
 */
public class PersonList {

    private List<Person> people = new ArrayList();

    public PersonList() {
        people = new ArrayList();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void sortPeople(int choice) {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                switch (choice) {
                    case 1 -> {
                        if (o1 instanceof Teacher && o2 instanceof Teacher) {
                            Teacher t1 = (Teacher) o1;
                            Teacher t2 = (Teacher) o2;
                            return Integer.compare(t2.getYearInProfession(), t1.getYearInProfession());
                        }
                    }
                    case 2 -> {
                        if (o1 instanceof StudentEx2 && o2 instanceof StudentEx2) {
                            StudentEx2 s1 = (StudentEx2) o1;
                            StudentEx2 s2 = (StudentEx2) o2;
                            return Integer.compare(s1.getYearOfAdmission(), s2.getYearOfAdmission());
                        }
                    }
                    case 3 -> {
                        return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth());
                    }
                }
                return -1;
            }
        });
    }

}
