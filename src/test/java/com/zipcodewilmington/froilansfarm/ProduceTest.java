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
    public void PotatoStalkTest(){
        Crop pstalk = new PotatoStalk();
        Assert.assertTrue(pstalk instanceof Crop);
    }

    @Test
    public void NoYieldTomatoTest(){
        Tractor tractor = new Tractor();
        TomatoStalk tomatoStalk = new TomatoStalk();
        tomatoStalk.fertilize();
        tomatoStalk.defertilize();
        tractor.harvest(tomatoStalk.yield());
        Assert.assertEquals(0,tractor.harvested.size());
    }

    @Test
    public void YieldTomatoTest(){
        Tractor tractor = new Tractor();
        TomatoStalk tomatoStalk = new TomatoStalk();
        tomatoStalk.fertilize();
        tractor.harvest(tomatoStalk.yield());
        Assert.assertEquals(1,tractor.harvested.size());
    }

    @Test
    public void NoYieldPotatoTest(){
        Tractor tractor = new Tractor();
        PotatoStalk potatoStalk = new PotatoStalk();
        potatoStalk.fertilize();
        potatoStalk.defertilize();
        tractor.harvest(potatoStalk.yield());
        Assert.assertEquals(0,tractor.harvested.size());
    }

    @Test
    public void YieldPotatoTest(){
        Tractor tractor = new Tractor();
        PotatoStalk potatoStalk = new PotatoStalk();
        potatoStalk.fertilize();
        tractor.harvest(potatoStalk.yield());
        Assert.assertEquals(1,tractor.harvested.size());
    }

    @Test
    public void NoYieldEarCornTest(){
        Tractor tractor = new Tractor();
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        cornStalk.defertilize();
        tractor.harvest(cornStalk.yield());
        Assert.assertEquals(0,tractor.harvested.size());
    }

    @Test
    public void YieldEarCornTest(){
        Tractor tractor = new Tractor();
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        tractor.harvest(cornStalk.yield());
        Assert.assertEquals(1,tractor.harvested.size());
    }

    @Test
    public void NoYieldChickenEgg(){
        Chicken chicken = new Chicken();
        chicken.fertilize();
        chicken.defertilize();
        chicken.yield();
        Assert.assertEquals(0, chicken.fridge.size());
    }

    @Test
    public void YieldChickenEgg(){
        Chicken chicken = new Chicken();
        chicken.fertilize();
        chicken.yield();
        Assert.assertEquals(1,chicken.fridge.size());
    }
}
