package choosing.multiple.beans.matches.method.name;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
