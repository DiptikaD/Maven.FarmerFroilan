package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void farmerNameTest(){
        Farmer farmer = new Farmer("Goofy");
        String expected = "Goofy";

        Assert.assertEquals(expected , farmer.getName());

    }

    @Test
    public void farmerPlantCrops(){
        Farmer farmer = new Farmer("Donald");
        TomatoStalk tomato = new TomatoStalk();
        CropRow cropRow = new CropRow();
        cropRow.add(tomato);
        cropRow.add(tomato);
        cropRow.add(tomato);


        Assert.assertTrue(farmer.plant(tomato, cropRow));

    }
}
