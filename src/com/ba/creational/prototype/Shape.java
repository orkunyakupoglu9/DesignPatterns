package com.ba.creational.prototype;

//Data'nın orijinalini kullanmak zahmetliyse costsa time ve ram olarak database'den bir şey çağırmak gibi
//prototype'ı yapılarak kullanılır creational design pattern

public abstract class Shape implements Cloneable{

    private int id;
    protected String type;

    abstract void draw();

    public Object Clone()
    {

        Object clone=null;

        try{
            clone=super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
