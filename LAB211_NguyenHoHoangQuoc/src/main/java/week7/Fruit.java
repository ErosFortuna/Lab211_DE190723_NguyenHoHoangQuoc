/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author ASUS PC
 */
public class Fruit {
    private int id,price,quantity;
    private String name,origin;

    public Fruit(int id, int price, int quantity, String name, String origin) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "id=" + id + ", price=" + price + ", quantity=" + quantity + ", name=" + name + ", origin=" + origin + '}';
    }
      
}
