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
