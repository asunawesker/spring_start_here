package chapter4.spring.context.object.responsabilities.stereotype.annotations.repositories;

import chapter4.spring.context.object.responsabilities.stereotype.annotations.dtos.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing in db" + comment.getText());
    }
}
