package com.asunawesker.prototype.beans.work;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    /*
        Every time you request a reference to a prototype-scoped bean, Spring creates a new object instance. For
        prototype beans, Spring doesn’t create and manage an object instance directly. The framework manages the
        object’s type and creates a new instance every time someone requests a reference to the bean.
     */
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService1 = context.getBean("commentService", CommentService.class);
        CommentService commentService2 = context.getBean("commentService", CommentService.class);

        boolean same = commentService1 == commentService2;
        System.out.println("Is the same bean? "+same);
    }
}
