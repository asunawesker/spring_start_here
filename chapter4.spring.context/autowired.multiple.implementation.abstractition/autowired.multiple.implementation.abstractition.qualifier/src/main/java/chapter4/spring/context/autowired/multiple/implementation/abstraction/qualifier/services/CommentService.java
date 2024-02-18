package chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.services;

import chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.dtos.Comment;
import chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.proxies.CommentNotificationProxy;
import chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
