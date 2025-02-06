/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author ASUS PC
 */
public class BinarySearch {

    private int[] array;

    public BinarySearch(int number) {
        Random random = new Random();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(number);
        }
        Arrays.sort(array);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void sortArray() {

    }

    public int search(int sNumber, int start, int end) {
        if (start <= end) {
            int midElement =start+(end-start)/ 2;
            if (array[midElement] == sNumber) {
                return midElement;
            } else if (array[midElement] > sNumber) {
                return search(sNumber, start, midElement - 1);
            } else {
                return search(sNumber, midElement + 1, end);
            }
        }
        return -1;
    }

    public void displayArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
