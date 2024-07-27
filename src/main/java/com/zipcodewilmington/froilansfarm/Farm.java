package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farm {
    ArrayList<ChickenCoop> chickenCoops;
    ArrayList<FarmHouse> farmHouses;
    ArrayList<Stable> stables;

    public Farm (){
        this.chickenCoops = new ArrayList<ChickenCoop>();
        this.stables = new ArrayList<Stable>();
        this.farmHouses = new ArrayList<FarmHouse>();
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


