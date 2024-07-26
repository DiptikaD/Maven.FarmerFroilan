package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop extends ArrayList<Chicken> {
    private ArrayList<Chicken> chickens;

    public ChickenCoop(){
        this.chickens = new ArrayList<Chicken>();
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public boolean add(Chicken chicken){
        chickens.add(chicken);
        return true;
    }


}
