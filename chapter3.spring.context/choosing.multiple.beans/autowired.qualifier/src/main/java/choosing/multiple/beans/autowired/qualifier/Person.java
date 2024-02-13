package choosing.multiple.beans.autowired.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Irais";

    private final Dog dog;

    // With the current setup, the bean named dog2 is the one that Spring injects into the Person bean. We can use this
    // instead of @Autowired annotation to inject a bean. This is cleaner in order to express a bean inject intention.
    public Person(@Qualifier("dog2") Dog dog){
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

}
