package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class EaterTest {

    @Test
    public void HorseEatTest(){
        Animal horse = new Horse();
        EarCorn earcorn = new EarCorn();
        horse.eat(earcorn);

        Assert.assertEquals(1, horse.stomach.size());
    }

    @Test
    public void PersonEatTest(){
        Person person = new Person();
        EarCorn earCorn = new EarCorn();
        person.eat(earCorn);

        Assert.assertEquals(1, person.stomach.size());
    }
}
