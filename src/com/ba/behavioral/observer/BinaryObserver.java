package com.ba.behavioral.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Observable observable) {

        this.observable=observable;
        this.observable.attach(this);

    }

    @Override
    public void update() {

        System.out.println("Binary version is "+Integer.toBinaryString(observable.getState()));

    }
}
