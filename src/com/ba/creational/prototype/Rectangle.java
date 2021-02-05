package com.ba.creational.prototype;

public class Rectangle extends Shape {



    @Override
    void draw() {

        System.out.println("Rectangle is drawn");

    }
    public Rectangle(){
        type="rectangle";
    }


}
