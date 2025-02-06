/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author ASUS PC
 */
public class BubbleSort {

    private int[] array;

    public BubbleSort(int number) {
        Random random = new Random();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(number);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void bubbleSort() {
        boolean sortCheck;
        for (int i = 0; i < array.length - 1; i++) {
            sortCheck = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sortCheck = false;
                }
            }
            if (sortCheck) {
                break;
            }
        }
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
