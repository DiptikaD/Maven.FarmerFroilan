package com.zipcodewilmington.froilansfarm;

public interface Produce<T extends Edible> {
    boolean fertilize();
    boolean defertilize();
    Edible yield();
}