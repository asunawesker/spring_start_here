package chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.proxies;

import chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.dtos.Comment;

public interface CommentNotificationProxy {
    public void sendComment(Comment comment);
}
