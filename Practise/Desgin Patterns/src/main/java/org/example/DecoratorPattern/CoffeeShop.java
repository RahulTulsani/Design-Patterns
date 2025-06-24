package org.example.DecoratorPattern;

import org.example.DecoratorPattern.Decorators.CaramelDecorator;
import org.example.DecoratorPattern.Decorators.MilkDecorator;
import org.example.DecoratorPattern.Decorators.WhippedCreamDecorator;

public class CoffeeShop {

    public static void orderCoffee(){
        Coffee myCoffee = new Expresso();

        myCoffee = new MilkDecorator(myCoffee);
        myCoffee = new WhippedCreamDecorator(new CaramelDecorator(myCoffee));

        System.out.println("Order: "+myCoffee.getDescription());
        System.out.println("Total Cost: "+myCoffee.getCost());
    }

}
