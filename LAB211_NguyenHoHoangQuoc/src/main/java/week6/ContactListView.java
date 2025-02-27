/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class ContactListView {

    ContactList list = new ContactList();

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "================ Contact program =================="
                + "\n1. Add a Contact"
                + "\n2. Display all Contact"
                + "\n3. Delete a Contact"
                + "\n4. Exit"
        );
        return Utilizer.forceNumber(scanner);
    }

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------- Add a Contact --------");

        System.out.print("Enter First Name:");
        String firstName = Utilizer.getNonEmptyInput(scanner);

        System.out.print("Enter Last Name:");
        String lastName = Utilizer.getNonEmptyInput(scanner);

        System.out.print("Enter Group:");
        String group = Utilizer.getNonEmptyInput(scanner);

        System.out.print("Enter Address:");
        String address = Utilizer.getNonEmptyInput(scanner);

        System.out.print("Enter Phone:");
        String phone = Utilizer.checkPhoneNumberComplicated(scanner);

        int id = 1;
        if (!list.getContacts().isEmpty()) {
            boolean found = false;
            for (int i = 1; i <= list.getContacts().size(); i++) {
                boolean exists = false;
                for (Contact contact : list.getContacts()) {
                    if (contact.getId() == i) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    id = i;
                    found = true;
                    break;
                }
            }
            if (!found) {
                id = list.getContacts().size() + 1;
            }
        }

        Contact contact = new Contact(id, group, address, phone, lastName, firstName);
        list.addContact(contact);

    }

    public void displayAllContact() {
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        System.out.printf("%-3s %-15s %-10s %-10s %-10s %-15s %-12s%n",
                "ID", "Full Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (Contact contact : list.getContacts()) {
            System.out.printf("%-3d %-15s %-10s %-10s %-10s %-15s %-12s%n",
                    contact.getId(), contact.getFullName(), contact.getFirstName(),
                    contact.getLastName(), contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    public void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------- Delete a Contact -------");
        System.out.println("Enter ID:");
        int id = Utilizer.forceNumber(scanner);
        boolean check = false;
        for (Contact contact : list.getContacts()) {
            if (contact.getId() == id) {
                list.removeContact(contact);
                System.out.println("Successful");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("not found");
        }
    }

}
