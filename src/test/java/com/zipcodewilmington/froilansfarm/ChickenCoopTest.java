package com.zipcodewilmington.froilansfarm;
import org.junit.Assert;
import org.junit.Test;


public class ChickenCoopTest {

    @Test
    public void addChickenCoop (){
        Chicken chicken = new Chicken();
        ChickenCoop coop = new ChickenCoop();
        coop.add(chicken);

        Assert.assertEquals(coop.get(0), chicken);
    }

    @Test
    public void emptyConstructorChickens(){
        ChickenCoop coop = new ChickenCoop();

        Assert.assertEquals(0, coop.size());
    }
}
