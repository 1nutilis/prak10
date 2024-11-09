package com.Facade;

public class RestaurantSystem {
    public void bookTable(int tableNumber) {
        System.out.println("Table " + tableNumber + " booked.");
    }
    public void orderFood(String food) {
        System.out.println("Order placed for " + food);
    }
}

