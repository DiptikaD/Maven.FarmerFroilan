package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class NoisemakerTest {

    @Test
    public void makeNoiseTest(){
        Horse horse = new Horse();
        Assert.assertEquals("Neigh", horse.makeNoise());
    }
}
