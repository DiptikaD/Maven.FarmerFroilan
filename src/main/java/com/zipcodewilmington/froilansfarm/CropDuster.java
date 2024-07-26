package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements AirCraft  {


    @Override
    public String fly() {
        return "Airborne";
    }

    public Boolean fertized(Crop crop) {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Crop Crop";

    }
}
