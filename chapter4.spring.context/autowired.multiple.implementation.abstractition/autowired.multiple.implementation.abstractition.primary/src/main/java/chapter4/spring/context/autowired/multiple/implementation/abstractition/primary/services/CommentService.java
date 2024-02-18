package chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.services;

import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.dtos.Comment;
import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.proxies.CommentNotificationProxy;
import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
