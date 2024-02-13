package com.asunawesker.circular.dependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * A circular dependency is a situation in which, to create a bean (let’s name it Bean A), Spring needs to inject
 * another bean that doesn’t exist yet (Bean B). But Bean B also requests a dependency to Bean A. So, to create Bean B,
 * Spring needs first to have Bean A. Spring is now in a deadlock. It cannot create Bean A because it needs Bean B, and
 * it cannot create Bean B because it needs Bean A.
 */
public class Main {
    public static void main( String[] args ) {
        // Creates an instance of the Spring context based on the configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Gets a reference to the Person bean from the Spring context
        Person person = context.getBean(Person.class);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's dog: " + person.getDog());
    }
}
