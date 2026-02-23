package com.example;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addItem(new Item("Nasi Goreng Ayam", 3, 14000));
        menu.addItem(new Item("Teh Tawar", 3, 3000));
        menu.generateReceipt();
    }
}
