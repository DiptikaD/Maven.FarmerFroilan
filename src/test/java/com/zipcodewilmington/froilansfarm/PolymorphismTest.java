package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PolymorphismTest {

    @Test
    public void TractorIsFarmVehicle(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }

    @Test
    public void CropDusterIsFarmVehicle(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }

    @Test
    public void FarmerIsPersonTest(){
        Farmer farmer = new Farmer("Froilan");
        Assert.assertTrue(farmer instanceof Person);
    }

    @Test
    public void EarCornIsProduceTest(){
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn instanceof Produce);
    }

    @Test
    public void EarCornIsCropTest(){
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn instanceof Crop);
    }

    @Test
    public void TomatoIsCropTest(){
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Crop);
    }

    @Test
    public void TomatoIsProduceTest(){
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Produce);
    }
}
