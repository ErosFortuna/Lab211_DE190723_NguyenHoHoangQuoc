/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

/**
 *
 * @author ASUS PC
 */
public class EquationSolving {

    private double a, b, c;

    public EquationSolving() {
    }

    public EquationSolving(double a, double b, double c) {
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

    public List<Double> calculateEquation() {
        List<Double> result = new ArrayList<>();
        if (a == 0 && b == 0) {
            return result;
        } else if (a == 0) {
            return null;
        } else {
            result.add(-b / a);
            return result;
        }
    }

    public ArrayList<Double> calculateQuadraticEquation() {
        ArrayList<Double> result = new ArrayList<>();
        if (a == 0&&c==0) {
            return result;
        }else if(a==0){
            result.add(-c / b);
            return result;
        }
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            return null;
        } else if (delta == 0) {
            result.add(-b / (2 * a));
            return result;
        } else {
            result.add((-b + Math.sqrt(delta)) / (2 * a));
            result.add((-b - Math.sqrt(delta)) / (2 * a));
            return result;
        }
    }

    public double checkValidNumber(String number){
         try {
            return Double.parseDouble(number);
        } catch (Exception e) {
             System.out.println("Please input number");
             return Double.NaN;
        }
    }
    
    public boolean isOdd(double number) {
        return number % 2 != 0;
    }

    public boolean isPerfectSquare(double number) {
        if (number < 0) {
            return false;
        }
        double sqrt = Math.sqrt(number);
        return sqrt == Math.floor(sqrt);
    }

}
