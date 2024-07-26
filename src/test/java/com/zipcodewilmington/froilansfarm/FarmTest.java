package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {

    @Test
    public void getChickenCoopTest(){
        ArrayList<ChickenCoop> listOfChickenCoops = new ArrayList<>();
        ChickenCoop newCoop = new ChickenCoop();
        listOfChickenCoops.add(newCoop);

        ChickenCoop actual = listOfChickenCoops.get(0);
        Assert.assertEquals(newCoop, actual);
    }

    @Test
    public void getChickenCoopTest2(){
        Farm farm = new Farm();
        ArrayList newCoop = new ArrayList<ChickenCoop>();

        Assert.assertEquals(farm.getChickenCoop(), newCoop);
    }

    @Test
    public void setChickenCoopTest(){
        Farm farm = new Farm();
        ArrayList newCoop = new ArrayList<ChickenCoop>();
        farm.setChickenCoop(newCoop);

        Assert.assertEquals(farm.getChickenCoop(), newCoop);
    }

    @Test
    public void setChickenCoopTest2(){
        Farm farm = new Farm();
        ArrayList newCoop = new ArrayList<ChickenCoop>();

        Assert.assertFalse(farm.getChickenCoop() == newCoop);
    }

    @Test
    public void getFarmHouseTest(){
        Farm farm = new Farm();
        ArrayList newFHouse = new ArrayList<FarmHouse>();


        Assert.assertEquals(farm.getFarmHouse(), newFHouse);
    }

    @Test
    public void setFarmHouseTest(){
        Farm farm = new Farm();
        ArrayList newFHouse = new ArrayList<FarmHouse>();
        farm.setFarmHouse(newFHouse);

        Assert.assertEquals(farm.getFarmHouse(), newFHouse);
    }

    @Test
    public void getStableTest(){
        Farm farm = new Farm();
        ArrayList newStable = new ArrayList<Stable>();

        Assert.assertEquals(farm.getStable(), newStable);
    }

    @Test
    public void setStableTest(){
        Farm farm = new Farm();
        ArrayList<Stable> newStable = new ArrayList<Stable>();
        farm.setStable(newStable);

        Assert.assertEquals(farm.getStable(), newStable);
    }

    @Test
    public void farmConstructorCoops(){
        Farm farm = new Farm();
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        ChickenCoop chickens = new ChickenCoop();
        Chicken hen = new Chicken();
        chickens.add(hen);
        chickenCoops.add(chickens);
        farm.setChickenCoop(chickenCoops);

        Assert.assertEquals(farm.getChickenCoop(), chickenCoops);
    }

    @Test
    public void farmConstructorStables(){
        Farm farm = new Farm();
        Horse horse = new Horse();
        ArrayList<Stable> stable = new ArrayList<>();
        Stable horses = new Stable();
        horses.add(horse);
        stable.add(horses);
        farm.setStable(stable);

        Assert.assertEquals(farm.getStable(), stable);

    }

    @Test
    public void farmConstructorAll(){
        ArrayList<Stable> stable = new ArrayList<>();
        Horse horse = new Horse();
        Stable horses = new Stable();
        horses.add(horse);
        stable.add(horses);

        ArrayList<ChickenCoop> coop = new ArrayList<>();
        ChickenCoop chickens= new ChickenCoop();
        Chicken chicken = new Chicken();
        chickens.add(chicken);
        coop.add(chickens);

        ArrayList<FarmHouse> farmhouse = new ArrayList<>();
        FarmHouse people = new FarmHouse();
        Person person = new Person();
        person.setName("McDonald");
        farmhouse.add(people);
        people.add(person);

        Farm farm= new Farm(coop, farmhouse, stable);
        Farm differentFarm = new Farm();

        Assert.assertFalse(farm == differentFarm);
    }
}
