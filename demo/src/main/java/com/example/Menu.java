package com.example;

public class Menu {
    Item[] items = new Item[100];

    public void addItem(Item item){
        int i = 0;
        while (true) {
            if (items[i] == null) {
                items[i] = item;
                i++;
                break;                
            } else{
                if (items[i].getMenu() == item.getMenu()) {
                    items[i].setQuantity(items[i].getQuantity() + item.getQuantity());
                }
            }
        }
    }

    public double calculatePrice(){
        int i = 0;
        double price = 0;
        while(items[i] != null){
            price += items[i].getPrice();
            i++;
        }
        return price;
    }

    public void generateReceipt(){
        System.out.println("==================================================");
        System.out.printf("%42s", "Rumah Makan Keluarga Selera Cinta\n");
        System.out.println("==================================================");
        for(int i = 0; i < items.length; i++){
            
        }
    }
}
