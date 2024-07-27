package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farm {
    private ChickenCoop chickenCoops;
    private FarmHouse farmHouses;
    private Stable stables;

    public Farm (){
        chickenCoops = new ChickenCoop();
        stables = new Stable();
        farmHouses = new FarmHouse();
    }

    public Farm(ChickenCoop chickenCoop, FarmHouse farmHouse, Stable stable){
        this.chickenCoops = chickenCoop;
        this.farmHouses = farmHouse;
        this.stables = stable;
    }

    public ChickenCoop getChickenCoop() {
        return chickenCoops;
    }

    public void setChickenCoop(ChickenCoop chickenCoop) {
        chickenCoops = chickenCoop;
    }

    public FarmHouse getFarmHouse() {
        return farmHouses;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        farmHouses = farmHouse;
    }

    public Stable getStable() {
        return stables;
    }

    public void setStable(Stable stable) {
        stables = stable;
    }
}


