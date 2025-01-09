/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short08;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String input = scanner.nextLine();
        LetterAndCharacterCount count = new LetterAndCharacterCount(input);
        count.countLetter();
        count.countCharater();

    }

}
