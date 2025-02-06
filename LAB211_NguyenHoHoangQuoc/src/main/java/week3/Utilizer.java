/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class Utilizer {

    public static int checkNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("enter a number");
                int x = Integer.parseInt(scanner.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

}
