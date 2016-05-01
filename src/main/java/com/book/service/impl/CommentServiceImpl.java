package com.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.CommentDao;
import com.book.model.Comments;
import com.book.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentdao;
	@Override
	public void addComment(Comments comment) {
		// TODO Auto-generated method stub
		commentdao.addComment(comment);
		
	}

	@Override
	public void removeComment(Comments comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comments getCartItemByProductId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> getComments(int productId) {
		// TODO Auto-generated method stub
		return commentdao.getComments(productId);
	}

}
