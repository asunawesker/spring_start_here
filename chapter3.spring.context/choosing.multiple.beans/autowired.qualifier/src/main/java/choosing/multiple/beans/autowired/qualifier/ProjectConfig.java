package choosing.multiple.beans.autowired.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "choosing.multiple.beans.autowired.qualifier")
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

}
