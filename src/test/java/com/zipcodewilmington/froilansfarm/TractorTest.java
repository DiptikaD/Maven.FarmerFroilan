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
}
