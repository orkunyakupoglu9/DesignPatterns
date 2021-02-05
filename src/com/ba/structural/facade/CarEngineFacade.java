package com.ba.structural.facade;

//prevents complexity of code use big systems in 1-2 line codes
public class CarEngineFacade {

    private static final int DEFAULT_COOLING_TEMP = 90;
    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private CoolingController coolingController = new CoolingController();
    private CatalyticConverter catalyticConverter = new CatalyticConverter();

    public  void engineStart()
    {
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.inject();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();
        catalyticConverter.on();

    }



}
