/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class LAB211_NguyenHoHoangQuoc_week6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exercise = 0;
        while (exercise != 3) {

            System.out.printf("\n=======================================");
            System.out.println("\nmenu:");
            System.out.println("1.Worker management");
            System.out.println("2.Contact Management Program");
            System.out.println("3.exit");
            System.out.println("=======================================");
            exercise = Utilizer.forceNumber(scanner);
            switch (exercise) {
                case 1: {
                    WorkerListView view = new WorkerListView();
                    int choice = 0;
                    while (choice != 5) {
                        choice = view.menu();
                        switch (choice) {
                            case 1: {
                                view.addWorker();
                                break;
                            }
                            case 2: {
                                view.adjustSalary("up");
                                break;
                            }
                            case 3: {
                                view.adjustSalary("DOWN");
                                break;
                            }
                            case 4: {
                                view.displayHistorySalary();
                                break;
                            }
                        }

                    }
                    break;
                }
                case 2: {
                    ContactListView view = new ContactListView();
                    int choice = 0;
                    while (choice != 4) {
                        choice = view.menu();
                        switch (choice) {
                            case 1: {
                                view.addContact();
                                break;
                            }
                            case 2: {
                                view.displayAllContact();
                                break;
                            }
                            case 3: {
                                view.deleteContact();
                                break;
                            }

                        }

                    }

                }

            }

        }
    }
}
