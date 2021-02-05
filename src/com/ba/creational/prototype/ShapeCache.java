package com.ba.creational.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<Integer,Shape> shapeMap=new Hashtable<>();

    public static Shape getShape(Integer id){
        Shape cachedShape=shapeMap.get(id);
        return (Shape) cachedShape.Clone();
    }

    public static void loadCache()
    {
        Circle circle=new Circle();
        circle.setId(1);
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle=new Rectangle();
        rectangle.setId(2);
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
