package com.Facade;

public class EventManagementSystem {
    public void bookEventRoom(String eventName) {
        System.out.println("Event room booked for " + eventName);
    }
    public void orderEquipment(String equipment) {
        System.out.println(equipment + " ordered for the event.");
    }
}

