package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmFactoryTest {

    @Test
    public void createStableTest(){
        Farm farm = new Farm();
        FarmFactory farmFactory = new FarmFactory();
        farmFactory.createStable();
    }

    @Test
    public void createChickenCoopTest(){
        Farm farm = new Farm();
        FarmFactory farmFactory = new FarmFactory();
        farmFactory.createChickenCoop();
    }

    @Test
    public void createCropRowTest(){
        FarmField farmField = new FarmField();
        FarmFactory farmFactory = new FarmFactory();
        farmField.add(farmFactory.createCropRow());

        Assert.assertEquals(1, farmField.size());
    }

    @Test
    public void createCropRowsTest(){
        FarmField farmField = new FarmField();
        FarmFactory farmFactory = new FarmFactory();
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());
        farmField.add(farmFactory.createCropRow());

        Assert.assertEquals(10, farmField.size());
    }

    @Test
    public void createCornStalk(){
        FarmFactory farmFactory = new FarmFactory();
        CropRow cropRow = farmFactory.createCropRow();
        cropRow.add(farmFactory.createCornStalk());

        Assert.assertEquals(1,cropRow.size());
    }

    @Test
    public void createCornStalks(){
        FarmFactory farmFactory = new FarmFactory();
        CropRow cropRow = farmFactory.createCropRow();
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());
        cropRow.add(farmFactory.createCornStalk());

        Assert.assertEquals(10,cropRow.size());
    }

    @Test
    public void createTomatoStalk(){
        FarmFactory farmFactory = new FarmFactory();
        CropRow cropRow = farmFactory.createCropRow();
        cropRow.add(farmFactory.createTomatoStalk());

        Assert.assertEquals(1, cropRow.size());
    }

    @Test
    public void createTomatoStalks(){
        FarmFactory farmFactory = new FarmFactory();
        CropRow cropRow = farmFactory.createCropRow();
        cropRow.add(farmFactory.createTomatoStalk());
        cropRow.add(farmFactory.createTomatoStalk());
        cropRow.add(farmFactory.createTomatoStalk());
        cropRow.add(farmFactory.createTomatoStalk());
        cropRow.add(farmFactory.createTomatoStalk());
        cropRow.add(farmFactory.createTomatoStalk());
        cropRow.add(farmFactory.createTomatoStalk());
        cropRow.add(farmFactory.createTomatoStalk());

        Assert.assertEquals(8, cropRow.size());
    }


    @Test
    public void createChickenEggTest(){
        FarmHouse farmHouse = new FarmHouse();
        FarmFactory farmFactory = new FarmFactory();
        farmHouse.fridge.add(farmFactory.createChickenEgg());

        Assert.assertEquals(1, farmHouse.fridge.size());
    }

    @Test
    public void createChickenEggsTest(){
        FarmHouse farmHouse = new FarmHouse();
        FarmFactory farmFactory = new FarmFactory();
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());
        farmHouse.fridge.add(farmFactory.createChickenEgg());

        Assert.assertEquals(10, farmHouse.fridge.size());
    }

    @Test
    public void createTomatoTest(){
        FarmHouse farmHouse = new FarmHouse();
        FarmFactory farmFactory = new FarmFactory();
        farmHouse.fridge.add(farmFactory.createTomato());

        Assert.assertEquals(1, farmHouse.fridge.size());
    }

    @Test
    public void createTomatoesTest(){
        FarmHouse farmHouse = new FarmHouse();
        FarmFactory farmFactory = new FarmFactory();
        farmHouse.fridge.add(farmFactory.createTomato());
        farmHouse.fridge.add(farmFactory.createTomato());
        farmHouse.fridge.add(farmFactory.createTomato());
        farmHouse.fridge.add(farmFactory.createTomato());
        farmHouse.fridge.add(farmFactory.createTomato());
        farmHouse.fridge.add(farmFactory.createTomato());
        farmHouse.fridge.add(farmFactory.createTomato());
        farmHouse.fridge.add(farmFactory.createTomato());
        farmHouse.fridge.add(farmFactory.createTomato());

        Assert.assertEquals(9, farmHouse.fridge.size());
    }

    @Test
    public void createCornTest(){
        FarmHouse farmHouse = new FarmHouse();
        FarmFactory farmFactory = new FarmFactory();
        farmHouse.fridge.add(farmFactory.createEarCorn());

        Assert.assertEquals(1, farmHouse.fridge.size());
    }

    @Test
    public void createMultipleCornTest(){
        FarmHouse farmHouse = new FarmHouse();
        FarmFactory farmFactory = new FarmFactory();
        farmHouse.fridge.add(farmFactory.createEarCorn());
        farmHouse.fridge.add(farmFactory.createEarCorn());
        farmHouse.fridge.add(farmFactory.createEarCorn());
        farmHouse.fridge.add(farmFactory.createEarCorn());
        farmHouse.fridge.add(farmFactory.createEarCorn());
        farmHouse.fridge.add(farmFactory.createEarCorn());
        farmHouse.fridge.add(farmFactory.createEarCorn());
        farmHouse.fridge.add(farmFactory.createEarCorn());
        farmHouse.fridge.add(farmFactory.createEarCorn());

        Assert.assertEquals(9, farmHouse.fridge.size());
    }
}
