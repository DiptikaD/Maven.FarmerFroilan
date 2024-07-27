package com.zipcodewilmington.froilansfarm;

public class FarmAnimalFactory {

    public Chicken createChicken(){
        return new Chicken();
    }

    public Horse createHorse(){
        return new Horse();
    }
}
