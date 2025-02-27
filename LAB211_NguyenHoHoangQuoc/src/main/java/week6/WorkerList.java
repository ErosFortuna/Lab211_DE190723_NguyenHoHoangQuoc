/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;

/**
 *
 * @author ASUS PC
 */
public class WorkerList {
    private ArrayList<Worker> workers;

    public WorkerList() {
        workers=new ArrayList();
    }

    public ArrayList<Worker> getWorker() {
        return workers;
    }
    
    public void addWorker(Worker worker){
        workers.add(worker);
    } 
    
}
