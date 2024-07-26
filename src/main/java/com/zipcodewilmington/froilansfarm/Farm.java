package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farm {
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<FarmHouse> farmHouses;
    private ArrayList<Stable> stables;

    public Farm (){
        chickenCoops = new ArrayList<ChickenCoop>();
        stables = new ArrayList<Stable>();
        farmHouses = new ArrayList<FarmHouse>();
    }

    public Farm(ArrayList<ChickenCoop> ChickenCoop, ArrayList<FarmHouse> FarmHouse, ArrayList<Stable> Stable){
        this.chickenCoops = ChickenCoop;
        this.farmHouses = FarmHouse;
        this.stables = Stable;
    }

    public ArrayList<ChickenCoop> getChickenCoop() {
        return chickenCoops;
    }

    public void setChickenCoop(ArrayList<ChickenCoop> chickenCoop) {
        chickenCoops = chickenCoop;
    }

    public ArrayList<FarmHouse> getFarmHouse() {
        return farmHouses;
    }

    public void setFarmHouse(ArrayList<FarmHouse> farmHouse) {
        farmHouses = farmHouse;
    }

    public ArrayList<Stable> getStable() {
        return stables;
    }

    public void setStable(ArrayList<Stable> stable) {
        stables = stable;
    }
}


