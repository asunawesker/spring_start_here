package chapter4.spring.context.interfaces.define.contracts.proxies;

import chapter4.spring.context.interfaces.define.contracts.dtos.Comment;
import chapter4.spring.context.interfaces.define.contracts.repositories.CommentRepository;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment" + comment.getText());
    }
}
