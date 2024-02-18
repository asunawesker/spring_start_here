package chapter4.spring.context.interfaces.define.contracts.services;

import chapter4.spring.context.interfaces.define.contracts.dtos.Comment;
import chapter4.spring.context.interfaces.define.contracts.proxies.CommentNotificationProxy;
import chapter4.spring.context.interfaces.define.contracts.repositories.CommentRepository;

public class CommentService {

    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
