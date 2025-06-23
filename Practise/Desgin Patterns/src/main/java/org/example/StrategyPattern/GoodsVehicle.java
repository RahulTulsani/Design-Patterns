package org.example.StrategyPattern;

import org.example.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
