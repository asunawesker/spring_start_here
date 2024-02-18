package chapter4.spring.context.dependency.injection.abstractions.services;

import chapter4.spring.context.dependency.injection.abstractions.dtos.Comment;
import chapter4.spring.context.dependency.injection.abstractions.proxies.CommentNotificationProxy;
import chapter4.spring.context.dependency.injection.abstractions.repositories.CommentRepository;
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
