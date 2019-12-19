package com.neusoft.Object;

import java.io.Serializable;

public class Product implements Serializable {


    private static final long serialVersionUID = 4998372478506676362L;

    private String pname;

    private float price;

    public Product(String pname, float price) {
        this.pname = pname;
        this.price = price;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
}
