package chapter2.spring.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    private String name;

    @PostConstruct
    public void init(){
        this.name = "Irais";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
