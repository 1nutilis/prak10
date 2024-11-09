package com.Facade;

public class HotelFacade {
    private RoomBookingSystem roomBooking;
    private RestaurantSystem restaurant;
    private EventManagementSystem eventManagement;
    private CleaningService cleaning;

    public HotelFacade(RoomBookingSystem roomBooking, RestaurantSystem restaurant,
                       EventManagementSystem eventManagement, CleaningService cleaning) {
        this.roomBooking = roomBooking;
        this.restaurant = restaurant;
        this.eventManagement = eventManagement;
        this.cleaning = cleaning;
    }

    public void bookRoomWithService(int roomNumber, String food) {
        roomBooking.bookRoom(roomNumber);
        restaurant.orderFood(food);
        cleaning.scheduleCleaning(roomNumber);
    }

    public void organizeEventWithRooms(String eventName, String equipment, int roomNumber) {
        eventManagement.bookEventRoom(eventName);
        eventManagement.orderEquipment(equipment);
        roomBooking.bookRoom(roomNumber);
    }
}

