/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Random;

/**
 *
 * @author ASUS PC
 */
public class LinearSearch {
    private int arrayNumber[];

    public LinearSearch(int number) {
        this.arrayNumber = new int[number];
    }

    public int[] getArraynumber() {
        return arrayNumber;
    }

    public void setArraynumber(int[] arraynumber) {
        this.arrayNumber = arraynumber;
    }

    public void addRandomValue(int number) {
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            arrayNumber[i] = random.nextInt(number);
        }
    }

    public void displayArray(int number) {
        System.out.print("[");
        for (int i = 0; i < number; i++) {
            if (i == number - 1) {
                System.out.println(arrayNumber[i]+"]");
            } else {
                System.out.print(arrayNumber[i] + ",");
            }
        }
    }

    public int findNumber(int number,int searchValue){
        int result=-1;
        for(int i=0;i<number;i++){
            if(arrayNumber[i]==searchValue){
                result=i;
                break;
            }
        }
        return result;
    }

}
