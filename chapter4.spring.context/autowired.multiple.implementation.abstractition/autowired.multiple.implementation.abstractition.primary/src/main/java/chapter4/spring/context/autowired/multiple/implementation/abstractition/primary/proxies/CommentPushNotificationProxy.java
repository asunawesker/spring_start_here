package chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.proxies;

import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.dtos.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment to comment push " + comment.getText());
    }
}
