package com.neusoft.work;

public class Vehicle {

    private String brand;

    private String color;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    private double speed;

    public Vehicle() {

    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Vehicle(String brand,String color, double speed) {
        this(brand,color);
        this.speed = speed;
    }


    public void run(){
        System.out.println(this.brand+"汽车"+this.color+"颜色在奔跑!!!!!!");
    }

}
