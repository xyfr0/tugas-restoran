package com.example;

public class Order {
    private Item[] items = new Item[100];
    private int itemCount = 0;

    public void addItem(Item item){
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else{
            System.out.println("order is full!");
        }
            
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public double calculatePrice(){
        double price = 0;
        for(Item item : items){
            if (item != null) {
                price += item.getPrice();    
            }
        }
        return price;
    }

    public void generateReceipt(){
        System.out.printf("%42s", "Rumah Makan Keluarga Selera Cinta\n");
        System.out.println("==================================================");
        System.out.println();
        for(int i = 0; i < items.length; i++){
            if (items[i] != null) {
                System.out.println(items[i].getMenu());
                System.out.println(items[i].getPrice());                    
            }
        }
        System.out.println("=================================================="); 
        System.out.printf("Total: %.2f", calculatePrice());  
    }
}
