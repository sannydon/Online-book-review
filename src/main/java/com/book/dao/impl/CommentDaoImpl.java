package com.book.dao.impl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.book.dao.CommentDao;
import com.book.model.Comments;
import com.book.model.Product;

@Repository
@Transactional
public class CommentDaoImpl implements CommentDao {

	@Autowired
    private SessionFactory sessionFactory;
	@Override
	public void addComment(Comments comment) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
	        session.saveOrUpdate(comment);
	        session.flush();
		
	}

	@Override
	public void removeComment(Comments comment) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
	        session.delete(comment);
	        session.flush();
		
	}

	@Override
	public Comments getCartItemByProductId(int productId) {
		// TODO Auto-generated method stub
		  Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("from Comments where productId = ?");
	        query.setInteger(0, productId);
	        session.flush();

	        return (Comments) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comments> getComments(int productId) {
		// TODO Auto-generated method stub
		  Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("from Comments where productId = ?");
	        query.setInteger(0, productId);
	        List<Comments> commentList = query.list();
	        session.flush();
	        return commentList;
	}

}
