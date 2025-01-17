/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author ASUS PC
 */
public class Matrix {
    private int rows;
    private int columns;
    private double[][] matrix;

    public Matrix() {
    }
    
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    public void setElement(int row, int column, double value) {
        this.matrix[row][column] = value;
    }

    public double getElement(int row, int column) {
        return this.matrix[row][column];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Matrix additionMatrix(Matrix matrix2) {
        if (this.rows != matrix2.getRows() || this.columns != matrix2.getColumns()) {
            return null;
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setElement(i, j, this.getElement(i, j) + matrix2.getElement(i, j));
            }
        }
        return result;
    }

    public Matrix subtractionMatrix(Matrix matrix2) {
        if (this.rows != matrix2.getRows() || this.columns != matrix2.getColumns()) {
            return null;
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setElement(i, j, this.getElement(i, j) - matrix2.getElement(i, j));
            }
        }
        return result;
    }

    public Matrix multiplicationMatrix(Matrix matrix2) {
        if (this.columns != matrix2.getRows()) {
            return null;
        }
        Matrix result = new Matrix(this.rows, matrix2.getColumns());
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix2.getColumns(); j++) {
                double sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.getElement(i, k) * matrix2.getElement(k, j);
                }
                result.setElement(i, j, sum);
            }
        }
        return result;
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public double checkValidNumber(String number){
         try {
            return Double.parseDouble(number);
        } catch (Exception e) {
             System.out.println("Please input valid number");
             return Double.NaN;
        }
}
}
