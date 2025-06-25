package org.example.FactoryPattern.component;

public class BatterySystem implements FuelSystem{
    @Override
    public void supplyFuel() {
        System.out.println("Supplying electricity from battery.");
    }
}
