package com.asunawesker.autowired.annotation.inject.values.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Irais";
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

    /*
        Dependency injection through the setter
        NOT RECOMMENDED, AVOID TO USE IT
     */
    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
