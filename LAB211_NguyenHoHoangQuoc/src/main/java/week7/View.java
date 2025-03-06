/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class View {

    OrderList oList = new OrderList();
    FruitList fList = new FruitList();

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "================ manage a Fruit Shop =================="
                + "\n1. Create Fruit"
                + "\n2. View orders"
                + "\n3. Shopping (for buyer)"
                + "\n4. Exit"
        );
        return Utilizer.forceNumber(scanner);
    }

    public void addFruit() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int id = fList.getFruits().size() + 1;

            System.out.println("Enter Fruit Name:");
            String name = Utilizer.getNonEmptyInput(scanner);

            System.out.println("Enter Origin:");
            String origin = Utilizer.getNonEmptyInput(scanner);

            System.out.println("Enter Price:");
            int price = Utilizer.forcePositiveNumber(scanner);

            System.out.println("Enter Quantity:");
            int quantity = Utilizer.forcePositiveNumber(scanner);

            Fruit fruit = new Fruit(id, price, quantity, name, origin);
            fList.addFruit(fruit);

            String choice;
            System.out.println("do you want to continue Y/N");
            choice = Utilizer.getValid2Input(scanner, "Y", "N");
            if (choice.equalsIgnoreCase("n")) {
                return;
            }
        }
    }

    public void displayAllFruit() {
        System.out.println("List of Fruit:");
        System.out.println("| ++ Item ID ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |++ Amount ++");
        for (Fruit fruit : fList.getFruits()) {
            System.out.printf("|     %-5d | %-18s | %-11s | %-9s | %-14s |\n", fruit.getId(), fruit.getName(), fruit.getOrigin(), fruit.getPrice() + "$", fruit.getQuantity());
        }
    }

    public void viewOrders() {
        for (Order order : oList.getOrders()) {
            System.out.println("==============================================");
            System.out.println("Customer:" + order.getName());
            System.out.printf("| %-17s | %-15s | %-10s | %-10s |\n", "Product", "Quantity", "Price", "Amount");
            for (Fruit fruit : order.getOFruits().getFruits()) {
                int amount = fruit.getPrice() * fruit.getQuantity();
                System.out.printf("|    %-17s | %-15s | %-10s |%-10s |\n", fruit.getName(), fruit.getQuantity(), fruit.getPrice() + "$", amount + "$");
            }
        }
    }

    public void shopping() {
        Scanner scanner = new Scanner(System.in);
        FruitList temp = new FruitList();
        while (true) {
            displayAllFruit();
            System.out.println("Enter item id to choose what you want to buy");
            int choose = Utilizer.checkNumber(scanner);
            Fruit found=null;
            for (Fruit fruit : fList.getFruits()) {
                if (fruit.getId() == choose) {
                    System.out.println("Please input quantity:");
                    int quantity;
                    while (true) {
                        quantity = Utilizer.forcePositiveNumber(scanner);
                        if (quantity > fruit.getQuantity()) {
                            System.out.println("not enough quantity in stock,please input again");
                        } else {
                            break;
                        }
                    }

                    found = new Fruit(fruit.getId(), fruit.getPrice(), quantity, fruit.getName(), fruit.getOrigin());

                    boolean isExist = false;
                    for (Fruit fruitTemp : temp.getFruits()) {
                        if (fruitTemp.getId() == found.getId()) {
                            isExist = true;
                            fruitTemp.setQuantity(fruitTemp.getQuantity() + quantity);
                            break;
                        }

                    }
                    if (!isExist) {
                        temp.addFruit(found);
                    }
                    fruit.setQuantity(fruit.getQuantity() - quantity);
                    break;
                }
            }

            if (found == null) {
                System.out.println("not found");
            }

            String choice;
            System.out.println("do you want to continue ordering Y/N");
            choice = Utilizer.getValid2Input(scanner, "Y", "N");
            if (choice.equalsIgnoreCase("n")) {
                int sum = 0;
                System.out.printf("%-10s | %-8s | %-6s | %-6s\n", "Product", "Quantity", "Price", "Amount");
                for (Fruit fruitOrder : temp.getFruits()) {
                    int amount = fruitOrder.getPrice() * fruitOrder.getQuantity();
                    System.out.printf("%-8s | %-8d | %-5s | %-5s\n", fruitOrder.getName(), fruitOrder.getQuantity(), fruitOrder.getPrice() + "$", amount + "$");
                    sum += amount;
                }
                System.out.println("Total:" + sum + "$");
                System.out.println("Input your name:");
                String name = Utilizer.getNonEmptyInput(scanner);
                oList.addOrder(new Order(name, temp));
                return;
            }
        }

    }
}
