package chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.repositories;

import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.dtos.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing in db" + comment.getText());
    }
}
