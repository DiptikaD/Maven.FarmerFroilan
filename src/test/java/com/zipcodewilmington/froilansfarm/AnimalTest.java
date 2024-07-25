package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AnimalTest {

    @Test
    public void ConstructorTest(){
        ArrayList<Edible> edibles = new ArrayList<>();
        EarCorn earCorn = new EarCorn();
        Animal horse = new Horse(edibles);
        horse.eat(earCorn);
        Assert.assertEquals(1,horse.stomach.size());

    }

    @Test
    public void getStomachContents(){
        Animal horse = new Horse();
        EarCorn earCorn = new EarCorn();
        horse.eat(earCorn);

        ArrayList<Edible> edible = new ArrayList<>();
        edible.add(earCorn);

        Assert.assertEquals(edible, horse.getStomachContents());
    }

    @Test
    public void setStomach(){
        Animal horse = new Horse();
        EarCorn earCorn = new EarCorn();
        ArrayList<Edible> edibles = new ArrayList<>();
        edibles.add(earCorn);
        horse.setStomach(edibles);
        Assert.assertEquals(horse.getStomachContents(), edibles);
    }

    @Test
    public void ChickenInstanceofAnimal(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void HorseInstanceofAnimal(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void PersonInstanceofAnimal(){
        Person person = new Person();
        Assert.assertTrue(person instanceof Animal);
    }
}
