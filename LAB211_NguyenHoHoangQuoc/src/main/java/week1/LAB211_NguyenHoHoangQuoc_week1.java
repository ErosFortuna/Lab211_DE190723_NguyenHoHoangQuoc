/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class LAB211_NguyenHoHoangQuoc_week1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.printf("\n=======================================");
            System.out.println("\nmenu:");
            System.out.println("1.Letter and character count");
            System.out.println("2.Linear search");
            System.out.println("3.Change base number system (16, 10, 2) program");
            System.out.println("4.Solving the equation, find the square numbers, even numbers, and odd numbers.");
            System.out.println("5.exit");
            System.out.println("=======================================");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("=======================================");
                    System.out.println("enter the sentence:");
                    String input = scanner.nextLine();
                    LetterAndCharacterCount count = new LetterAndCharacterCount(input);
                    count.countLetter();
                    count.countCharater();
                    System.out.println("=======================================");
                }
                case 2: {
                    System.out.println("=======================================");
                    System.out.println("enter number of array:");
                    int number = Integer.parseInt(scanner.nextLine());
                    System.out.println("enter search value:");
                    int searchValue = Integer.parseInt(scanner.nextLine());
                    LinearSearch array = new LinearSearch(number);
                    array.addRandomValue(number);
                    System.out.println("the array: ");
                    array.displayArray(number);
                    if (array.findNumber(number, searchValue) == -1) {
                        System.out.println("Don't have the search value in array");
                    } else {
                        System.out.println("Found " + searchValue + " at index : " + array.findNumber(number, searchValue));
                    }
                    System.out.println("=======================================");
                }
                case 3: {
                    System.out.println("=======================================");
                    System.out.println("choose the base number input(1 is binary, 2 is decimal, 3 is hexadecimal):");
                    int in = Integer.parseInt(scanner.nextLine());
                    System.out.println("choose the base number out(1 is binary, 2 is decimal, 3 is hexadecimal):");
                    int out = Integer.parseInt(scanner.nextLine());
                    System.out.println("enter input value");
                    String x = scanner.nextLine();
                    BaseNumberChange number = new BaseNumberChange(x);
                    if (number.changeBaseNumber(in, out) == null) {
                        System.out.println("error");
                    } else {
                        System.out.println("output value is: " + number.changeBaseNumber(in, out));
                    }
                    System.out.println("=======================================");
                }
                case 4: {
                    System.out.println("=======================================");
                    System.out.println("========= Equation Program =========\n"
                            + "1. Calculate Superlative Equation\n"
                            + "2. Calculate Quadratic Equation\n"
                            + "3. Exit\n"
                            + "Please choice one option:");
                    int choice = Integer.parseInt(scanner.nextLine());
                    EquationSolving check = new EquationSolving();
                    switch (choice) {
                        case 1: {
                            System.out.println("Enter A:");
                            String temp;
                            double a = Double.NaN;
                            while (Double.isNaN(a)) {
                                temp = scanner.nextLine();
                                a = check.checkValidNumber(temp);
                            }
                            System.out.println("Enter B:");
                            double b = Double.NaN;
                            while (Double.isNaN(b)) {
                                temp = scanner.nextLine();
                                b = check.checkValidNumber(temp);
                            }
                            EquationSolving equation = new EquationSolving(a, b, 0);
                            System.out.println("solution: x = " + equation.calculateEquation());
                            if (check.isOdd(a) && check.isOdd(b)) {
                                System.out.println("Number is Odd: " + a + "," + b);
                            } else if (!check.isOdd(a) && !check.isOdd(b)) {
                                System.out.println("Number is even: " + a + "," + b);
                            } else {
                                System.out.print("Number is Odd: ");
                                if (check.isOdd(a)) {
                                    System.out.print(a + ",");
                                }
                                if (check.isOdd(b)) {
                                    System.out.print(b);
                                }
                                System.out.printf("\nNumber is even: ");
                                if (!check.isOdd(a)) {
                                    System.out.print(a + ",");
                                }
                                if (!check.isOdd(b)) {
                                    System.out.print(b);
                                }
                            }
                            System.out.print("\nNumber is Perfect Square: ");
                            if (check.isPerfectSquare(a)) {
                                System.out.print(a + ",");
                            }
                            if (check.isPerfectSquare(b)) {
                                System.out.print(b);
                            }
                        }
                        case 2: {
                            System.out.println("Enter A:");
                            String temp;
                            double a = Double.NaN;
                            while (Double.isNaN(a)) {
                                temp = scanner.nextLine();
                                a = check.checkValidNumber(temp);
                            }
                            System.out.println("Enter B:");
                            double b = Double.NaN;
                            while (Double.isNaN(b)) {
                                temp = scanner.nextLine();
                                b = check.checkValidNumber(temp);
                            }
                            System.out.println("Enter C:");
                            double c = Double.NaN;
                            while (Double.isNaN(c)) {
                                temp = scanner.nextLine();
                                c = check.checkValidNumber(temp);
                            }
                            EquationSolving equation = new EquationSolving(a, b, c);
                            int i=0;
                            if(equation.calculateQuadraticEquation()==null){
                                System.out.println("no solution");
                            }else if(equation.calculateQuadraticEquation().isEmpty()){
                                System.out.println("infinitely many solutions");
                            }else{
                                System.out.print("solution: ");
                                for(double x:equation.calculateQuadraticEquation()){
                                    System.out.print("x"+(i+1)+" = "+x+",");
                                    i++;
                                }
                            }
                            if (check.isOdd(a) && check.isOdd(b)&&check.isOdd(c)) {
                                System.out.println("\nNumber is Odd: " + a + "," + b+","+c);
                            } else if (!check.isOdd(a) && !check.isOdd(b)&&!check.isOdd(c)) {
                                System.out.println("\nNumber is even: " + a + "," + b+","+c);
                            } else {
                                System.out.print("\nNumber is Odd: ");
                                if (check.isOdd(a)) {
                                    System.out.print(a + ",");
                                }
                                if (check.isOdd(b)) {
                                    System.out.print(b+ ",");
                                }
                                if (check.isOdd(c)) {
                                    System.out.print(c);
                                }
                                System.out.printf("\nNumber is even: ");
                                if (!check.isOdd(a)) {
                                    System.out.print(a + ",");
                                }
                                if (!check.isOdd(b)) {
                                    System.out.print(b+ ",");
                                }
                                if (!check.isOdd(c)) {
                                    System.out.print(c);
                                }     
                            }
                            System.out.print("\nNumber is Perfect Square: ");
                            if (check.isPerfectSquare(a)) {
                                System.out.print(a + ",");
                            }
                            if (check.isPerfectSquare(b)) {
                                System.out.print(b+ ",");
                            }
                            if (check.isPerfectSquare(c)) {
                                System.out.print(c);
                            }
                        }
                    }
                }
            }
        }
    }
}
