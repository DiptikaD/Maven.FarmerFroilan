package com.zipcodewilmington.froilansfarm;

import org.junit.Before;

public class DaysOfTheWeekTest {

    @Before
    public void setUp(){
        Farmer Froilan = new Farmer("Froilan");
        Pilot Froilanda = new Pilot("Froilanda");

        Farm farm = new Farm();
        FarmField farmField = new FarmField();
        FarmFactory farmFactory = new FarmFactory();
        FarmAnimalFactory farmAnimalFactory = new FarmAnimalFactory();

        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());

        for (CropRow cropRow : farmField){
            cropRow.add(farmFactory.createCornStalk());
            cropRow.add(farmFactory.createTomatoStalk());
            cropRow.add(farmFactory.createCornStalk());
            cropRow.add(farmFactory.createCornStalk());
            cropRow.add(farmFactory.createCornStalk());
        }

        farm.chickenCoops.add(farmFactory.createChickenCoop());
        farm.chickenCoops.add(farmFactory.createChickenCoop());
        farm.chickenCoops.add(farmFactory.createChickenCoop());
        farm.chickenCoops.add(farmFactory.createChickenCoop());

        for (ChickenCoop chickenCoop : farm.chickenCoops){
            chickenCoop.add(farmAnimalFactory.createChicken());
            chickenCoop.add(farmAnimalFactory.createChicken());
            chickenCoop.add(farmAnimalFactory.createChicken());
            chickenCoop.add(farmAnimalFactory.createChicken());
        }

        farm.chickenCoops.get(0).remove(0);

        farm.stables.add(farmFactory.createStable());
        farm.stables.add(farmFactory.createStable());
        farm.stables.add(farmFactory.createStable());

        for(Stable stable : farm.stables){
            stable.add(farmAnimalFactory.createHorse());
            stable.add(farmAnimalFactory.createHorse());
            stable.add(farmAnimalFactory.createHorse());
        }

        farm.stables.get(0).add(farmAnimalFactory.createHorse());

        FarmVehicle tractor = new Tractor();
        FarmVehicle theOtherTractor = new Tractor();
        FarmVehicle cropDuster = new CropDuster();
    }
}
