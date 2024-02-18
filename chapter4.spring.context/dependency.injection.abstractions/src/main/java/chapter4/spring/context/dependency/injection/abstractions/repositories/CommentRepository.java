package chapter4.spring.context.dependency.injection.abstractions.repositories;

import chapter4.spring.context.dependency.injection.abstractions.dtos.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
