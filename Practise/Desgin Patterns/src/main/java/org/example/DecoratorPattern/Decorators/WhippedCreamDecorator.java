package org.example.DecoratorPattern.Decorators;

import org.example.DecoratorPattern.Coffee;

public class WhippedCreamDecorator extends  CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Wipped Cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 25;
    }
}
