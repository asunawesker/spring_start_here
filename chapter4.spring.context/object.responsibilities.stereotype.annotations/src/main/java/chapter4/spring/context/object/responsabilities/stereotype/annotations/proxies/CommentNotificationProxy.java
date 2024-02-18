package chapter4.spring.context.object.responsabilities.stereotype.annotations.proxies;

import chapter4.spring.context.object.responsabilities.stereotype.annotations.dtos.Comment;

public interface CommentNotificationProxy {
    public void sendComment(Comment comment);
}
