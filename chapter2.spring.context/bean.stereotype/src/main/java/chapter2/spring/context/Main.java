package chapter2.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        // Creates an instance of the Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println(person);
        System.out.println(person.getName());
    }

}
