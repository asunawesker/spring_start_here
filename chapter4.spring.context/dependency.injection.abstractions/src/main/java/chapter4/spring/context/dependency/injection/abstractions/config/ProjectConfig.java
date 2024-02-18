package chapter4.spring.context.dependency.injection.abstractions.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter4.spring.context.dependency.injection.abstractions")
public class ProjectConfig {
}
