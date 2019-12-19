package com.neusoft.test;

public class Vehicle {

    private String brand;
    private String color;
    private double speed=0;

    public Vehicle() {

    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Vehicle(String brand, String color, double speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void run(){
        System.out.println("运行!!!");
    }
}
