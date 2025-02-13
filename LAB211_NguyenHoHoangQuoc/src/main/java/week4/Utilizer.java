/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import week3.*;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class Utilizer {

    public static int checkNumber(Scanner scanner) {
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

    public static Boolean checkNull(String string) {
        return string != null && !string.isEmpty() && !string.trim().isEmpty();
    }

    public static String checkId(Scanner scanner) {
        while (true) {
            System.out.print("Enter ID (6 digits): ");
            String id = scanner.nextLine();
            if (id.matches("\\d{6}")) {
                return id;
            } else {
                System.out.println("Invalid ID! Must be 6 digits.");
            }
        }
    }

    public static String checkFullName(Scanner scanner) {
        while (true) {
            System.out.print("Enter full name (alphabet and spaces only): ");
            String fullName = scanner.nextLine();
            if (fullName.matches("[a-zA-Z\\s]+")) {
                return fullName;
            } else {
                System.out.println("Invalid full name! Must contain only letters and spaces.");
            }
        }
    }

    public static String checkPhoneNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter phone number (12 digits): ");
            String phoneNumber = scanner.nextLine();
            if (phoneNumber.matches("\\d{12}")) {
                return phoneNumber;
            } else {
                System.out.println("Invalid phone number! Must be 12 digits.");
            }
        }
    }

    public static int checkYearOfBirth(Scanner scanner) {
        int currentYear = java.time.Year.now().getValue();
        while (true) {
            try {
                System.out.print("Enter year of birth (before current year): ");
                int yearOfBirth = Integer.parseInt(scanner.nextLine());
                if (yearOfBirth < currentYear) {
                    return yearOfBirth;
                } else {
                    System.out.println("Invalid year! Must be before " + currentYear + ".");
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid year.");
            }
        }
    }

    public static String checkMajor(Scanner scanner) {
        while (true) {
            System.out.print("Enter major (max 30 characters): ");
            String major = scanner.nextLine();
            if (major.length() <= 30) {
                return major;
            } else {
                System.out.println("Invalid major! Must be 30 characters or less.");
            }
        }
    }

    public static int checkYearInProfession(Scanner scanner, int age) {
        while (true) {
            try {
                System.out.print("Enter year in profession (0 to less than age): ");
                int yearInProfession = Integer.parseInt(scanner.nextLine());
                if (yearInProfession >= 0 && yearInProfession < age) {
                    return yearInProfession;
                } else {
                    System.out.println("Invalid year! Must be between 0 and less than age.");
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid number.");
            }
        }
    }

    public static String checkContractType(Scanner scanner) {
        while (true) {
            System.out.print("Enter contract type (Long/Short): ");
            String contractType = scanner.nextLine();
            if (contractType.equalsIgnoreCase("Long") || contractType.equalsIgnoreCase("Short")) {
                return contractType;
            } else {
                System.out.println("Invalid contract type! Must be 'Long' or 'Short'.");
            }
        }
    }

    public static double checkSalaryCoefficient(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter salary coefficient (0 or greater): ");
                double salaryCoefficient = Double.parseDouble(scanner.nextLine());
                if (salaryCoefficient >= 0) {
                    return salaryCoefficient;
                } else {
                    System.out.println("Invalid value! Must be 0 or greater.");
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid number.");
            }
        }
    }

    public static int checkYearOfAdmission(Scanner scanner, int birthYear) {
        int currentYear = java.time.Year.now().getValue();
        while (true) {
            try {
                System.out.print("Enter year of admission (between birth year and current year): ");
                int yearOfAdmission = Integer.parseInt(scanner.nextLine());
                if (yearOfAdmission >= birthYear && yearOfAdmission <= currentYear) {
                    return yearOfAdmission;
                } else {
                    System.out.println("Invalid year! Must be between " + birthYear + " and " + currentYear + ".");
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid year.");
            }
        }
    }

    public static double checkEntranceEnglishScore(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter entrance English score (0 to 100): ");
                double score = Double.parseDouble(scanner.nextLine());
                if (score >= 0 && score <= 100) {
                    return score;
                } else {
                    System.out.println("Invalid score! Must be between 0 and 100.");
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid score.");
            }
        }
    }
    
}
