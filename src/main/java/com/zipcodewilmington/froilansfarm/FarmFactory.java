package com.zipcodewilmington.froilansfarm;

public class FarmFactory {


    public Stable createStable(){
        return new Stable();
    }

    public ChickenCoop createChickenCoop(){
        return new ChickenCoop();
    }

    public CropRow createCropRow(){
        return new CropRow();
    }

    public CornStalk createCornStalk(){
        return new CornStalk();
    }

    public TomatoStalk createTomatoStalk(){
        return new TomatoStalk();
    }

    public PotatoStalk createPotatoStalk(){return new PotatoStalk();}

    public ChickenEgg createChickenEgg(){
        return new ChickenEgg();
    }

    public Tomato createTomato(){
        return new Tomato();
    }

    public EarCorn createEarCorn(){
        return new EarCorn();
    }

    public Potato createPotato(){return new Potato();}

}
