package org.example.FactoryPattern.factory;

import org.example.FactoryPattern.component.Engine;
import org.example.FactoryPattern.component.FuelInjection;
import org.example.FactoryPattern.component.FuelSystem;
import org.example.FactoryPattern.component.PetrolEngine;

public class PetrolVehicleFactory implements VehicleComponentFactory{
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public FuelSystem createFuelSystem() {
        return new FuelInjection();
    }
}
