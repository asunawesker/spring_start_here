package com.asunawesker.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Dog {

    private String name = "Princesa";

    private final Person person;

    // To create the Dog instance, Spring needs to have a Person bean.
    @Autowired
    public Dog(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
