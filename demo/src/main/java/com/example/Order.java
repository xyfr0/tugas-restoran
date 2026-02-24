package com.example;

public class Order {
    Item[] items = new Item[100];

    public void addItem(Item item){
        int i = 0;
        while (true) {
            if (items[i] == null) {
                items[i] = item;
                i++;
                break;                
            }
        }
    }

    public double calculatePrice(){
        int i = 0;
        double price = 0;
        while(items[i] != null){
            price += items[i].getPrice();
        }
        return price;
    }

    public void generateReceipt(){
        System.out.printf("%42s", "Rumah Makan Keluarga Selera Cinta\n");
        System.out.println("==================================================");
        System.out.println();
        for(int i = 0; i < items.length; i++){
            if (items[i] != null) {
                System.out.printf("%s\n%.2f\n", items[i].getMenu(), items[i].getPrice());                    
            }
        }
        System.out.println("==================================================");
        System.out.printf("Subtotal: %39.2f\n", calculatePrice());
        System.out.printf("Tax (5%%): %39.2f\n", calculatePrice() * 5/100);
        System.out.printf("Total: %42.2f\n", calculatePrice() + calculatePrice() * 5/100);
        
    }
}
