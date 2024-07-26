package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StableTest {

    @Test
    public void addStable (){
        Horse horse = new Horse();
        Stable horses = new Stable();
        ArrayList<Horse> expected = new ArrayList<>();
        expected.add(horse);
        horses.add(horse);
        Assert.assertEquals(expected, horses.getHorses());
    }

    @Test
    public void setHorse(){
        Stable horses = new Stable();
        ArrayList<Horse> expected = new ArrayList<>();
        horses.setHorses(expected);
        Assert.assertEquals(expected, horses.getHorses());
    }
}
