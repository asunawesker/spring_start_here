package chapter4.spring.context.interfaces.define.contracts.proxies;

import chapter4.spring.context.interfaces.define.contracts.dtos.Comment;

public interface CommentNotificationProxy {
    public void sendComment(Comment comment);
}
