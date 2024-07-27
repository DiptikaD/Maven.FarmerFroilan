package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmAnimalFactoryTest {

    @Test
    public void createChickenTest(){
        FarmAnimalFactory farmAnimalFactory = new FarmAnimalFactory();
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(farmAnimalFactory.createChicken());

        Assert.assertEquals(1,chickenCoop.size());
    }

    @Test
    public void createMultipleChickensTest(){
        FarmAnimalFactory farmAnimalFactory = new FarmAnimalFactory();
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());
        chickenCoop.add(farmAnimalFactory.createChicken());

        Assert.assertEquals(11,chickenCoop.size());
    }

    @Test
    public void createHorseTest(){
        FarmAnimalFactory farmAnimalFactory = new FarmAnimalFactory();
        Stable stable = new Stable();
        stable.add(farmAnimalFactory.createHorse());

        Assert.assertEquals(1,stable.size());
    }

    @Test
    public void createMultipleHorsesTest(){
        FarmAnimalFactory farmAnimalFactory = new FarmAnimalFactory();
        Stable stable = new Stable();
        stable.add(farmAnimalFactory.createHorse());
        stable.add(farmAnimalFactory.createHorse());
        stable.add(farmAnimalFactory.createHorse());
        stable.add(farmAnimalFactory.createHorse());
        stable.add(farmAnimalFactory.createHorse());
        stable.add(farmAnimalFactory.createHorse());
        stable.add(farmAnimalFactory.createHorse());
        stable.add(farmAnimalFactory.createHorse());
        stable.add(farmAnimalFactory.createHorse());

        Assert.assertEquals(9,stable.size());
    }
}
