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
    public void harvestedTest(){
        Tractor tractor = new Tractor();
        EarCorn earCorn = new EarCorn();
        Tomato tomato = new Tomato();
        tractor.harvest(earCorn);
        tractor.harvest(tomato);
        Assert.assertEquals(2, tractor.harvested.size());
    }
}
