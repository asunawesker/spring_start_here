package com.asunawesker.relationships.among.beans.method.parameters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args ) {
        // Creates an instance of the Spring context based on the configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Gets a reference to the Person bean from the Spring context
        Person person = context.getBean(Person.class);
        // Gets a reference to the Dog bean from the Spring context
        Dog dog = context.getBean(Dog.class);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Person's dog: " + person.getDog());
    }
}
