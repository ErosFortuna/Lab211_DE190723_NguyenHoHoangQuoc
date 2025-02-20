/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class ReservationListView {

    ReservationList list = new ReservationList();

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Reservation Management ***");
        System.out.println("1. Create new reservation");
        System.out.println("2. Update reservation");
        System.out.println("3. Delete reservation");
        System.out.println("4. Print Flight Information");
        System.out.println("5. Print all");
        System.out.println("6. Exit");
        System.out.print("You choose: ");
        int choice = Utilizer.checkNumber(scanner);
        return choice;
    }

    public void createReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Create new reservation ***");
        System.out.print("ID: ");
        String id = Utilizer.checkId(scanner);
        System.out.print("Name: ");
        String name = Utilizer.getNonEmptyInput(scanner);
        System.out.print("Phone: ");
        String phone = Utilizer.checkPhoneNumber(scanner);
        System.out.print("RoomNumbers: ");
        String room = Utilizer.checkRoomNumber(scanner);
        System.out.print("BookingDate (dd/MM/yyyy): ");
        String bookingDate = Utilizer.forceValidDateStringInput(scanner);

        System.out.print("Need airport pick up? (Y/N): ");
        String pickup = scanner.nextLine();
        FlightInformation flightInfo = new FlightInformation();
        if (pickup.equalsIgnoreCase("Y")) {
            System.out.print("Flight: ");
            String flight = scanner.nextLine();
            System.out.print("Seat: ");
            String seat = scanner.nextLine();
            System.out.print("TimePickUp (dd/MM/yyyy): ");
            String pickupTime;

            while (true) {
                pickupTime = Utilizer.forceValidDateStringInput(scanner);
                if (Utilizer.isStartBeforeEndInFuture(pickupTime, bookingDate)) {
                    break;
                } else {
                    System.out.println("Data input is invalid, date must be after pickupTime");
                }
            }

            flightInfo = new FlightInformation(flight, seat, pickupTime);
        }

        Reservation reservation = new Reservation(id, name, phone, room, bookingDate, flightInfo);
        list.addReservation(reservation);
        System.out.println("Information saved successfully.");
    }

    public void updateReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Booking ID to update: ");
        String id = scanner.nextLine();
        Reservation found = null;
        for (Reservation res : list.getReservations()) {
            if (res.getBookingID().equals(id)) {
                found = res;
                System.out.print("New Name (press enter to skip): ");
                String name = scanner.nextLine();
                if (Utilizer.checkNull(name)) {
                    res.setCustomerName(name);
                }

                System.out.print("New Phone (press enter to skip): ");
                String phone = scanner.nextLine();
                if (Utilizer.checkNull(phone)) {
                    res.setPhoneNumber(phone);
                }

                System.out.print("New Room Number (press enter to skip): ");
                String room = scanner.nextLine();
                if (Utilizer.checkNull(room)) {
                    res.setRoomNumber(room);
                }
                System.out.print("BookingDate (dd/MM/yyyy): ");
                String bookingDate = scanner.nextLine();
                if (Utilizer.checkNull(bookingDate)) {
                    res.setBookingDate(bookingDate);
                }

                System.out.print("Need airport pick up? (Y/N): ");
                String pickup = scanner.nextLine();
                FlightInformation flightInfo = res.getFlightInformation();

                if (pickup.equalsIgnoreCase("Y")) {
                    System.out.print("Flight: ");
                    String flight = scanner.nextLine();
                    if (Utilizer.checkNull(flight)) {
                        flightInfo.setFlightNumber(flight);
                    }

                    System.out.print("Seat: ");
                    String seat = scanner.nextLine();
                    if (Utilizer.checkNull(seat)) {
                        flightInfo.setSeatNumber(seat);
                    }

                    System.out.print("TimePickUp (dd/MM/yyyy): ");
                    String pickupTime;

                    while (true) {
                        pickupTime = Utilizer.forceValidDateStringInput(scanner);
                        if (Utilizer.isStartBeforeEndInFuture(pickupTime, bookingDate)) {
                            break;
                        } else {
                            System.out.println("Data input is invalid, date must be after pickupTime");
                        }
                    }

                    System.out.println("Information updated successfully.");
                    return;
                }
            }

        }
        if (found == null) {
            System.out.println("No data found");

        }
    }

    public void deleteReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Booking ID to delete: ");
        String id = scanner.nextLine();
        Reservation found = null;
        for (Reservation res : list.getReservations()) {
            if (res.getBookingID().equals(id)) {
                found = res;
                System.out.println("reservation with id: " + found.getBookingID() + " has been deleted");
            }
        }
        list.removeReservation(found);
        if (found == null) {
            System.out.println("No data found");
        }
    }

    public void printFlightInformation() {
        System.out.println("Flight Information:");
        for (Reservation res : list.getReservations()) {
            FlightInformation fi = res.getFlightInformation();
            System.out.printf("%s - %s - %s - %s - %s - %s\n", res.getBookingID(), res.getCustomerName(), res.getPhoneNumber(), fi.getFlightNumber(), fi.getSeatNumber(), fi.getTimePickUp());
        }
    }

    public void printAllReservations() {
        System.out.println("All Reservations:");
        for (Reservation res : list.getReservations()) {
            FlightInformation fi = res.getFlightInformation();
            System.out.printf("%s - %s - %s - %s - %s- %s - %s - %s\n", res.getBookingID(), res.getCustomerName(), res.getPhoneNumber(), res.getRoomNumber(), res.getBookingDate(), fi.getFlightNumber(), fi.getSeatNumber(), fi.getTimePickUp());
        }
    }

}
