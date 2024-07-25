package com.zipcodewilmington.froilansfarm;

public class Person extends Animal implements Rider {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }
    @Override
    public String makeNoise() {
        return "Hi";
    }

    @Override
    public void eat(Edible Edible) {
        stomach.add(Edible);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
