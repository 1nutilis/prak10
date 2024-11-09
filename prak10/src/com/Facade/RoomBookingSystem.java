package com.Facade;

public class RoomBookingSystem {
    public void bookRoom(int roomNumber) {
        System.out.println("Room " + roomNumber + " booked.");
    }
    public void cancelBooking(int roomNumber) {
        System.out.println("Booking for room " + roomNumber + " canceled.");
    }
}

