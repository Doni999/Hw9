package com.company;

public abstract class Machine {
    int power;
    double height;
    String color;

    public Machine(int power, double height, String color){
        this.power = power;
        this.height = height;
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}