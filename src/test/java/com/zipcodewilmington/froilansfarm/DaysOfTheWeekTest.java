package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DaysOfTheWeekTest {

    Farm farm;
    FarmFactory farmFactory;
    FarmAnimalFactory farmAnimalFactory;
    CropDuster cropDuster;
    Tractor tractor;
    Tractor otherTractor;
    Farmer froilan;
    Pilot froilanda;
    FarmField farmField;

    @Before
    public void generateFarm(){

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

        this.farm = farm;
        this.farmFactory = farmFactory;
        this.farmAnimalFactory = farmAnimalFactory;
        this.cropDuster = new CropDuster();
        this.tractor = new Tractor();
        this.otherTractor = new Tractor();
        this.froilan = new Farmer("Froilan");
        this.froilanda = new Pilot("Froilanda");
        this.farmField = farmField;

    }

    @Test
    public void Monday(){
        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilanda);
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

        froilan.eat(farmFactory.createEarCorn());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,froilan.stomach.size());

        froilanda.eat(farmFactory.createTomato());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createChickenEgg());
        froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,froilanda.stomach.size());

        //monday specific

        cropDuster.mount(froilanda);

        for (CropRow cropRow : farmField){
            cropDuster.fertilize(cropRow);
            for (Crop c : cropRow){
                Assert.assertTrue(c.isFertilized);
            }
        }

        cropDuster.dismount(froilanda);
    }

    @Test
    public void Tuesday(){

        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilanda);
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

        froilan.eat(farmFactory.createEarCorn());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,froilan.stomach.size());

        froilanda.eat(farmFactory.createTomato());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createChickenEgg());
        froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,froilanda.stomach.size());

        tractor.mount(froilan);

        for (CropRow cropRow : farmField){
            for (Crop c : cropRow){
                tractor.harvest(c);
            }
        }

        tractor.dismount(froilan);

        Assert.assertEquals(25, tractor.harvested.size());
    }

    @Test
    public void Wednesday(){
        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilanda);
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

        froilan.eat(farmFactory.createEarCorn());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,froilan.stomach.size());

        froilanda.eat(farmFactory.createTomato());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createChickenEgg());
        froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,froilanda.stomach.size());

    }

    @Test
    public void Thursday(){
        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilanda);
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

        froilan.eat(farmFactory.createEarCorn());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,froilan.stomach.size());

        froilanda.eat(farmFactory.createTomato());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createChickenEgg());
        froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,froilanda.stomach.size());

    }

    @Test
    public void Friday(){
        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilanda);
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

        froilan.eat(farmFactory.createEarCorn());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,froilan.stomach.size());

        froilanda.eat(farmFactory.createTomato());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createChickenEgg());
        froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,froilanda.stomach.size());

    }

    @Test
    public void Saturday(){
        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilanda);
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

        froilan.eat(farmFactory.createEarCorn());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,froilan.stomach.size());

        froilanda.eat(farmFactory.createTomato());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createChickenEgg());
        froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,froilanda.stomach.size());

    }

    @Test
    public void Sunday(){
        //each day

        for (Stable stable : farm.stables){
            for (Horse horse : stable){
                horse.mount(froilan);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilan);
                Assert.assertEquals(0, horse.riders.size());
                horse.mount(froilanda);
                Assert.assertEquals(1, horse.riders.size());
                horse.dismount(froilanda);
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

        froilan.eat(farmFactory.createEarCorn());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createTomato());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        froilan.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(8,froilan.stomach.size());

        froilanda.eat(farmFactory.createTomato());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createEarCorn());
        froilanda.eat(farmFactory.createChickenEgg());
        froilanda.eat(farmFactory.createChickenEgg());
        Assert.assertEquals(5,froilanda.stomach.size());

        froilan.plant(farmFactory.createPotatoStalk(), farmField.get(0), 1);
        froilan.plant(farmFactory.createCornStalk(), farmField.get(1), 1);
        froilan.plant(farmFactory.createTomatoStalk(), farmField.get(2),1);
        CropRow c1 = farmField.get(0);
        CropRow c2 = farmField.get(1);
        CropRow c3 = farmField.get(2);
        Assert.assertTrue(c1.get(0) instanceof PotatoStalk);
        Assert.assertTrue(c2.get(0) instanceof CornStalk);
        Assert.assertTrue(c3.get(0) instanceof TomatoStalk);
    }
}
