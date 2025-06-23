package org.example.StrategyPattern.Strategy;

public class NormalDriveStrategy implements  DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
