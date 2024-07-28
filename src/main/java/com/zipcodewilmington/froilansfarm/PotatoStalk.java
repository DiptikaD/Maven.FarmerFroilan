package com.zipcodewilmington.froilansfarm;

public class PotatoStalk extends Crop implements Produce<Potato>{
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
    public Potato yield() {
        Potato potato = new Potato();
        return (isFertilized) ? potato : null;
    }
}
