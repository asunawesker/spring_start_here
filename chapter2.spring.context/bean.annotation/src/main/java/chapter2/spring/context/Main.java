package chapter2.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        // Creates an instance of the Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Access to beans
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());

        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer ten = context.getBean(Integer.class);
        System.out.println(ten);

        // To access to beans with same type, it can be accessed using the bean's name.
        // When the beans name is not referred, the Spring context use the one with the annotation @Primary
        // (default choice like the first Person object)
        Person person2 = context.getBean("Ale", Person.class);
        System.out.println(person2.getName());

        Person person3 = context.getBean("Uriel", Person.class);
        System.out.println(person3.getName());

        Person person4 = context.getBean("Marisol", Person.class);
        System.out.println(person4.getName());
    }

}
