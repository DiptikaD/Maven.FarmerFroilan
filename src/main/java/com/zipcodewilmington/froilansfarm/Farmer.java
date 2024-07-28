package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist {
    public Farmer(String name) {
        super(name);
    }

    @Override
    public Boolean plant(Crop crop, CropRow cropRow, int amountOfRows) {
        for (int i = 0; i < amountOfRows; i++){
            cropRow.set(i, crop);
        }
        return true;
    }
}
