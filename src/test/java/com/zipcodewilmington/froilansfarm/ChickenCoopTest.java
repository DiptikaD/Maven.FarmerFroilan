package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenCoopTest {

    @Test
    public void addChickenCoop (){
        Chicken chicken = new Chicken();
        ChickenCoop coop = new ChickenCoop();
        ArrayList<Chicken> expected = new ArrayList<>();
        expected.add(chicken);
        coop.add(chicken);
        Assert.assertEquals(expected, coop.getChickens());
    }

    @Test
    public void setChickens(){
        ChickenCoop coop = new ChickenCoop();
        ArrayList<Chicken> expected = new ArrayList<>();
        coop.setChickens(expected);
        Assert.assertEquals(expected, coop.getChickens());
    }
}
