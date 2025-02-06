/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class LAB211_NguyenHoHoangQuoc_week3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.printf("\n=======================================");
            System.out.println("\nmenu:");
            System.out.println("1.Bubble sort algorithm");
            System.out.println("2.Quick sort algorithm");
            System.out.println("3.Binary search algorithm");
            System.out.println("4.Stacks");
            System.out.println("5.exit");
            System.out.println("=======================================");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Enter of number of array :");
                    int number = utilizer.checkNumber();
                    BubbleSort bbSort = new BubbleSort(number);
                    System.out.println("array before sort: ");
                    bbSort.displayArray();
                    System.out.println("array after sort: ");
                    bbSort.bubbleSort();
                    bbSort.displayArray();
                }
                case 2: {
                    System.out.println("Enter of number of array :");
                    int number = utilizer.checkNumber();
                    QuickSort qSort = new QuickSort(number);
                    System.out.println("array before sort: ");
                    qSort.displayArray();
                    System.out.println("array after sort: ");
                    qSort.quickSort(0, qSort.getArray().length - 1);
                    qSort.displayArray();
                }
                case 3: {
                    System.out.println("Enter of number of array :");
                    int number = utilizer.checkNumber();
                    BinarySearch bSearch = new BinarySearch(number);
                    System.out.println("the random sorted array");
                    bSearch.displayArray();
                    System.out.println("enter the number you want to search");
                    int sNumber = utilizer.checkNumber();
                    System.out.println("Found " + sNumber + " at the index: " + bSearch.search(sNumber, 0, number-1));
                    break;
                }
                case 4: {
                    Stack stack = new Stack();
                    System.out.println("enter number of element you want to add");
                    int number = utilizer.checkNumber();
                    for (int i = 0; i < number; i++) {
                        System.out.println("enter the " + (i + 1) + " element");
                        int tempData = utilizer.checkNumber();
                        stack.push(tempData);
                    }
                    System.out.println("the stack after enter data");
                    stack.traverse();
                    System.out.println("node is pop: " + stack.pop̣().data);
                    System.out.println("the Stack after pop");
                    stack.traverse();
                    System.out.println("Node is top");
                    if (stack.get() == null) {
                        break;
                    } else {
                        System.out.println(stack.get().data);
                        System.out.println("the Stack after top");
                        stack.traverse();
                    }

                }
            }

        }
    }
}
