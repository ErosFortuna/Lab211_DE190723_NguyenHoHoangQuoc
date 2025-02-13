/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
class Person {
    protected String id;
    protected String fullName;
    protected String phoneNumber;
    protected int yearOfBirth;
    protected String major;

    public Person() {
        this.id = "";
        this.fullName = "";
        this.phoneNumber = "";
        this.yearOfBirth = 0;
        this.major = "";
    }

    public void inputAll(Scanner scanner) {
        this.id = Utilizer.checkId(scanner);
        this.fullName = Utilizer.checkFullName(scanner);
        this.phoneNumber = Utilizer.checkPhoneNumber(scanner);
        this.yearOfBirth = Utilizer.checkYearOfBirth(scanner);
        this.major = Utilizer.checkMajor(scanner);
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Full Name: " + fullName + ", Phone: " + phoneNumber + 
                           ", Year of Birth: " + yearOfBirth + ", Major: " + major);
       }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", yearOfBirth=" + yearOfBirth + ", major=" + major + '}';
    }
    
    
    
    
}

