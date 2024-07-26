package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {

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
