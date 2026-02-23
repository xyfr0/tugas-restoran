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
                i++;
            }
        }
    }

    public double calculatePrice(){
        int i = 0;
        double price = 0;
        while(items[i] != null){
            price += items[i].getPrice() * items[i].getQuantity();
            i++;
        }
        return price;
    }

    public void generateReceipt(){
        System.out.printf("%42s", "Rumah Makan Keluarga Selera Cinta\n");
        System.out.println("==================================================");
        System.out.println();
        for(int i = 0; i < items.length; i++){
            if (items[i] != null) {
                System.out.printf("%s %32.2f\n%sx%s\n", items[i].getMenu(), items[i].getQuantity() * items[i].getPrice(), items[i].getQuantity(), items[i].getPrice());                    
            }
        }
        System.out.println("==================================================");
        System.out.printf("Subtotal: %39.2f\n", calculatePrice());
        System.out.printf("Tax (5%%): %39.2f\n", calculatePrice() * 5/100);
        System.out.printf("Total: %42.2f\n", calculatePrice() + calculatePrice() * 5/100);
        
    }
}
