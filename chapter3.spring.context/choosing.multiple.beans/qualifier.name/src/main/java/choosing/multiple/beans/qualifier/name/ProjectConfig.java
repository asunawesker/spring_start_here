package choosing.multiple.beans.qualifier.name;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Dog dog1(){
        Dog dog = new Dog();
        dog.setName("Princesa");
        return dog;
    }

    @Bean
    public Dog dog2(){
        Dog dog = new Dog();
        dog.setName("Mila");
        return dog;
    }

    // Using the @Qualifier annotation, you clearly mark your intention to inject a specific bean from the context.
    @Bean
    public Person person(@Qualifier("dog2") Dog dog){
        Person person = new Person();
        person.setName("Irais");
        person.setDog(dog);
        return person;
    }

}
