package com.zipcodewilmington.froilansfarm;

public abstract class FarmVehicle implements Vehicle, Noisemaker {
    public boolean operate() {

        return true;
    }

    @Override
    public String makeNoise() {
        return "";
    }
}