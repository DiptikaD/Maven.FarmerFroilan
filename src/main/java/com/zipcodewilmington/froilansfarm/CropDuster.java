package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements AirCraft  {


    @Override
    public String fly() {
        return "Airborne";
    }

    public Boolean fertized(CropRow crop) {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Crop Crop";

    }

    @Override
    public boolean mount(Person person) {
        return true;
    }

    @Override
    public boolean dismount(Person person) {
        return true;
    }
}
