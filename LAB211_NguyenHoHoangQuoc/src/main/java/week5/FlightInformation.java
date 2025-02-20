/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author ASUS PC
 */
class FlightInformation {

    private String flightNumber;
    private String seatNumber;
    private String timePickUp;

    public FlightInformation(String flightNumber, String seatNumber, String timePickUp) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickUp = timePickUp;
    }

    public FlightInformation() {
        this.flightNumber = "";
        this.seatNumber = "";
        this.timePickUp = "";
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getTimePickUp() {
        return timePickUp;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTimePickUp(String timePickUp) {
        this.timePickUp = timePickUp;
    }

    @Override
    public String toString() {
        return flightNumber + " - " + seatNumber + " - " + timePickUp;
    }
}
