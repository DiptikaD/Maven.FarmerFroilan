package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Person person = new Person();

    @Test
    public void PersonNameConstructor(){
        String expected = "Froi";
        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void pilotName(){
        Person pilot = new Pilot("Froilanda");
        String actual = pilot.getName();
        Assert.assertEquals("Froilanda", actual);
    }

    @Test
    public void farmerName(){
        Person farmer = new Farmer("Froilan");
        String actual = farmer.getName();
        Assert.assertEquals("Froilan", actual);
    }
}
