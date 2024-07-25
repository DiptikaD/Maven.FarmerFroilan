package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class EaterTest {

    @Test
    public void eatTest(){
        Animal horse = new Horse();
        EarCorn earcorn = new EarCorn();
        horse.eat(earcorn);

        Assert.assertEquals(1, horse.stomach.size());
    }
}
