package org.example.FactoryPattern.component;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol engine roars to life!");
    }
}
