package com.asunawesker.prototype.beans.work.stereotype.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService1 = context.getBean("commentService", CommentService.class);
        UserService userService = context.getBean("userService", UserService.class);

        boolean same = commentService1.getCommentRepository() == userService.getCommentRepository();
        System.out.println("Is the same bean? "+same);
    }
}
