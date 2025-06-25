package org.example.FactoryPattern.component;

public class FuelInjection implements FuelSystem{
    @Override
    public void supplyFuel() {
        System.out.println("Injecting petrol into engine.");
    }
}
