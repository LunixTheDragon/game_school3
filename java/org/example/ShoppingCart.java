package org.example;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private HashMap<Product, Integer>items;
    //TODO: Doplnit atributy
    public ShoppingCart(){
        this.items=new HashMap<>();
    }
        public void addItem(Product product, int quantity) {
        items.put(product, quantity);
        if (quantity==0){
            throw new RuntimeException();
        }
        //TODO: Doplnit metodu
    }

    public void removeItem(Product product) {
        items.remove(product);
        //TODO: Doplnit metodu
    }

    public double getTotalPrice() {
        double value=0;
        for(Map.Entry<Product, Integer> entry:items.entrySet()){
            Product product=entry.getKey();
            int quantity=entry.getValue();
            value+=product.getPrice()*quantity;
        }
        return value;
    }
}