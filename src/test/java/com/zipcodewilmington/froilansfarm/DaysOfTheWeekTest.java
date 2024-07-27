package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DaysOfTheWeekTest {

    @Test
    public void Monday(){
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

        Tractor tractor = new Tractor();
        Tractor theOtherTractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(Froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(Froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilanda);
                Assert.assertEquals(0, horse.riders.size());
            }
        }

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                Assert.assertEquals(3,horse.stomach.size());
            }
        }

        Froilan.eat(farmFactory.createEarCorn());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,Froilan.stomach.size());

        Froilanda.eat(farmFactory.createTomato());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createChickenEgg());
        Froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,Froilanda.stomach.size());

        //monday specific

        cropDuster.mount(Froilanda);

        for (CropRow cropRow : farmField){
            cropDuster.fertilize(cropRow);
            for (Crop c : cropRow){
                Assert.assertTrue(c.isFertilized);
            }
        }

        cropDuster.dismount(Froilanda);
    }

    @Test
    public void Tuesday(){
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

        Tractor tractor = new Tractor();
        Tractor theOtherTractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(Froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(Froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilanda);
                Assert.assertEquals(0, horse.riders.size());
            }
        }

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                Assert.assertEquals(3,horse.stomach.size());
            }
        }

        Froilan.eat(farmFactory.createEarCorn());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,Froilan.stomach.size());

        Froilanda.eat(farmFactory.createTomato());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createChickenEgg());
        Froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,Froilanda.stomach.size());

        tractor.mount(Froilan);

        for (CropRow cropRow : farmField){
            for (Crop c : cropRow){
                tractor.harvest(c);
            }
        }

        tractor.dismount(Froilan);

        Assert.assertEquals(25, tractor.harvested.size());
    }

    @Test
    public void Wednesday(){
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

        Tractor tractor = new Tractor();
        Tractor theOtherTractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(Froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(Froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilanda);
                Assert.assertEquals(0, horse.riders.size());
            }
        }

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                Assert.assertEquals(3,horse.stomach.size());
            }
        }

        Froilan.eat(farmFactory.createEarCorn());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,Froilan.stomach.size());

        Froilanda.eat(farmFactory.createTomato());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createChickenEgg());
        Froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,Froilanda.stomach.size());

    }

    @Test
    public void Thursday(){
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

        Tractor tractor = new Tractor();
        Tractor theOtherTractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(Froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(Froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilanda);
                Assert.assertEquals(0, horse.riders.size());
            }
        }

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                Assert.assertEquals(3,horse.stomach.size());
            }
        }

        Froilan.eat(farmFactory.createEarCorn());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,Froilan.stomach.size());

        Froilanda.eat(farmFactory.createTomato());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createChickenEgg());
        Froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,Froilanda.stomach.size());

    }

    @Test
    public void Friday(){
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

        Tractor tractor = new Tractor();
        Tractor theOtherTractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(Froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(Froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilanda);
                Assert.assertEquals(0, horse.riders.size());
            }
        }

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                Assert.assertEquals(3,horse.stomach.size());
            }
        }

        Froilan.eat(farmFactory.createEarCorn());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,Froilan.stomach.size());

        Froilanda.eat(farmFactory.createTomato());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createChickenEgg());
        Froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,Froilanda.stomach.size());

    }

    @Test
    public void Saturday(){
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

        Tractor tractor = new Tractor();
        Tractor theOtherTractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(Froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(Froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilanda);
                Assert.assertEquals(0, horse.riders.size());
            }
        }

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                Assert.assertEquals(3,horse.stomach.size());
            }
        }

        Froilan.eat(farmFactory.createEarCorn());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,Froilan.stomach.size());

        Froilanda.eat(farmFactory.createTomato());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createChickenEgg());
        Froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,Froilanda.stomach.size());

    }

    @Test
    public void Sunday(){
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
            cropRow.add(farmFactory.createTomatoStalk());
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

        Tractor tractor = new Tractor();
        Tractor theOtherTractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(Froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(Froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(Froilanda);
                Assert.assertEquals(0, horse.riders.size());
            }
        }

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                horse.eat(farmFactory.createEarCorn());
                Assert.assertEquals(3,horse.stomach.size());
            }
        }

        Froilan.eat(farmFactory.createEarCorn());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createTomato());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,Froilan.stomach.size());

        Froilanda.eat(farmFactory.createTomato());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createEarCorn());
        Froilanda.eat(farmFactory.createChickenEgg());
        Froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,Froilanda.stomach.size());

        for (CropRow cropRow : farmField){
            Froilan.plant(farmFactory.createCornStalk(), cropRow);
            for (Crop c : cropRow){
                Assert.assertTrue(c instanceof CornStalk);
            }
        }


    }
}
