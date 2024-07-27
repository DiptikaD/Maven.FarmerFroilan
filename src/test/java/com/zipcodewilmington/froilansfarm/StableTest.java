package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void addStable (){
        Horse horse = new Horse();
        Stable stable = new Stable();
        stable.add(horse);

        Assert.assertEquals(stable.get(0), horse);
    }

    @Test
    public void emptyConstructorHorse(){
        Stable horses = new Stable();
        Assert.assertEquals(0, horses.size());
    }
}
