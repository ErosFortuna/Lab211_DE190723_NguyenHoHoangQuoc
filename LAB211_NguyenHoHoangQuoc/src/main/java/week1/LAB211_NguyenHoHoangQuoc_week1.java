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
            System.out.println("=======================================");
            System.out.println("menu:");
            System.out.println("1.Letter and character count");
            System.out.println("2.Linear search");
            System.out.println("3.Change base number system (16, 10, 2) program");
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

            }
        }
    }
}
