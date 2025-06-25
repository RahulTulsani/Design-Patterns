package org.example.FactoryPattern.factory;

import org.example.FactoryPattern.component.BatterySystem;
import org.example.FactoryPattern.component.ElectricEngine;
import org.example.FactoryPattern.component.Engine;
import org.example.FactoryPattern.component.FuelSystem;

public class ElectricVehicleFactory implements VehicleComponentFactory{
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public FuelSystem createFuelSystem() {
        return new BatterySystem();
    }
}
