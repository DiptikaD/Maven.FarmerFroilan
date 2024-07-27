package com.zipcodewilmington.froilansfarm;
import java.util.ArrayList;

public class FarmField extends ArrayList<CropRow> {

    public FarmField(){
    }

    public FarmField(ArrayList<CropRow> cropRows) {
        this.addAll(cropRows);
    }
}
