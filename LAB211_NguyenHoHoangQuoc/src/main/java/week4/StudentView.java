/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class StudentView {

    StudentList list = new StudentList();

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n=======================================");
        System.out.println("\nmenu:");
        System.out.println("1.Create student");
        System.out.println("2.Find and Sort student");
        System.out.println("3.Update/Delete student");
        System.out.println("4.Report");
        System.out.println("5.exit");
        System.out.println("=======================================");
        return Integer.parseInt(scanner.nextLine());
    }

    public void createStudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String choice;
            System.out.println("Enter the id of student:");
            int id = Utilizer.checkNumber(scanner);

            System.out.println("Enter the student name:");
            String name = scanner.nextLine();

            System.out.println("Enter the semester of the student:");
            int semester = Utilizer.checkNumber(scanner);

            System.out.println("Enter the course name of the student:");
            String course = scanner.nextLine();

            StudentEx1 student = new StudentEx1(id, semester, name, course);
            list.addStudent(student);

            do {
                System.out.println("do you want to continue Y/N");
                choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("n")) {
                    return;
                } else if (choice.equalsIgnoreCase("y")) {
                    break;
                } else {
                    choice = null;
                }
            } while (choice == null);
        }

    }

    public void printAllStudents() {
        System.out.println("All Students:");
        for (StudentEx1 student : list.getStudents()) {
            System.out.println(student.toString());
        }
    }

    public void findAndSort() {
        List<StudentEx1> tempList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of student you want to search");
        String name = scanner.nextLine();

        for (StudentEx1 student : list.getStudents()) {
            if (student.getStudentName().equalsIgnoreCase(name)) {
                tempList.add(student);
            }
        }
        Collections.sort(tempList, new SortByName());
        for (StudentEx1 student : tempList) {
            System.out.println(student.toString());
        }
    }

    public void updateOrDelete() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the id of student you want to search");
        int id = Utilizer.checkNumber(scanner);

        for (StudentEx1 student : list.getStudents()) {
            if (student.getId() == id) {
                System.out.println(student.toString());
                String choice;
                do {
                    System.out.println("do you want to update or delete(U/D)");
                    choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("u")) {
                        System.out.println("Enter the student name:(enter or leave blank to not change information)");
                        String Uname = scanner.nextLine();
                        if (Utilizer.checkNull(Uname)) {
                            student.setStudentName(Uname);
                        }

                        System.out.println("Enter the semester of the student:");
                        int Usemester = Utilizer.checkNumber(scanner);
                        student.setSemester(Usemester);

                        System.out.println("Enter the course name of the student:(enter or leave blank to not change information)");
                        String Ucourse = scanner.nextLine();
                        if (Utilizer.checkNull(Ucourse)) {
                            student.setCourseName(Ucourse);
                        }
                        System.out.println("update complete");
                        return;
                    } else if (choice.equalsIgnoreCase("d")) {
                        ArrayList<StudentEx1> removeStudents=new ArrayList();
                        for(StudentEx1 removeStudent:list.getStudents()){
                            if(student.getId()==removeStudent.getId()){
                                removeStudents.add(removeStudent);
                            } 
                        }
                        list.removeAllList(removeStudents);
                        System.out.println("remove complete");
                        return;
                    } else {
                        choice = null;
                        System.out.println("Error,please choose again");
                    }
                } while (choice == null);
                return;

            }
        }

    }

    public void report() {
        HashMap<String, Integer> report = new HashMap();
        for (StudentEx1 student : list.getStudents()) {
            String key = student.getId() + "|" + student.getStudentName() + "|" + student.getCourseName();
            report.put(key, report.getOrDefault(key, 0) + 1);
        }
        for (HashMap.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + "|" + entry.getValue());

        }

    }

}
