package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PolymorphismTest {

    @Test
    public void CornStalkIsProduce(){
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Produce);
    }

    @Test
    public void CornStalkIsCrop(){
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }

    @Test
    public void TomatoStalkIsCrop(){
        TomatoStalk tomatoStalk = new TomatoStalk();
        Assert.assertTrue(tomatoStalk instanceof Crop);
    }

    @Test
    public void TomatoStalkIsProduce(){
        TomatoStalk tomatoStalk = new TomatoStalk();
        Assert.assertTrue(tomatoStalk instanceof Produce);
    }

    @Test
    public void ChickenEggIsEdible(){
        ChickenEgg chickenEgg = new ChickenEgg();
        Assert.assertTrue(chickenEgg instanceof Edible);
    }

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
}
