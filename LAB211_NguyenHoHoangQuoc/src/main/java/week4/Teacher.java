/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
class Teacher extends Person{

    private int yearInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0.0;
    }

    @Override
    public void inputAll(Scanner scanner) {
        super.inputAll(scanner);
        int age = java.time.Year.now().getValue() - this.yearOfBirth;
        this.yearInProfession = Utilizer.checkYearInProfession(scanner, age);
        this.contractType = Utilizer.checkContractType(scanner);
        this.salaryCoefficient = Utilizer.checkSalaryCoefficient(scanner);
    }

    public void setYearInProfession(int yearInProfession) {
        this.yearInProfession = yearInProfession;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public int getYearInProfession() {
        return yearInProfession;
    }

    public String getContractType() {
        return contractType;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "yearInProfession=" + yearInProfession + ", contractType=" + contractType + ", salaryCoefficient=" + salaryCoefficient + '}';
    }


}
