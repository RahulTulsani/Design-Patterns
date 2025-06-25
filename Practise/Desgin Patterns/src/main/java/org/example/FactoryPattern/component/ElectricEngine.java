package org.example.FactoryPattern.component;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine is now running silently.");
    }
}
