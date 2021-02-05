package com.ba.behavioral.template;

public class Basketball extends Game {

    @Override
    public void initialize() {

        System.out.println("Teams are ready in Staples Center");

    }

    @Override
    public void start() {

        System.out.println("Game started");

    }

    @Override
    public void end() {

        System.out.println("Time is up end of the game");

    }
}
