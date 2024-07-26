package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class FarmHouse extends ArrayList<Person> {
    private ArrayList<Person> people;

    public FarmHouse(){
        this.people = new ArrayList<Person>();
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public boolean add(Person person){
        people.add(person);
        return true;
    }

}
