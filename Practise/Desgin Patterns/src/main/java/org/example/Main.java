package org.example;

import org.example.DecoratorPattern.CoffeeShop;
import org.example.FactoryPattern.FactoryPattern;
import org.example.OberverPattern.Store;
import org.example.StrategyPattern.SportsVehicle;
import org.example.StrategyPattern.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        callPattern(Utils.FactoryPattern);
    }

    public static void callPattern(String patternName){
        switch (patternName) {
            case Utils.StrategyPattern : strategyPatternMethod();
            break;
            case Utils.ObserverPattern : Store.runStore();
            break;
            case Utils.DecoratorPattern: CoffeeShop.orderCoffee();
            break;
            case Utils.FactoryPattern: FactoryPattern.run();
            break;
        }
    }

    public static void strategyPatternMethod(){
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}