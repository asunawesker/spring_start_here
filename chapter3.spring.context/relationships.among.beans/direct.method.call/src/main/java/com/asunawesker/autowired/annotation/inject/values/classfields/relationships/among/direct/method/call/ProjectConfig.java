package com.asunawesker.autowired.annotation.inject.values.classfields.relationships.among.direct.method.call;

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
        We define the relationship between the person bean and the dog bean by directly calling the method that returns
        the bean we want to set.
     */
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Irais");
        // Setting the reference of the parrot bean to the person’s parrot attribute.
        person.setDog(dog());
        return person;
    }
}
