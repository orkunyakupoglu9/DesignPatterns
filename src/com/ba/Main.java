package com.ba;

import com.ba.behavioral.observer.BinaryObserver;
import com.ba.behavioral.observer.HexaObserver;
import com.ba.behavioral.observer.Observable;
import com.ba.behavioral.strategy.Context;
import com.ba.behavioral.strategy.OperationAdd;
import com.ba.behavioral.strategy.OperationMultiply;
import com.ba.behavioral.strategy.OperationSubstract;
import com.ba.behavioral.template.Basketball;
import com.ba.behavioral.template.Football;
import com.ba.behavioral.template.Game;
import com.ba.creational.factorymethod.Shape;
import com.ba.creational.factorymethod.ShapeFactory;
import com.ba.creational.prototype.ShapeCache;
import com.ba.creational.singleton.Singleton;
import com.ba.structural.adapter.Bugatti;
import com.ba.structural.adapter.Speed;
import com.ba.structural.adapter.SpeedAdapter;
import com.ba.structural.adapter.SpeedAdapterImpl;
import com.ba.structural.facade.CarEngineFacade;

public class Main {

    public static void main(String[] args) {


        //prototype
        ShapeCache.loadCache();
        System.out.println(ShapeCache.getShape(1).getType());
        System.out.println(ShapeCache.getShape(2).getType());

        //singleton
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();

        System.out.println(s1.s.toUpperCase());
        System.out.println(s2.s);

        //factory method dependency inversion?
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape= shapeFactory.getShape("rectangle");
        Shape shape2= shapeFactory.getShape("square");
        shape.draw();
        shape2.draw();

        // adapter design pattern interface segregation?
        Speed bugatti=new Bugatti();
        SpeedAdapter bugattiAdapter=new SpeedAdapterImpl();

        System.out.println(bugatti.getSpeed());
        System.out.println(bugattiAdapter.getSpeed());

        //facade
        CarEngineFacade carEngineFacade=new CarEngineFacade();
        carEngineFacade.engineStart();

        //observer
        System.out.println("***********************************");
        Observable observable=new Observable();
        new HexaObserver(observable);
        new BinaryObserver(observable);

        System.out.println("First state change: 15");
        observable.setState(15);
        observable.notifyAllObservers();
        System.out.println("**********************");
        System.out.println("Second state change: 10");
        observable.setState(10);
        observable.notifyAllObservers();

        //strategy method
        System.out.println("***********************************");

        Context context = new Context(new OperationAdd());
        System.out.println("20 + 3 = " + context.executeStrategy(20, 3));

        context = new Context(new OperationSubstract());
        System.out.println("20 - 3 = " + context.executeStrategy(20, 3));

        context = new Context(new OperationMultiply());
        System.out.println("20 * 3 = " + context.executeStrategy(20, 3));


        //template method
        System.out.println("***********************************");

        Game football=new Football();

        Game basketball=new Basketball();

        football.play();
        System.out.println("***********************************" +
                "           *********************************" +
                "              ****************************" +
                "                   ***************");
        basketball.play();











    }
}
