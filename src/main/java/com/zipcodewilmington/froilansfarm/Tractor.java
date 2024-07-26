package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Tractor extends FarmVehicle implements Rideable {
    ArrayList<Crop> harvested = new ArrayList<>();

    public void harvest(Crop crop){
        if (crop != null) {
            harvested.add(crop);
        }
    }

    @Override
    public String makeNoise() {
        return "Bada Boom Bada Bing";
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
