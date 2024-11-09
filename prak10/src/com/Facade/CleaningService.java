package com.Facade;

public class CleaningService {
    public void scheduleCleaning(int roomNumber) {
        System.out.println("Scheduled cleaning for room " + roomNumber);
    }
    public void cleanRoom(int roomNumber) {
        System.out.println("Room " + roomNumber + " cleaned.");
    }
}

