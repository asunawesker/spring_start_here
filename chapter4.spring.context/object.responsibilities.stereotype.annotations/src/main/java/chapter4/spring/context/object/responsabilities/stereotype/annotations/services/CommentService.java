package chapter4.spring.context.object.responsabilities.stereotype.annotations.services;

import chapter4.spring.context.object.responsabilities.stereotype.annotations.dtos.Comment;
import chapter4.spring.context.object.responsabilities.stereotype.annotations.proxies.CommentNotificationProxy;
import chapter4.spring.context.object.responsabilities.stereotype.annotations.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
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
