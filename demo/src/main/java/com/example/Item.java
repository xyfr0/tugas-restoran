package com.example;

public class Item {
    private String menu;
    private int quantity;
    private double price;

    public Item(String menu, int quantity, double price) {
        this.menu = menu;
        this.quantity = quantity;
        this.price = price;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
}