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
public class LAB211_NguyenHoHoangQuoc_week4 {

    public static void main(String[] args) {
        int exercise = 0;
        while (exercise != 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("\n=======================================");
            System.out.println("\nmenu:");
            System.out.println("1.manage students");
            System.out.println("2.Student and Teacher information");
            System.out.println("3.exit");
            System.out.println("=======================================");
            exercise = Integer.parseInt(scanner.nextLine());
            switch (exercise) {
                case 1: {
                    StudentView view = new StudentView();
                    int option = 0;
                    while (option != 5) {
                        option = view.menu();
                        switch (option) {
                            case 1: {
                                view.createStudent();
                                view.printAllStudents();
                                break;
                            }
                            case 2: {
                                view.findAndSort();
                                break;
                            }
                            case 3: {
                                view.updateOrDelete();
                                break;
                            }
                            case 4: {
                                view.report();
                                break;
                            }

                        }
                    }
                    break;
                }
                case 2: {
                    PersonList list = new PersonList();
                    int option = 0;
                    while (option != 4) {
                        System.out.println("=======================================");
                        System.out.println(" Information Management");
                        System.out.println("1. Teacher");
                        System.out.println("2. Student");
                        System.out.println("3. Person");
                        System.out.println("4. Exit");
                        System.out.print("You choose: ");
                        System.out.println("=======================================");
                        option = Utilizer.checkNumber(scanner);

                        switch (option) {
                            case 1: {
                                int choice = 0;
                                while (choice != 3) {
                                    System.out.println("=======================================");
                                    System.out.println(" Teacher Management ");
                                    System.out.println("1. Input");
                                    System.out.println("2. Print");
                                    System.out.println("3. Exit");
                                    System.out.println("=======================================");
                                    System.out.print("You choose: ");
                                    choice = Utilizer.checkNumber(scanner);

                                    switch (choice) {
                                        case 1: {
                                            Teacher teacher = new Teacher();
                                            teacher.inputAll(scanner);
                                            list.addPerson(teacher);
                                            System.out.println("Teacher added successfully!");
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("=======================================");
                                            System.out.println(" List of Teachers ");
                                            for (Person pTeacher : list.getPeople()) {
                                                if (pTeacher instanceof Teacher) {
                                                    System.out.println(pTeacher.toString());
                                                    System.out.println("--------------------------");
                                                }
                                            }
                                            System.out.println("=======================================");
                                            break;
                                        }
                                        case 3: {
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 2: {
                                int choice = 0;
                                while (choice != 3) {
                                    System.out.println("=======================================");
                                    System.out.println(" Student Management");
                                    System.out.println("1. Input");
                                    System.out.println("2. Print");
                                    System.out.println("3. Exit");
                                    System.out.println("=======================================");
                                    System.out.print("You choose: ");
                                    choice = Utilizer.checkNumber(scanner);

                                    switch (choice) {
                                        case 1: {
                                            StudentEx2 student = new StudentEx2();
                                            student.inputAll(scanner);
                                            list.addPerson(student);
                                            System.out.println("Students added successfully!");
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("=======================================");
                                            System.out.println("List of Students");
                                            for (Person pStudent : list.getPeople()) {
                                                if (pStudent instanceof StudentEx2) {
                                                    System.out.println(pStudent.toString());
                                                    System.out.println("--------------------------");
                                                }
                                            }
                                            System.out.println("=======================================");
                                            break;
                                        }
                                        case 3: {
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 3: {
                                int choice = 0;
                                while (choice != 3) {
                                    System.out.println("=======================================");
                                    System.out.println(" Person Management ");
                                    System.out.println("1. Search");
                                    System.out.println("2. Print all");
                                    System.out.println("3. Exit");
                                    System.out.println("=======================================");
                                    System.out.print("You choose: ");
                                    choice = Utilizer.checkNumber(scanner);

                                    switch (choice) {
                                        case 1:
                                            System.out.print("Name: ");
                                            String name = scanner.nextLine();
                                            boolean found = false;
                                            for (Person person : list.getPeople()) {
                                                if (person.fullName.equalsIgnoreCase(name)) {
                                                    System.out.println("Result:");
                                                    person.printInfo();
                                                    found = true;
                                                }
                                            }
                                            if (!found) {
                                                System.out.println("Result: not found");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("=======================================");
                                            System.out.println(" List of Persons ");
                                            for (Person person : list.getPeople()) {
                                                person.printInfo();
                                                System.out.println("--------------------------");
                                            }
                                            System.out.println("=======================================");
                                            break;
                                        case 3:
                                            break;
                                    }

                                }
                                break;
                            }
                        }
                    }
                }

            }
        }
    }
}
