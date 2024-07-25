package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Eater {

    public Horse() {
        super();
    }

    @Override
    public void eat(Edible Edible) {
        stomach.add(Edible);
    }
}
