package com.ba.behavioral.template;

public class Football extends Game {


    @Override
    public void initialize() {

        System.out.println("Teams are ready in Wembley");

    }

    @Override
    public void start() {

        System.out.println("Ref started the game");

    }

    @Override
    public void end() {

        System.out.println("Ref blew the whistle");

    }
}
