package chapter4.spring.context.interfaces.define.contracts.main;

import chapter4.spring.context.interfaces.define.contracts.dtos.Comment;
import chapter4.spring.context.interfaces.define.contracts.proxies.CommentNotificationProxy;
import chapter4.spring.context.interfaces.define.contracts.proxies.EmailCommentNotificationProxy;
import chapter4.spring.context.interfaces.define.contracts.repositories.CommentRepository;
import chapter4.spring.context.interfaces.define.contracts.repositories.DBCommentRepository;
import chapter4.spring.context.interfaces.define.contracts.services.CommentService;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        commentService.publishComment(new Comment("Benito Taibo", "Persona normal"));
    }
}
