package com.ba.structural.adapter;

public class SpeedAdapterImpl implements SpeedAdapter {

    private Bugatti car=new Bugatti();

    @Override
    public double getSpeed() {

        return converter(car.getSpeed());
    }

    public double converter(double mph)
    {
        return mph*1.60934;
    }



}
