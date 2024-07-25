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

}
