package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    @Test
    public void setAndGetChickenCoopTest(){
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(new Chicken());
        Farm farm = new Farm();
        farm.setChickenCoop(chickenCoop);

        ChickenCoop actual = farm.getChickenCoop();
        Assert.assertEquals(chickenCoop, actual);
    }


    @Test
    public void getAndSetFarmHouseTest(){
        Farm farm = new Farm();
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(new Person());
        farm.setFarmHouse(farmHouse);

        FarmHouse actual = farm.getFarmHouse();

        Assert.assertEquals(farmHouse, actual);
    }

    @Test
    public void getAndSetStableTest(){
        Farm farm = new Farm();
        Stable stable = new Stable();
        stable.add(new Horse());
        farm.setStable(stable);
        Stable actual = farm.getStable();

        Assert.assertEquals(stable, actual);
    }


    @Test
    public void farmEmptyConstructorCoops(){
        Farm farm = new Farm();

        Assert.assertEquals(farm.getChickenCoop().size(), 0);
        Assert.assertEquals(farm.getStable().size(), 0);
        Assert.assertEquals(farm.getFarmHouse().size(), 0);
    }

    @Test
    public void farmConstructorStables(){
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(new Chicken());

        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(new Person());

        Stable stable = new Stable();
        stable.add(new Horse());

        Farm farm = new Farm(chickenCoop, farmHouse, stable);

        Assert.assertEquals(farm.getChickenCoop().size(), 1);
        Assert.assertEquals(farm.getStable().size(), 1);
        Assert.assertEquals(farm.getFarmHouse().size(), 1);

    }

    @Test
    public void farmConstructorAll(){
        Horse horse = new Horse();
        Stable stable = new Stable();
        stable.add(horse);

        ChickenCoop chickens= new ChickenCoop();
        Chicken chicken = new Chicken();
        chickens.add(chicken);

        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person();
        person.setName("McDonald");
        farmHouse.add(person);

        Farm farm= new Farm(chickens, farmHouse, stable);
        Farm differentFarm = new Farm();

        Assert.assertFalse(farm == differentFarm);
    }
}
