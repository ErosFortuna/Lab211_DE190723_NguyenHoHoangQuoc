/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class LAB211_NguyenHoHoangQuoc_week5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exercise = 0;
        while (exercise != 4) {
            
            System.out.printf("\n=======================================");
            System.out.println("\nmenu:");
            System.out.println("1.Course management");
            System.out.println("2.Manage room reservations");
            System.out.println("3.Large number");
            System.out.println("4.exit");
            System.out.println("=======================================");
            exercise = Integer.parseInt(scanner.nextLine());
            switch (exercise) {
                case 1: {
                    CourseListView view = new CourseListView();
                    int option = 0;
                    while (option != 6) {
                        option = view.menu();
                        switch (option) {
                            case 1: {
                                view.addOnlOffCourse();
                                break;
                            }
                            case 2: {
                                view.updateCourse();
                                break;
                            }
                            case 3: {
                                view.deleteCourse();
                                break;
                            }
                            case 4: {
                                System.out.println("Do you want to print all (A), online course (O) or offline course (F): ");
                                view.printAllCourse(Utilizer.getValid3Input(scanner, "A", "O", "F"));
                                break;
                            }
                            case 5: {
                                view.searchCourse();
                                break;
                            }

                            case 6:
                                System.out.println("Exit now...");
                        }
                    }
                    break;
                }
                case 2: {
                    ReservationListView view = new ReservationListView();
                    int option = 0;
                    while (option != 6) {
                        option = view.menu();
                        switch (option) {
                            case 1: {
                                view.createReservation();
                                break;
                            }
                            case 2: {
                                view.updateReservation();
                                break;
                            }
                            case 3: {
                                view.deleteReservation();
                                break;
                            }
                            case 4: {
                                view.printFlightInformation();
                                break;
                            }
                            case 5: {
                                view.printAllReservations();
                                break;
                            }

                            case 6:
                                System.out.println("Exit now...");

                        }

                    }
                    break;
                }
                case 3:{
                    LargeNumber calculator =new LargeNumber();
                    calculator.calculateLargeNumber(scanner);
                    break;
                }

            }
        }

    }
}
