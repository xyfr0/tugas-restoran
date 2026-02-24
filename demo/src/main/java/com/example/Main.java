package com.example;

import java.util.Scanner;

public class Main {
     static Item[] listMenu = {new Item("Nasi Goreng Ayam", 12000), new Item("Nasi Goreng Telur", 10000) , new Item("Nasi Goreng Kambing", 18000), new Item("Nasi Goreng Spesial Ayam", 15000), new Item("Nasi Goreng Spesial Kambing", 21000), new Item("Nasi Goreng Seafood", 22000)};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 999;
        Order order = new Order();

        order.addItem(listMenu[0]);

        for(int i = 0; i <= order.getItems().length; i++){
            for(int ii = 0; ii < listMenu.length; ii++){
             System.out.printf("%d. %s - %.0f\n",ii+1, listMenu[ii].getMenu(), listMenu[ii].getPrice());               
            }
            System.out.println("0. Selesaikan Pesanan");
            System.out.println("Pilih sesuai pesanan:");
                choice = in.nextInt();
                if (choice > 0 && choice < listMenu.length) {
                    order.addItem(listMenu[choice-1]);
                } else if(choice == 0){
                    order.generateReceipt();
                    break;
                } else{
                    System.out.println("input tidak valid");
                }
        }
       in.close();     
    }
}


 