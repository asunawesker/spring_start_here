package com.asunawesker.eager.lazy.instantiation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
            With lazy instantiation, Spring doesn’t create the singleton instances when it creates the context. Instead,
             it creates each instance the first time someone refers to the bean.

            To see eager instantiation, comment the @Lazy annotation in CommentService.class.
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the CommentService");
        context.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}
