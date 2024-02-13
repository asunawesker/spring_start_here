package com.asunawesker.autowired.annotation.inject.values.classfields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Irais";

    /*
        We instruct Spring to provide a bean from its context and set it directly as the value of the field, annotated
        with @Autowired. This way we establish a relationship between the two beans
     */
    @Autowired
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
