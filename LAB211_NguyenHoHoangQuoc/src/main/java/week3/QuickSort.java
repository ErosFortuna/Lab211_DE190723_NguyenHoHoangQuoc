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
public class QuickSort {

    private int[] array;

    public QuickSort(int number) {
        Random random = new Random();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(number);
        }
    }

    public int[] getArray() {
        return array;
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
    
    
  public void quickSort(int head, int tail) {
        if (head < tail) {
            int pivotIndex = head + (tail - head) / 2;
            int pivot = array[pivotIndex];
            int partitionIndex = partition(head, tail, pivot);
            quickSort(head, partitionIndex - 1);
            quickSort(partitionIndex, tail);
        }
    }

    public int partition(int start, int end, int pivot) {
        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }
            while (array[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }
    
    

    
}
