package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Horse extends Animal implements Eater, Noisemaker, Rideable{

    public Horse() {
        super();
    }

    public Horse(ArrayList<Edible> stomach) {
        super(stomach);
    }

    @Override
    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public void eat(Edible Edible) {
        stomach.add(Edible);
    }

    @Override
    public boolean mount(Rider Rider) {
        riders.add(Rider);
        return true;
    }

    @Override
    public boolean dismount(Rider Rider) {
        riders.remove(Rider);
        return true;
    }
}
