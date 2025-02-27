package week6;

import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS PC
 */
public class WorkerListView {

    WorkerList list = new WorkerList();

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "================ Worker Management =================="
                + "\n1. Add Worker"
                + "\n2. Up salary"
                + "\n3. Down salary"
                + "\n4. Display Information salary"
                + "\n5. Exit"
        );
        return Utilizer.forceNumber(scanner);
    }

    public void addWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------- Add Worker ----------");

        System.out.println("Enter Code:");
        String code;
        while (true) {
            boolean check = true;
            code = Utilizer.getNonEmptyInput(scanner);
            for (Worker course : list.getWorker()) {
                if (course.getId().equals(code)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                break;
            } else {
                System.out.println("the id must be unique");
            }
        }

        System.out.println("Enter Name:");
        String name = Utilizer.checkFullName(scanner);

        System.out.println("Enter Age:");
        int age = Utilizer.forceNumber(scanner);

        System.out.println("Enter Salary:");
        int salary = Utilizer.forceNumber(scanner);

        System.out.println("Enter work location:");
        String location = Utilizer.getNonEmptyInput(scanner);

        Worker worker = new Worker(code, name, age, salary, location);
        list.addWorker(worker);

    }

    public void adjustSalary(String choice) {
        Scanner scanner = new Scanner(System.in);
        if (choice.equalsIgnoreCase("UP")) {
            System.out.println("------- Up Salary --------");
        } else {
            System.out.println("------- Down Salary --------");
        }

        System.out.println("Enter Code:");
        String code = scanner.nextLine();
        boolean check=false;
        for (Worker worker : list.getWorker()) {
            if (worker.getId().equals(code)) {
                check=true;
                System.out.println("Enter amount of money :");
                int money = Utilizer.forceNumber(scanner);
                if (choice.equalsIgnoreCase("UP")) {
                    worker.gethSalary().add(new InformationSalary(worker.getSalary() + money, "UP", new Date()));
                    worker.setSalary(worker.getSalary() + money);
                } else {
                    worker.gethSalary().add(new InformationSalary(worker.getSalary() - money, "DOWN", new Date()));
                    worker.setSalary(worker.getSalary() - money);

                }
                break;
            } 

        }
        if(!check){
            System.out.println("not found");
        }
    }

    public void displayHistorySalary() {
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.printf("%-4s %-6s %-2s %-4s %-10s %s\n", "code", "name", "age", "salary", "status", "date");
        for (Worker worker : list.getWorker()) {
            for (InformationSalary hSalary : worker.gethSalary()) {
                System.out.printf("%-4s %-6s %-4d %-5d %-7s %s\n", worker.getId(), worker.getName(), worker.getAge(), hSalary.gethSalary(), hSalary.getStatus(), hSalary.getDate());
            }
        }

    }

}
