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
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        tractor.harvest(cornStalk.yield());
        tractor.harvest(cornStalk.yield());
        Assert.assertEquals(2, tractor.harvested.size());
    }

    @Test
    public void harvestedTomatoTest(){
        Tractor tractor = new Tractor();
        TomatoStalk tomatoStalk = new TomatoStalk();
        tomatoStalk.fertilize();
        tractor.harvest(tomatoStalk.yield());
        tractor.harvest(tomatoStalk.yield());
        Assert.assertEquals(2, tractor.harvested.size());
    }

}
