/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Comparator;

/**
 *
 * @author ASUS PC
 */
public class StudentEx1 {
    private int id,semester;
    private String studentName,courseName;

    public StudentEx1(int id, int semester, String studentName, String courseName) {
        this.id = id;
        this.semester = semester;
        this.studentName = studentName;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return   "id=" + id + "| semester=" + semester + "| studentName=" + studentName + "| courseName=" + courseName;
    }

    public int getId() {
        return id;
    }

    public int getSemester() {
        return semester;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
}


class SortByName implements Comparator<StudentEx1>{
    public int compare(StudentEx1 a,StudentEx1 b){
        return a.getStudentName().compareTo(b.getStudentName());
    }
}