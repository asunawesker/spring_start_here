package chapter4.spring.context.object.responsabilities.stereotype.annotations.main;

import chapter4.spring.context.object.responsabilities.stereotype.annotations.config.ProjectConfig;
import chapter4.spring.context.object.responsabilities.stereotype.annotations.services.CommentService;
import chapter4.spring.context.object.responsabilities.stereotype.annotations.dtos.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(new Comment("Irais Aguirre", "Spring start here es un gran libro"));
    }
}
