package com.neusoft.class09;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Product)
        {
            Product p = (Product) obj;
            if(this.name==p.name&&this.price==p.price)
            {
                return true;
            }
        }
        return false;
    }
}
