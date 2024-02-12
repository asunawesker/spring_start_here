package com.asunawesker.autowired.annotation.inject.values.classfields.relationships.among.beans.method.parameters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Dog dog(){
        Dog dog = new Dog();
        dog.setName("Mila");
        return dog;
    }

    /*
        We instruct Spring to provide a bean from its context by defining a parameter for the method (injects the dog
        bean into that parameter).
        Dependency Injection approach
     */
    @Bean
    public Person person(Dog dog){
        Person person = new Person();
        person.setName("Irais");
        // We set the value of the person’s attribute with the reference Spring provided.
        person.setDog(dog);
        return person;
    }
}
