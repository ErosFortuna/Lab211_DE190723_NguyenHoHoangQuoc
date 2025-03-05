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
public class Order {
    private String name;
    private  FruitList oFruits;

    public Order(String name, FruitList fruits) {
        this.name = name;
        this.oFruits = fruits;
    }

    public String getName() {
        return name;
    }

    public FruitList getOFruits() {
        return oFruits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFruits(FruitList fruits) {
        this.oFruits = fruits;
    }
}
