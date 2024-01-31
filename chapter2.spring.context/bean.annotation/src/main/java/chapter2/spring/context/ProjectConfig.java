package chapter2.spring.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig{

    // Adding different type of objects to the Spring context
    @Bean
    @Primary
    Person person(){
        Person person = new Person();
        person.setName("Irais");
        return person;
    }

    @Bean
    String hell0(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }

    // Adding same type of object to the Spring context
    @Bean(name = "Ale")
    Person person2(){
        Person person = new Person();
        person.setName("Ale");
        return person;
    }

    @Bean(value = "Uriel")
    Person person3(){
        Person person = new Person();
        person.setName("Uriel");
        return person;
    }

    @Bean("Marisol")
    Person person4(){
        Person person = new Person();
        person.setName("Marisol");
        return person;
    }
}
