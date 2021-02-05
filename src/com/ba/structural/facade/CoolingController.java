package com.ba.structural.facade;

public class CoolingController {

    private double temperatureUpperLimit;

    public double getTemperatureUpperLimit() {
        return temperatureUpperLimit;
    }

    public void setTemperatureUpperLimit(double temperatureUpperLimit) {
        this.temperatureUpperLimit = temperatureUpperLimit;
    }

    public void run()
    {
        System.out.println("Cooling running");
    }
}
