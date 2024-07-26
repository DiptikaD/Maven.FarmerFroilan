package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Tractor extends FarmVehicle {
    ArrayList<Crop> harvested = new ArrayList<>();

    public void harvest(Crop crop){
        harvested.add(crop);
    }

    @Override
    public String makeNoise() {
        return "Bada Boom Bada Bing";
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
