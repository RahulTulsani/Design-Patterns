package org.example.FactoryPattern.factory;

import org.example.FactoryPattern.component.Engine;
import org.example.FactoryPattern.component.FuelSystem;

public interface VehicleComponentFactory {
    Engine createEngine();
    FuelSystem createFuelSystem();
}
