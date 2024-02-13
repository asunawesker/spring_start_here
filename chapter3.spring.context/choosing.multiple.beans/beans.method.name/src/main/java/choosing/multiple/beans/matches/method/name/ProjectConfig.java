package choosing.multiple.beans.matches.method.name;

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

    // Spring will provide the value of the bean whose name is the same as the name of the parameter we defined.
    @Bean
    public Person person(Dog dog2){
        Person person = new Person();
        person.setName("Irais");
        person.setDog(dog2);
        return person;
    }

}
