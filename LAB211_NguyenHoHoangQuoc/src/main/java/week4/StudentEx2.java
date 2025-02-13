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
class StudentEx2 extends Person {
    private int yearOfAdmission;
    private double entranceEnglishScore;

    public StudentEx2() {
        super();
        this.yearOfAdmission = 0;
        this.entranceEnglishScore = 0.0;
    }

    @Override
    public void inputAll(Scanner scanner) {
        super.inputAll(scanner);
        this.yearOfAdmission = Utilizer.checkYearOfAdmission(scanner, this.yearOfBirth);
        this.entranceEnglishScore = Utilizer.checkEntranceEnglishScore(scanner);
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public double getEntranceEnglishScore() {
        return entranceEnglishScore;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public void setEntranceEnglishScore(double entranceEnglishScore) {
        this.entranceEnglishScore = entranceEnglishScore;
    }

    @Override
    public String toString() {
        return super.toString()+"StudentEx2{" + "yearOfAdmission=" + yearOfAdmission + ", entranceEnglishScore=" + entranceEnglishScore + '}';
    }
    
    
    
}

