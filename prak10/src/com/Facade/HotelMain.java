package com.Facade;

public class HotelMain {
    public static void main(String[] args) {
        RoomBookingSystem roomBooking = new RoomBookingSystem();
        RestaurantSystem restaurant = new RestaurantSystem();
        EventManagementSystem eventManagement = new EventManagementSystem();
        CleaningService cleaning = new CleaningService();

        HotelFacade hotel = new HotelFacade(roomBooking, restaurant, eventManagement, cleaning);

        hotel.bookRoomWithService(101, "Pizza");
        System.out.println();
        hotel.organizeEventWithRooms("Conference", "Projector", 101);
    }
}

