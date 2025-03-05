/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.ArrayList;

/**
 *
 * @author ASUS PC
 */
public class FruitList {
    private ArrayList<Fruit> fruits;

    public FruitList() {
        fruits=new ArrayList();
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }
    
    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }
    
    
    
}
