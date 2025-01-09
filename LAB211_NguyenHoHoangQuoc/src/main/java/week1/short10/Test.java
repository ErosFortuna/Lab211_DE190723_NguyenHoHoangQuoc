/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short10;

/**
 *
 * @author ASUS PC
 */
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of array:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("enter search value:");
        int searchValue = Integer.parseInt(scanner.nextLine());
        LinearSearch array = new LinearSearch(number);
        array.randomArray(number);
        System.out.println("the array: ");
        array.displayArray(number);
        if (array.findNumber(number, searchValue)== -1) {
            System.out.println("Don't have the search value in array");
        } else {
            System.out.println("Found " + searchValue + " at index : " + array.findNumber(number, searchValue));

        }

    }
}
