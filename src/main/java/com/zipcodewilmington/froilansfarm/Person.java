package com.zipcodewilmington.froilansfarm;

public class Person extends Animal {

    @Override
    public String makeNoise() {
        return "Hi";
    }

    @Override
    public void eat(Edible Edible) {
        stomach.add(Edible);
    }
}
