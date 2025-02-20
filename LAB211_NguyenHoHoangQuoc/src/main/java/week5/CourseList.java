/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;

/**
 *
 * @author ASUS PC
 */
public class CourseList {

    ArrayList<Course> courses;

    public CourseList() {
        courses = new ArrayList();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void deleteCourse(Course course) {
        courses.remove(course);
    }

}
