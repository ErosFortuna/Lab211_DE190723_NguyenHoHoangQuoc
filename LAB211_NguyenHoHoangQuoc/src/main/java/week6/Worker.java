/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;

/**
 *
 * @author ASUS PC
 */
public class Worker {

    private String id, name,   workLocation;
    int age,salary;
    private ArrayList<InformationSalary> hSalary;

    public Worker(String id, String name, int age,int salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.hSalary = new ArrayList();
    }

    public ArrayList<InformationSalary> gethSalary() {
        return hSalary;
    }

    public void sethSalary(ArrayList<InformationSalary> hSalary) {
        this.hSalary = hSalary;
    }
    
    public void addHSalary(InformationSalary salary){
        hSalary.add(salary);
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", workLocation=" + workLocation + '}';
    }

}
