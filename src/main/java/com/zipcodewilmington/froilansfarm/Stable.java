package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Stable extends ArrayList<Horse> {
    private ArrayList<Horse> horses;

    public Stable(){
        this.horses = new ArrayList<Horse>();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public boolean add(Horse horse){
        horses.add(horse);
        return true;
    }
}
