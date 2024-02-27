package com.asunawesker.singleton.beans.work.bean.annotation;

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
        CommentService commentService2 = context.getBean("commentService", CommentService.class);

        boolean same = commentService1 == commentService2;
        System.out.println("Is the same bean? "+same);
    }
}
