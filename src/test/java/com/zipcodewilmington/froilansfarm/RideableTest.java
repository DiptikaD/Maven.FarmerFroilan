package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class RideableTest {

    @Test
    public void mountHorseTest(){
        Farmer froilan = new Farmer("froilan");
        Horse horse = new Horse();
        Assert.assertTrue(horse.mount(froilan));
    }

    @Test
    public void dismountHorseTest(){
        Farmer froilan = new Farmer("Froilan");
        Horse horse = new Horse();
        Assert.assertTrue(horse.mount(froilan));
    }
}
