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

    @Test
    public void makeNoiseTest(){
        CropDuster cropDuster = new CropDuster();
        String makeNoise = "Crop Crop";
        cropDuster.makeNoise();

        Assert.assertEquals(makeNoise,cropDuster.makeNoise());
    }

    @Test
    public void fertilizedTest(){
     CropDuster cropDuster = new CropDuster() ;
     CropRow cropRow = new CropRow();

     cropDuster.fertilize(cropRow);

     Assert.assertTrue(cropDuster.fertilize(cropRow));

    }

    @Test
    public void fertilizeCropRowTest(){
        EarCorn earCorn = new EarCorn();
        CropRow cropRow = new CropRow();
        Tractor tractor = new Tractor();
        cropRow.add(earCorn);
        cropRow.add(earCorn);
        cropRow.add(earCorn);
        CropDuster cropDuster = new CropDuster();
        cropDuster.fertilize(cropRow);
        for (Crop c : cropRow){
            tractor.harvest(c);
        }
        Assert.assertEquals(3, tractor.harvested.size());
    }

    @Test
    public void defertilizeCropRowTest(){
        EarCorn earCorn = new EarCorn();
        CropRow cropRow = new CropRow();
        Tractor tractor = new Tractor();
        cropRow.add(earCorn);
        cropRow.add(earCorn);
        cropRow.add(earCorn);
        CropDuster cropDuster = new CropDuster();
        cropDuster.fertilize(cropRow);
        for (Crop c : cropRow){
            c.defertilize();
        }
        for (Crop c : cropRow){
            tractor.harvest(c);
        }
        Assert.assertEquals(0, tractor.harvested.size());
    }
}
