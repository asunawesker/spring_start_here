package chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.repositories;

import chapter4.spring.context.autowired.multiple.implementation.abstractition.primary.dtos.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
