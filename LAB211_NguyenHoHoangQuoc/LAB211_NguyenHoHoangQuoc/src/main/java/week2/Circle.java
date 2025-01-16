/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author ASUS PC
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.println("Radius: " + radius);
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    @Override
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

}
