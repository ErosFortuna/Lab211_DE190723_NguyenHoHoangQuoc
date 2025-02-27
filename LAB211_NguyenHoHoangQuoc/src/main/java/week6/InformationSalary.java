/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Date;

/**
 *
 * @author ASUS PC
 */
public class InformationSalary {
    private String status;
    private int hSalary;
    private Date date;

    public InformationSalary(int hSalary, String status, Date date) {
        this.hSalary = hSalary;
        this.status = status;
        this.date = date;
    }
    
    public int gethSalary() {
        return hSalary;
    }

    public String getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    public void sethSalary(int hSalary) {
        this.hSalary = hSalary;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "InformationSalary{" + "hSalary=" + hSalary + ", status=" + status + ", date=" + date + '}';
    }

}
