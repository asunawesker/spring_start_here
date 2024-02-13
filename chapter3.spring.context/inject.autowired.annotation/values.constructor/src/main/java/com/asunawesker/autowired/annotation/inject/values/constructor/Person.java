package com.asunawesker.autowired.annotation.inject.values.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private final Dog dog;

    /*
        When Spring creates the bean of type Person, it calls the constructor annotated with @Autowired. Spring provides
        a bean of type Parrot from its context as value of the parameter.
     */
    @Autowired
    public Person(Dog dog){
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

}
