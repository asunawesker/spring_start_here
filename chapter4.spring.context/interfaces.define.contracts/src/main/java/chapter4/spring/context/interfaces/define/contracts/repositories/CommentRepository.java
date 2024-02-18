package chapter4.spring.context.interfaces.define.contracts.repositories;

import chapter4.spring.context.interfaces.define.contracts.dtos.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
