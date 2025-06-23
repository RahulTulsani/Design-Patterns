package org.example.StrategyPattern;

import org.example.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
