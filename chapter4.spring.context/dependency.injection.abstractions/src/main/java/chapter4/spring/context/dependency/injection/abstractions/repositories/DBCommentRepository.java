package chapter4.spring.context.dependency.injection.abstractions.repositories;

import chapter4.spring.context.dependency.injection.abstractions.dtos.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing in db" + comment.getText());
    }
}
