package chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.main;

import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.config.ProjectConfig;
import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.dtos.Comment;
import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(new Comment("Irais Aguirre", "Spring start here es un gran libro"));
    }
}
