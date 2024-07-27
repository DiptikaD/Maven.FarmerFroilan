package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce<ChickenEgg> {
    boolean isFertilized;
    ArrayList<ChickenEgg> fridge = new ArrayList<>();

    @Override
    public String makeNoise() {
        return "CluckCluck";
    }

    @Override
    public void eat(Edible Edible) {
        stomach.add(Edible);
    }

    @Override
    public boolean fertilize() {
        return isFertilized = true;
    }

    @Override
    public boolean defertilize() {
        return isFertilized = false;
    }

    @Override
    public ChickenEgg yield() {
        ChickenEgg chickenEgg = new ChickenEgg();
        if (isFertilized){
            fridge.add(chickenEgg);
        }
        return (isFertilized) ? chickenEgg : null;
    }
}