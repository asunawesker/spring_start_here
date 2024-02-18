package chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.repositories;

import chapter4.spring.context.autowired.multiple.implementation.abstraction.qualifier.dtos.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
