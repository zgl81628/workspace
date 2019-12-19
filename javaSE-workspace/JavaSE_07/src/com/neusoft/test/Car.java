package com.neusoft.test;

public class Car extends Vehicle {

    private int loader;

    public Car(String brand, String color, int loader) {
        super(brand, color);
        this.loader = loader;
    }

    public void show(){
        super.run();
        this.run();
    }

    public void print(){
        this.show();
    }

    @Override
    public void run() {
        super.run();
        this.run();
    }
}
