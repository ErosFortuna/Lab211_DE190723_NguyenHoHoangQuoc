/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Date;

/**
 *
 * @author ASUS PC
 */
public class Reservation {

    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String roomNumber;
    private String bookingDate;
    private FlightInformation flightInformation;

    public Reservation(String bookingID, String customerName, String phoneNumber, String roomNumber, String bookingDate, FlightInformation flightInformation) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.flightInformation = flightInformation;
    }

    public Reservation() {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = "";
        this.bookingDate = "";
        this.flightInformation = new FlightInformation();
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }

    @Override
    public String toString() {
        return bookingID + " - " + customerName + " - " + phoneNumber + " - " + roomNumber + " - " + bookingDate + " - " + flightInformation;
    }
}
