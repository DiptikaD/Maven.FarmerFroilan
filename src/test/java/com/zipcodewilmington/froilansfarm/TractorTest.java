package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TractorTest {


    @Test
    public void tractorOperateTest(){
        FarmVehicle tractor = new Tractor();
        tractor.operate();
        Assert.assertTrue(tractor.operate());
    }

    @Test
    public void makeNoiseTest(){
        Tractor tractor = new Tractor();
        String makeNoise = "Bada Boom Bada Bing";
        tractor.makeNoise();
        Assert.assertEquals(makeNoise,tractor.makeNoise());
    }

    @Test
    public void harvestedEarCornTest(){
        Tractor tractor = new Tractor();
        EarCorn earCorn = new EarCorn();
        tractor.harvest(earCorn);
        tractor.harvest(earCorn);
        Assert.assertEquals(2, tractor.harvested.size());
    }

    @Test
    public void harvestedTomatoTest(){
        Tractor tractor = new Tractor();
        Tomato tomato = new Tomato();
        tractor.harvest(tomato);
        tractor.harvest(tomato);
        Assert.assertEquals(2, tractor.harvested.size());
    }
}
