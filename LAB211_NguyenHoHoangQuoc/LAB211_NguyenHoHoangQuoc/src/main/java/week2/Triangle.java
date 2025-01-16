/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author ASUS PC
 */
public class Triangle extends Shape{

    private double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: "+a);
        System.out.println("Side B: "+b);
        System.out.println("Side C: "+c);
        System.out.println("Area : "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return a+b+c; 
    }

    @Override
    public double getArea() {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    
    
}
