/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author ASUS PC
 */
public class OnlineCourse extends Course {

    private String platform, instructors, note;

    public OnlineCourse(String platform, String instructors, String note, String courseId, String courseName, int credits) {
        super(courseId, courseName, credits);
        this.platform = platform;
        this.instructors = instructors;
        this.note = note;
    }

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructors = "";
        this.note = "";
    }
    
    
    public String getPlatform() {
        return platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public String getNote() {
        return note;
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

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public void setNote(String note) {
        this.note = note;
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
        return super.toString() + "OnlineCourse{" + "platform=" + platform + ", instructors=" + instructors + ", note=" + note + '}';
    }

}
