package chapter4.spring.context.dependency.injection.abstractions.proxies;

import chapter4.spring.context.dependency.injection.abstractions.dtos.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment" + comment.getText());
    }
}
