package chapter2.spring.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Using basePackages we tell Spring where to look for classes annotated with stereotype annotations.
@Configuration
@ComponentScan(basePackages = "chapter2.spring.context")
public class ProjectConfig {

}
