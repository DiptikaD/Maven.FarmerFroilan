package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public  class FarmVehicleTest {
    @Test
    public void operateTest(){
        FarmVehicle farmVehicle = new Tractor();

        farmVehicle.operate();

        Assert.assertTrue(farmVehicle.operate());

    }

    @Test
    public void operateTest2(){
        FarmVehicle farmVehicle = new Tractor();
        farmVehicle.operate();

        Assert.assertTrue(farmVehicle.operate());
    }


    @Test
    public void makeNoiseTest(){
        FarmVehicle farmVehicle = new CropDuster();
        String makeNoise = "Crop Crop";
        farmVehicle.makeNoise();

        Assert.assertEquals(makeNoise,farmVehicle.makeNoise());
    }
    @Test
    public void makeNoiseTest2(){
        FarmVehicle farmVehicle = new Tractor();
        String makeNoise = "Bada Boom Bada Bing";
        farmVehicle.makeNoise();

        Assert.assertEquals(makeNoise,farmVehicle.makeNoise());
    }



}
