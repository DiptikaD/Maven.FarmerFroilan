package com.zipcodewilmington.froilansfarm;

public class TomatoStalk extends Crop implements Produce<Tomato> {
    boolean isFertilized;

    @Override
    public boolean fertilize() {
        return isFertilized = true;
    }

    @Override
    public boolean defertilize() {
        return isFertilized = false;
    }

    @Override
    public Tomato yield() {
        Tomato tomato = new Tomato();
        return (isFertilized) ? tomato : null;
    }
}
