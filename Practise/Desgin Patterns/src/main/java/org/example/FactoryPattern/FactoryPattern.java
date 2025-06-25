package org.example.FactoryPattern;

import org.example.FactoryPattern.component.Engine;
import org.example.FactoryPattern.component.FuelSystem;
import org.example.FactoryPattern.factory.ElectricVehicleFactory;
import org.example.FactoryPattern.factory.PetrolVehicleFactory;
import org.example.FactoryPattern.factory.VehicleComponentFactory;

public class FactoryPattern {

    public static void run(){
        VehicleComponentFactory factory = getFactory("electric");
        Engine engine = factory.createEngine();
        FuelSystem fuelSystem = factory.createFuelSystem();

        engine.start();
        fuelSystem.supplyFuel();
    }

    private static VehicleComponentFactory getFactory(String type){
        return switch (type.toLowerCase()){
            case "electric" -> new ElectricVehicleFactory();
            case "petrol" -> new PetrolVehicleFactory();
            default -> throw new IllegalArgumentException("Unknown vehicle type: "+type);
        };
    }

}
