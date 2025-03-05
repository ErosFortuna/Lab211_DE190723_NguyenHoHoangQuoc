/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author ASUS PC
 */
public class LAB211_NguyenHoHoangQuoc_week7 {

    public static void main(String[] args) {

        View view = new View();
        int choice = 0;
        while (choice != 4) {
            choice = view.menu();
            switch (choice) {
                case 1: {
                    view.addFruit();
                    break;
                }
                case 2: {
                    view.viewOrders();
                    break;
                }
                case 3: {
                    view.shopping();
                    break;
                }

            }

        }

    }

}
