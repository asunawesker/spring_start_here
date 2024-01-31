package chapter2.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args){

        // Creates an instance of the Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Create the instance we want to add to the Spring context
        Person person = new Person();
        person.setName("Irais");

        // Define a Supplier to return this instance
        Supplier<Person> personSupplier = () -> person;

        // We call the registerBean method to add the instance to the Spring context
        context.registerBean("person1", Person.class, personSupplier);

        Person personBean = context.getBean(Person.class);
        System.out.println(personBean.getName());
    }

}
