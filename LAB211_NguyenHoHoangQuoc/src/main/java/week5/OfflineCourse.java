/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author ASUS PC
 */
public class OfflineCourse extends Course {

    private String begin, end, campus;

    public OfflineCourse() {
        super();
        this.begin = "";
        this.end = "";
        this.campus = "";
    }

    public OfflineCourse(String begin, String end, String campus, String courseId, String courseName, int credits) {
        super(courseId, courseName, credits);
        this.begin = begin;
        this.end = end;
        this.campus = campus;
    }

    public String getBegin() {
        return begin;
    }

    public String getEnd() {
        return end;
    }

    public String getCampus() {
        return campus;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + "OfflineCourse{" + "begin=" + begin + ", end=" + end + ", campus=" + campus + '}';
    }

}
