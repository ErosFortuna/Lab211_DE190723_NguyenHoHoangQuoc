/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author ASUS PC
 */
import java.util.Scanner;

public class LargeNumber {

    public void calculateLargeNumber(Scanner scanner) {

        while (true) {
            System.out.println("\nLarge Number Calculator");
            System.out.println("Enter first number (or 'exit' to quit):");
            String num1 = scanner.nextLine().trim();

            if (num1.equalsIgnoreCase("exit")) {
                break;
            }

            if (!Utilizer.isValidNumber(num1)) {
                System.out.println("Invalid number! Please enter only digits.");
                continue;
            }

            System.out.println("Enter second number:");
            String num2 = scanner.nextLine().trim();

            if (!Utilizer.isValidNumber(num2)) {
                System.out.println("Invalid number! Please enter only digits.");
                continue;
            }

            System.out.println("\nResults:");
            System.out.println("Sum: " + add(num1, num2));
            System.out.println("Product: " + multiply(num1, num2));
        }
    }

    public static String add(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            result.insert(0, (sum % 10));
            carry = sum / 10;
        }

        return result.toString();
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;
                int pos1 = i + j;
                int pos2 = i + j + 1;

                int sum = product + result[pos2];
                result[pos2] = sum % 10;
                result[pos1] += sum / 10;
            }
        }

        StringBuilder finalResult = new StringBuilder();
        boolean leadingZero = true;

        for (int digit : result) {
            if (digit != 0) {
                leadingZero = false;
            }
            if (!leadingZero) {
                finalResult.append(digit);
            }
        }

        return finalResult.length() == 0 ? "0" : finalResult.toString();
    }
}
