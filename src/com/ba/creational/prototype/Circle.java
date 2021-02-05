package com.ba.creational.prototype;

public class Circle extends Shape {


    @Override
    void draw() {

        System.out.println("Circle is drawn");

    }

    public Circle(){
        type="circle";
    }
}
