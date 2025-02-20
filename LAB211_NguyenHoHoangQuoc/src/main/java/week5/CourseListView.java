/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;
import jdk.jshell.execution.Util;

/**
 *
 * @author ASUS PC
 */
public class CourseListView {

    CourseList list = new CourseList();

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "================ Course Management =================="
                + "\n1. Add online course/ offline course"
                + "\n2. Update course"
                + "\n3. Delete course"
                + "\n4. Print all course/ online course / offline course"
                + "\n5. Search information base on course name"
                + "\n6. exit");
        return Utilizer.forceNumber(scanner);
    }

    public void addOnlOffCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Add new course ==========");
        System.out.println("do you want to add online course(O) or offline course(F)");
        String choice = Utilizer.getValid2Input(scanner, "O", "F");
        if (choice.equalsIgnoreCase("O")) {
            System.out.println("=========== Create new online course ============");
        } else {
            System.out.println("=========== Create new offline course ============");
        }

        System.out.print("\nCourse ID:");
        String courseId;
        while (true) {
            boolean check = true;
            courseId = Utilizer.getNonEmptyInput(scanner);
            for (Course course : list.getCourses()) {
                if (course.getCourseId().equals(courseId)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                break;
            }
        }

        System.out.print("\nCourse name:");
        String courseName;
        while (true) {
            boolean check = true;
            courseName = Utilizer.getNonEmptyInput(scanner);
            for (Course course : list.getCourses()) {
                if (course.getCourseId().equals(courseName)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                break;
            }
        }

        System.out.print("\nCredits:");
        int credits = Utilizer.forceNumber(scanner);

        if (choice.equalsIgnoreCase("O")) {

            System.out.print("\nPlatform:");
            String platform = Utilizer.getNonEmptyInput(scanner);

            System.out.print("\nInstructors:");
            String instructors = Utilizer.getNonEmptyInput(scanner);

            System.out.print("\nNote:");
            String note = Utilizer.getNonEmptyInput(scanner);

            OnlineCourse onlCourse = new OnlineCourse(platform, instructors, note, courseId, courseName, credits);
            list.addCourse(onlCourse);
        } else {
            System.out.print("\nBegin:");
            String begin = Utilizer.forceValidDateStringInput(scanner);

            System.out.print("\nEnd:");
            String end;
            while (true) {
                end = Utilizer.forceValidDateStringInput(scanner);
                if (Utilizer.isStartBeforeEndInFuture(begin, end)) {
                    break;
                } else {
                    System.out.println("Data input is invalid, end must be after begin");
                }
            }

            System.out.print("\nCampus:");
            String campus = Utilizer.getNonEmptyInput(scanner);

            OfflineCourse offCourse = new OfflineCourse(begin, end, campus, courseId, courseName, credits);
            list.addCourse(offCourse);
        }

    }

    public void searchCourse() {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Course name:");
        String courseNmae = scanner.nextLine();
        Course found = null;
        for (Course course : list.getCourses()) {
            if (course.getCourseName().equalsIgnoreCase(courseNmae)) {
                found = course;
                System.out.println(course.toString());
            }
            if (found == null) {
                System.out.println("No data found, do you want to find again? (Y/N):");
                String choice = Utilizer.getValid2Input(scanner, "Y", "N");
                if (choice.equalsIgnoreCase("N")) {
                    return;
                }
            }
        }
    }
    }
    public void updateCourse() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========== Update course ==========");
            System.out.print("Course ID:");
            String courseId = scanner.nextLine();
            Course found = null;
            for (Course course : list.getCourses()) {

                if (course.getCourseId().equalsIgnoreCase(courseId)) {
                    found = course;
                    System.out.println(course.toString());
                }
            }
            System.out.println("===== Updating =====");
            System.out.println("Note: Enter empty if you don't want to change it.");

            System.out.println("Course ID:");
            courseId = scanner.nextLine();
            if (Utilizer.checkNull(courseId)) {
                found.setCourseId(courseId);
            }

            System.out.println("Course name:");
            String courseName = scanner.nextLine();
            if (Utilizer.checkNull(courseName)) {
                found.setCourseName(courseName);
            }

            System.out.println("Credits:");
            int credits = Utilizer.checkNumber(scanner);
            if (credits != -1) {
                found.setCredits(credits);
            }

            if (found instanceof OnlineCourse) {

                System.out.println("Platform:");
                String platform = scanner.nextLine();
                if (Utilizer.checkNull(platform)) {
                    ((OnlineCourse) found).setPlatform(platform);
                }

                System.out.println("Instructors:");
                String instructors = scanner.nextLine();
                if (Utilizer.checkNull(instructors)) {
                    ((OnlineCourse) found).setInstructors(instructors);
                }

                System.out.println("Note:");
                String note = scanner.nextLine();
                if (Utilizer.checkNull(note)) {
                    ((OnlineCourse) found).setNote(note);
                }

            } else if (found instanceof OfflineCourse) {

                System.out.println("Begin: ");
                String begin = Utilizer.checkValidDateInput(scanner);
                if (Utilizer.checkNull(begin)) {
                    ((OfflineCourse) found).setBegin(begin);
                }

                System.out.println("end: ");
                String end = Utilizer.checkValidDateInput(scanner);
                if (Utilizer.checkNull(begin)) {
                    ((OfflineCourse) found).setEnd(end);
                }

                System.out.println("Campus: ");
                String campus = scanner.nextLine();
                if (Utilizer.checkNull(begin)) {
                    ((OfflineCourse) found).setCampus(campus);
                }

            }
            if (found == null) {
                System.out.println("No data found, do you want to find again? (Y/N):");
                String choice = Utilizer.getValid2Input(scanner, "Y", "N");
                if (choice.equalsIgnoreCase("N")) {
                    return;
                }
            }
            break;
        }

    }

    public void printAllCourse(String choice) {
        switch (choice) {
            case "O": {
                System.out.println("===== Online Course =====");
                for (Course course : list.getCourses()) {
                    if (course instanceof OnlineCourse) {
                        System.out.println(course.toString());
                    }
                }
                break;
            }
            case "F": {
                System.out.println("===== Offline Course =====");
                for (Course course : list.getCourses()) {
                    if (course instanceof OfflineCourse) {
                        System.out.println(course.toString());
                    }
                }
                break;
            }
            case "A": {
                System.out.println("===== all On/Off Course =====");
                for (Course course : list.getCourses()) {
                    System.out.println(course.toString());
                }
                break;
            }

        }

    }

    public void deleteCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Course name:");
        String courseNmae = scanner.nextLine();
        Course found = null;
        for (Course course : list.getCourses()) {
            if (course.getCourseName().equalsIgnoreCase(courseNmae)) {
                found = course;
                list.deleteCourse(course);
                System.out.println("CourseId: " + found.getCourseId() + " deleted");
            }
            if (found == null) {
                System.out.println("No data found, do you want to find again? (Y/N):");
                String choice = Utilizer.getValid2Input(scanner, "Y", "N");
                if (choice.equalsIgnoreCase("N")) {
                    return;
                }
            }
        }
    }

}
