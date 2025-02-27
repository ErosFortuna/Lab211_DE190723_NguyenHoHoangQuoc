/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import week5.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class Utilizer {

    public static int forceNumber(Scanner scanner) {
        while (true) {
            try {
                int x = Integer.parseInt(scanner.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

    public static boolean isValidNumber(String num) {
        return num.matches("\\d+");
    }

    public static int checkNumber(Scanner scanner) {
        try {
            int x = Integer.parseInt(scanner.nextLine());
            return x;
        } catch (Exception e) {
            return -1;
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

    public static String checkRoomNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter room number (4 digits): ");
            String id = scanner.nextLine();
            if (id.matches("\\d{4}")) {
                return id;
            } else {
                System.out.println("Invalid ID! Must be 4 digits.");
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

    public static String checkPhoneNumberComplicated(Scanner scanner) {
        while (true) {
            String phoneNumber = scanner.nextLine();
            if (phoneNumber.matches("^(\\d{10}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}(?:\\s*(?:x|ext)\\d{1,7})?)$")) {
                return phoneNumber;
            } else {
                System.out.print("Please input Phone flow\n"
                    + "• 1234567890\n"
                    + "• 123-456-7890\n"
                    + "• 123-456-7890 x1234\n"
                    + "• 123-456-7890 ext1234\n"
                    + "• 123.456.7890\n"
                    + "• 123 456 7890 ");
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

    public static String getValid2Input(Scanner scanner, String optionA, String optionB) {
        String input;
        while (true) {
            System.out.print("Enter " + optionA + " or " + optionB + ": ");
            input = scanner.nextLine().trim().toUpperCase();
            if (input.equals(optionA.toUpperCase()) || input.equals(optionB.toUpperCase())) {
                return input;
            }
            System.out.println("Invalid input. Please enter " + optionA + " or " + optionB + ".");
        }
    }

    public static String getValid3Input(Scanner scanner, String optionA, String optionB, String optionC) {
        String input;
        while (true) {
            System.out.print("Enter " + optionA + " or " + optionB + " or " + optionC + ": ");
            input = scanner.nextLine().trim().toUpperCase();
            if (input.equals(optionA.toUpperCase()) || input.equals(optionB.toUpperCase()) || input.equals(optionC.toUpperCase())) {
                return input;
            }
            System.out.println("Invalid input. Please enter " + optionA + " or " + optionB + " or " + optionC + ".");
        }
    }

    public static String getNonEmptyInput(Scanner scanner) {
        String input;
        while (true) {
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Invalid input. Please enter a non-empty value.");
        }
    }

    public static Date forceValidDateInput(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date date = null;

        while (date == null) {
            System.out.print("Enter date (dd/MM/yyyy): ");
            String input = scanner.nextLine().trim();

            try {
                date = sdf.parse(input);
            } catch (Exception e) {
                System.out.println("Invalid date format or logic. Please enter a valid date (dd/MM/yyyy).");
                date = null;
            }
        }

        return date;
    }

    public static String forceValidDateStringInput(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date date = null;

        while (date == null) {
            System.out.print("Enter date (dd/MM/yyyy): ");
            String input = scanner.nextLine().trim();

            try {
                date = sdf.parse(input);
                return sdf.format(date);
            } catch (Exception e) {
                System.out.println("Invalid date format or logic. Please enter a valid date (dd/MM/yyyy).");
            }
        }
        return null;
    }

//    public static Date checkValidDateInput(Scanner scanner) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        sdf.setLenient(false);
//        Date date = null;
//
//        System.out.print("Enter date (dd/MM/yyyy): ");
//        String input = scanner.nextLine().trim();
//
//        try {
//            date = sdf.parse(input);
//        } catch (Exception e) {
//            date = null;
//        }
//
//        return date;
//    }
    public static String checkValidDateInput(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        System.out.print("Enter date (dd/MM/yyyy): ");
        String input = scanner.nextLine().trim();

        try {
            Date date = sdf.parse(input);
            return sdf.format(date); // Return the date as a properly formatted String
        } catch (Exception e) {
            return null; // Return null if parsing fails
        }
    }

    public static boolean isStartBeforeEndInFuture(String startDate, String endDate) {
        if (startDate == null || endDate == null) {
            System.out.println("Dates cannot be null");
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date start = sdf.parse(startDate);
            Date end = sdf.parse(endDate);
//            Date now = new Date();
            Date now = sdf.parse(sdf.format(new Date())); // Remove time component from 'now'

            if (start.before(now) || end.before(now)) {
                System.out.println("Both start and end dates must be in the future.");
                return false;
            }

            return start.before(end);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use 'dd/MM/yyyy' format.");
            return false;
        }
    }

}
