package com.asunawesker.autowired.annotation.inject.values.classfields.relationships.among.direct.method.call;

public class Person {

    private String name;
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
