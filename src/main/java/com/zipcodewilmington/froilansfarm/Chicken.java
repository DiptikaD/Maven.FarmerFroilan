package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce<ChickenEgg> {

    @Override
    public String makeNoise() {
        return "CluckCluck";
    }

    @Override
    public void eat(Edible Edible) {
        stomach.add(Edible);
    }
}
