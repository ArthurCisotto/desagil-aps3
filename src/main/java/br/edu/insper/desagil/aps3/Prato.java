package br.edu.insper.desagil.aps3;

public class Prato {
    private int id;
    private String name;
    private double price;


    public Prato(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
