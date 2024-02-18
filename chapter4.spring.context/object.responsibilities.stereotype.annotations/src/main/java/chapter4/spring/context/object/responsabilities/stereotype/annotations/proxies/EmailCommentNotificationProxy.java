package chapter4.spring.context.object.responsabilities.stereotype.annotations.proxies;

import chapter4.spring.context.object.responsabilities.stereotype.annotations.dtos.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment" + comment.getText());
    }
}
