/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;

/**
 *
 * @author ASUS PC
 */
public class ReservationList {

    private ArrayList<Reservation> reservations;

    public ReservationList() {
        reservations = new ArrayList<>();
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservaation) {
        reservations.add(reservaation);
    }

    public void removeReservation(Reservation reservaation) {
        reservations.remove(reservaation);
    }

}
