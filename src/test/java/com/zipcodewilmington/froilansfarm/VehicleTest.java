package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

//
//@Test
//public void makeNoiseTest(){
//    Vehicle vehicle = new Vehicle();
//
//    Assert.assertTrue("Kachow",vehicle.makeNoise());
//
//}
@Test
public void rideableMountTractorTest(){
Vehicle tractor = new Tractor();
Person person = new Person();

Assert.assertTrue(tractor.mount(person));
    

}

    @Test
    public void rideableMountCropDustTest(){
        Vehicle cropDuster = new CropDuster();
        Person person = new Person();

        Assert.assertTrue(cropDuster.mount(person));

    }

    @Test
    public void rideableDismountTractorTest(){
        Vehicle tractor = new Tractor();
        Person person = new Person();

        Assert.assertTrue(tractor.dismount(person));


    }

    @Test
    public void rideableDismountCropDusterTest(){
        Vehicle cropDuster = new CropDuster();
        Person person = new Person();

        Assert.assertTrue(cropDuster.dismount(person));

    }



}
