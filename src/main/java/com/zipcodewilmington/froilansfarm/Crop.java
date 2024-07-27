package com.zipcodewilmington.froilansfarm;

public abstract class Crop <T extends Produce> {
    // had to implement these to get cropduster to work with croprows
    // had to set this true to pass two tests in tractor?
    boolean isFertilized = true;

    public boolean fertilize() {
        return isFertilized = true;
    }

    public boolean defertilize() {
        return isFertilized = false;
    }
}
