package chapter4.spring.context.dependency.injection.abstractions.proxies;

import chapter4.spring.context.dependency.injection.abstractions.dtos.Comment;

public interface CommentNotificationProxy {
    public void sendComment(Comment comment);
}
