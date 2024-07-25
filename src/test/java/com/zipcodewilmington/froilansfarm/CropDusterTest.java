package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {



    @Test
    public void operateTest(){
        FarmVehicle cropDuster = new CropDuster();

        cropDuster.operate();

        Assert.assertTrue(cropDuster.operate());

    }

    @Test
    public void flyTest(){
        AirCraft cropDuster = new CropDuster();
        String flying =  "Airborne";
        cropDuster.fly();

        Assert.assertEquals(flying,cropDuster.fly());

    }

//    @Test
//    public void makeNoiseTest(){
//        CropDuster cropDuster = new CropDuster();
//        String makeNoise = "Crop Crop";
//        cropDuster.makeNoise();
//
//        Assert.assertEquals(makeNoise,);
//    }

//    @Test
//    public void fertilizedTest(){
//     CropDuster cropDuster = new CropDuster() ;
//     Crop crop = new Crop();
//
//     cropDuster.fertized(crop);
//
//     Assert.assertTrue(cropDuster.fertized(crop));
//
//    }




}
