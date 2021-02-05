package com.ba.behavioral.observer;

public class HexaObserver extends Observer {

    public HexaObserver(Observable observable) {

        this.observable=observable;
        this.observable.attach(this);

    }


    @Override
    public void update() {

        System.out.println("Hex version is "+Integer.toHexString(observable.getState()));

    }
}
