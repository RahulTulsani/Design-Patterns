package org.example.DecoratorPattern;

public class Expresso implements Coffee{

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
