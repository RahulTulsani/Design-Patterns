package org.example.StrategyPattern;

import org.example.StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

}
