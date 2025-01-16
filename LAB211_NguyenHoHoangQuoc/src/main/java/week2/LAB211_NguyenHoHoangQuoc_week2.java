/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class LAB211_NguyenHoHoangQuoc_week2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.printf("\n=======================================");
            System.out.println("\nmenu:");
            System.out.println("1.computer program");
            System.out.println("2.program to calculate perimeter and area");
            System.out.println("3.Matrix");
            System.out.println("4.exit");
            System.out.println("=======================================");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1: {
                    int choice = 0;
                    while (choice != 3) {
                        System.out.println("========= Calculator Program =========");
                        System.out.println("1. Normal Calculator");
                        System.out.println("2. BMI Calculator");
                        System.out.println("3. Exit");
                        System.out.println("Please choice one option:");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1: {
                                System.out.println("enter a number");
                                double a = Double.parseDouble(scanner.nextLine());
                                while (true) {
                                    System.out.println("please input the operator");
                                    String opt = scanner.nextLine();
                                    if (opt.equals("=")) {
                                        System.out.println("Final result = " + a);
                                        break;
                                    } else if (opt.matches("[+\\-*/^]")) {
                                        System.out.println("enter another number:");
                                        double b = Double.parseDouble(scanner.nextLine());
                                        ComputerProgram Ncomputer = new ComputerProgram(a, b, opt);
                                        a = Ncomputer.calculate();
                                        System.out.println("memory = " + a);
                                    } else {
                                        System.out.println("Error operator");
                                    }
                                }
                                break;
                            }
                            case 2: {
                                ComputerProgram check = new ComputerProgram();
                                System.out.println("enter Weight(kg):");
                                double weight = Double.NaN;
                                String temp;
                                while (Double.isNaN(weight)) {
                                    temp = scanner.nextLine();
                                    weight = check.checkValidNumber(temp);
                                }
                                System.out.println("enter Height(cm):");
                                double height = Double.NaN;
                                while (Double.isNaN(height)) {
                                    temp = scanner.nextLine();
                                    height = check.checkValidNumber(temp) / 100;
                                    System.out.println(height);
                                }
                                ComputerProgram BMIcomputer = new ComputerProgram(weight, height);
                                System.out.println("BMI Number: " + BMIcomputer.calculateBMI());
                                if (BMIcomputer.calculateBMI() < 19) {
                                    System.out.println("BMI Status:Under-standard");
                                } else if (BMIcomputer.calculateBMI() < 25 && BMIcomputer.calculateBMI() >= 19) {
                                    System.out.println("BMI Status:Standard");

                                } else if (BMIcomputer.calculateBMI() >= 25 && BMIcomputer.calculateBMI() < 30) {
                                    System.out.println("BMI Status:Overweight");

                                } else if (BMIcomputer.calculateBMI() < 40 && BMIcomputer.calculateBMI() >= 30) {
                                    System.out.println("BMI Status:Fat - should lose weight");

                                } else {
                                    System.out.println("BMI Status:Very fat - should lose weight immediately");

                                }

                                break;
                            }
                        }
                    }
                }
                case 2:{
                    System.out.println("=====Calculator Shape Program=====");
                    System.out.println("Please input side width of Rectangle:");
                    double width=Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input length of Rectangle:");
                    double length=Double.parseDouble(scanner.nextLine());
                    Rectangle rectangle=new Rectangle(length, width);
                    
                    System.out.println("Please input radius of Circle:");
                    double radius=Double.parseDouble(scanner.nextLine());
                    Circle circle=new Circle(radius);
                    
                    System.out.println("Please input side A of Triangle:");
                    double a=Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input side B of Triangle:");
                    double b=Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input side C of Triangle:");
                    double c=Double.parseDouble(scanner.nextLine());
                    Triangle triangle=new Triangle(a, b, c);
                    
                    rectangle.printResult();
                    circle.printResult();
                    triangle.printResult();
                    
                    
                }
            }

        }
    }

}
