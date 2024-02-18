package chapter4.spring.context.dependency.injection.abstractions.main;

import chapter4.spring.context.dependency.injection.abstractions.config.ProjectConfig;
import chapter4.spring.context.dependency.injection.abstractions.services.CommentService;
import chapter4.spring.context.dependency.injection.abstractions.dtos.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(new Comment("Irais Aguirre", "Spring start here es un gran libro"));
    }
}
