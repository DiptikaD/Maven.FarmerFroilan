package com.zipcodewilmington.froilansfarm;

public abstract class FarmVehicle implements Vehicle {
    public boolean operate() {

        return true;
    }

    public String makeNoise() {
        return "I'm farming";
    }
}
