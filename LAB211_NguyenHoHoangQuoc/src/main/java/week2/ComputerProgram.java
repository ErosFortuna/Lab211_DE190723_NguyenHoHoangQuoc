package week2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS PC
 */
public class ComputerProgram {

    private double numberOne, numberTwo;
    private double weight, height;
    private String operator;

    public ComputerProgram() {
    }

    
    
    public ComputerProgram(double numberOne, double numberTwo, String operator) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operator = operator;
    }

    public ComputerProgram(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getOperator() {
        return operator;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case "+": {
                return numberOne + numberTwo;
            }
            case "-": {
                return numberOne - numberTwo;
            }
            case "*": {
                return numberOne - numberTwo;
            }
            case "^": {
                return Math.pow(numberOne, numberTwo);
            }
            case "/": {
                return numberOne / numberTwo;
            }
        }
        return 0;
    }

    public double calculateBMI(){
        return weight/(height*height);
    }

        public double checkValidNumber(String number){
         try {
            return Double.parseDouble(number);
        } catch (Exception e) {
             System.out.println("Please input number");
             return Double.NaN;
        }
    }
}
