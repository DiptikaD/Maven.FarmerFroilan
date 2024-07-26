package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ProduceTest {

    @Test
    public void CornStalkTest(){
        Crop cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }

    @Test
    public void TomatoStalkTest(){
        Crop tstalk = new TomatoStalk();
        Assert.assertTrue(tstalk instanceof Crop);
    }

    @Test
    public void TomatoTest(){
        Edible tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Produce);
    }

    @Test
    public void EarCornTest(){
        Edible corn = new EarCorn();
        Assert.assertTrue(corn instanceof Produce);
    }
}
