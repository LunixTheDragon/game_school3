package org.example;

public class Product {
    private int id;
    private String name;
    private String label;
    private double price;

    public Product(int id, String name, double price) {
        this.id=id;
        this.name=name;
        this.price=price;
        //TODO: Doplnit konstruktor
    }

    public Product(int id, String name, String label, double price) {
        this.id=id;
        this.name=name;
        this.label=label;
        this.price=price;
        //TODO: Doplnit konstruktor
    }

    public int getId() {
        return id; //TODO: Doplnit správnou implementaci
    }

    public String getName() {
        return name; //TODO: Doplnit správnou implementaci
    }

    public double getPrice() {
        return price; //TODO: Doplnit správnou implementaci
    }
}
