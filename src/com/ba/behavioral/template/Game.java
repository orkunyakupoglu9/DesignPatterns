package com.ba.behavioral.template;

//the algorithm's structure will be defined in a base class that defines the template build() method:
//abstract override edilebilen methodlar bir template final override edilmez
public abstract class Game {

    public abstract void initialize();
    public abstract void start();
    public abstract void end();

    public final void play(){

        initialize();
        start();
        end();


    }



}
