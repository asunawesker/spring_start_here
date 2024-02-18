package chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.main;

import chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.config.ProjectConfig;
import chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.dtos.Comment;
import chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(new Comment("Irais Aguirre", "Spring start here es un gran libro"));
    }
}
