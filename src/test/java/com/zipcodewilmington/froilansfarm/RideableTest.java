package com.zipcodewilmington.froilansfarm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RideableTest {
    // runs mount tests in backwards alphabetical order and rideables share the same riders list
//
//    @Before
//    public void setUp(){
//        Tractor tractor = new Tractor();
//        tractor.riders.clear();
//    }

    @Test
    public void mountHorseTest(){
        Farmer froilan = new Farmer("froilan");
        Horse horse = new Horse();
        Assert.assertTrue(horse.mount(froilan));
        horse.dismount(froilan);
    }

    @Test
    public void dismountHorseTest(){
        Farmer froilan = new Farmer("Froilan");
        Horse horse = new Horse();
        Assert.assertTrue(horse.dismount(froilan));
    }

    @Test
    public void mountHorseListTest(){
        Person froilan = new Person();
        Horse horse = new Horse();
        horse.mount(froilan);
        Assert.assertTrue(horse.riders.contains(froilan));
        horse.dismount(froilan);
    }

    @Test
    public void dismountHorseListTest(){
        Person froilan = new Person();
        Horse horse = new Horse();
        horse.mount(froilan);
        horse.dismount(froilan);
        Assert.assertFalse(horse.riders.contains(froilan));
    }

    @Test
    public void mountTractorTest(){
        Farmer froilan = new Farmer("froilan");
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor.mount(froilan));
        tractor.dismount(froilan);
    }

    @Test
    public void dismountTractorTest(){
        Farmer froilan = new Farmer("froilan");
        Tractor tractor = new Tractor();
        tractor.mount(froilan);
        Assert.assertTrue(tractor.dismount(froilan));
    }

    @Test
    public void mountTractorListTest(){
        Person froilan = new Person();
        Tractor tractor = new Tractor();
        tractor.mount(froilan);
        Assert.assertEquals(1, tractor.riders.size());
        tractor.dismount(froilan);
    }
}
