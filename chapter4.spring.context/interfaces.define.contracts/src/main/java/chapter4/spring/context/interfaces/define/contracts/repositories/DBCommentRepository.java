package chapter4.spring.context.interfaces.define.contracts.repositories;

import chapter4.spring.context.interfaces.define.contracts.dtos.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing in db" + comment.getText());
    }
}
