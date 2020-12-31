package entities;

import java.util.Objects;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String staticUppercaseName(Product p){
        return p.getName().toUpperCase();
    }

    public String nonStaticUppercaseName(){
        return getName().toUpperCase();
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", price='" + String.format("%.2f", getPrice()) + "'" + "}";
    }

}