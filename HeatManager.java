package com.company;

public abstract class HeatManager {
    protected int power;
    protected double maxTemp;

    public HeatManager(int power, double maxTemp) {
        this.power = power;
        this.maxTemp = maxTemp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }
}