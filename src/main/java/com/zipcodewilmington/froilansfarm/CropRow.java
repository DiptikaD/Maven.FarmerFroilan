package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow extends ArrayList<Crop> {
    public CropRow(){
    }

    public CropRow(ArrayList<Crop> crops) {
        this.addAll(crops);
    }

}
