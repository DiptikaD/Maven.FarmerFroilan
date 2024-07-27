package com.zipcodewilmington.froilansfarm;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void addFarmHouse (){
        Person person = new Person();
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(person);

        Assert.assertEquals(farmHouse.get(0), person);
    }

    @Test
    public void emptyConstructorFarmHouse(){
        FarmHouse farmHouse = new FarmHouse();
        Assert.assertEquals(0, farmHouse.size());
    }
}
