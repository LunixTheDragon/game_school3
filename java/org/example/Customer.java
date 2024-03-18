package org.example;

public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id=id;
        this.name=name;
        this.email=email;
        //TODO: Doplnit konstruktor
    }

    public int getId() {
        return id; //TODO: Doplnit správnou implementaci
    }

    public String getName() {
        return name; //TODO: Doplnit správnou implementaci
    }

    public String getEmail() {
        return email; //TODO: Doplnit správnou implementaci
    }
}
