package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmHouseTest {

    @Test
    public void addFarmHouse (){
        Person person = new Person();
        FarmHouse people = new FarmHouse();
        ArrayList<Person> expected = new ArrayList<>();
        expected.add(person);
        people.add(person);
        Assert.assertEquals(expected, people.getPeople());
    }

    @Test
    public void setFarmHouse(){
        FarmHouse people = new FarmHouse();
        ArrayList<Person> expected = new ArrayList<>();
        people.setPeople(expected);
        Assert.assertEquals(expected, people.getPeople());
    }
}
