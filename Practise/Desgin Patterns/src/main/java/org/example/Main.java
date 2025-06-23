package org.example;

import org.example.StrategyPattern.SportsVehicle;
import org.example.StrategyPattern.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        callPattern(Utils.StrategyPattern);
    }

    public static void callPattern(String patternName){
        switch (patternName){
            case Utils.StrategyPattern -> strategyPatternMethod();
        }
    }

    public static void strategyPatternMethod(){
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}