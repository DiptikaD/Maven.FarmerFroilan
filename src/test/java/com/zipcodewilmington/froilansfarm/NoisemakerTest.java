package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class NoisemakerTest {

    @Test
    public void makeNoiseHorseTest(){
        Horse horse = new Horse();
        Assert.assertEquals("Neigh", horse.makeNoise());
    }

    @Test
    public void makeNoisePersonTest(){
        Animal person = new Person();
        Assert.assertEquals("Hi", person.makeNoise());
    }
}
