package chapter4.spring.context.object.responsabilities.stereotype.annotations.repositories;

import chapter4.spring.context.object.responsabilities.stereotype.annotations.dtos.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
