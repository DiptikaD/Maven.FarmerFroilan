package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public abstract class Animal implements Noisemaker, Eater{

    ArrayList<Edible> stomach = new ArrayList<>();

   public Animal(ArrayList<Edible> stomach){
       this.stomach = stomach;
   }

    public Animal() {
    }

    public ArrayList<Edible> getStomachContents() {
        return stomach;
    }

    public void setStomach(ArrayList<Edible> stomach) {
        this.stomach = stomach;
    }

}
