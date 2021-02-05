package com.ba.creational.singleton;


public class Singleton {

    public String s;
    //creating a single instance
    private static Singleton single_instance=null;

    //making default constructor private in order to create single instance
    private Singleton(){

        s=" inside of singleton class string";

    }

    public static Singleton getInstance(){

        if(single_instance==null){

            single_instance=new Singleton();

        }

        return single_instance;



    }


}
