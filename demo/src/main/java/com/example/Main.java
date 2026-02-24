package com.example;

import java.util.Scanner;

public class Main {
     static Item[] listMenu = {new Item("Nasi Goreng Ayam", 12000), new Item("Nasi Goreng Telur", 10000) , new Item("Nasi Goreng Kambing", 18000), new Item("Nasi Goreng Spesial Ayam", 15000), new Item("Nasi Goreng Spesial Kambing", 21000), new Item("Nasi Goreng Seafood", 22000)};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Order menu = new Order();
        while (true) {
            for(int i = 0; i < listMenu.length; i++){
             System.out.printf("%d. %s - %.0f\n",i+1, listMenu[i].getMenu(), listMenu[i].getPrice());               
            }
            System.out.println("0. Selesaikan Pesanan");
            choice = in.nextInt();
            if (choice == 0) {
                break;
            }
            menu.addItem(listMenu[choice-1]);
        }


        menu.generateReceipt();
        in.close();
    }
}
