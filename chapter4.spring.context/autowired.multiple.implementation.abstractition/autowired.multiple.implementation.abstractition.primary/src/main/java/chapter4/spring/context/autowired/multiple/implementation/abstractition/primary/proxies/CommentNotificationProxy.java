package chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.proxies;

import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.dtos.Comment;

public interface CommentNotificationProxy {
    public void sendComment(Comment comment);
}
