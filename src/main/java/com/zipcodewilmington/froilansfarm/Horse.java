package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Eater, Noisemaker {

    public Horse() {
        super();
    }

    @Override
    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public void eat(Edible Edible) {
        stomach.add(Edible);
    }
}
