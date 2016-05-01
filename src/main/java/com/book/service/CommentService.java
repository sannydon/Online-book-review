package com.book.service;

import java.util.List;

import com.book.model.Comments;

public interface CommentService {
	void addComment(Comments comment);

    void removeComment(Comments comment);


    Comments getCartItemByProductId (int productId);
    List<Comments> getComments(int productId);
}
