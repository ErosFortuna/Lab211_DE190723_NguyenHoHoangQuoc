/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.ArrayList;
/**
 *
 * @author ASUS PC
 */
public class StudentList {
   private ArrayList<StudentEx1> students;

    public StudentList() {
        students=new ArrayList();
    }

    public ArrayList<StudentEx1> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<StudentEx1> students) {
        this.students = students;
    }
    
    public void addStudent(StudentEx1 student){
        students.add(student);
    }
    
    public void removeStudent(StudentEx1 student){
        students.remove(student);
    }
    
    public void removeAllList(ArrayList<StudentEx1> removeStudent){
        students.removeAll(removeStudent);
    }
    
    
}
