package com.niit.collaboration.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.BlogComment;


public class BlogCommentDAOImpl {
	
	@Autowired
	SessionFactory sessionFactory;

	public BlogCommentDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdateBlogComment(BlogComment blogComment) {
		sessionFactory.getCurrentSession().saveOrUpdate(blogComment);

	}

	@Transactional
	public void deleteBlogComment(String blogCommentId) {
		BlogComment blogCommentTodelete = new BlogComment();
		blogCommentTodelete.setBlogCommentId(blogCommentId);
		sessionFactory.getCurrentSession().delete(blogCommentTodelete);

	}

	@Transactional
	public BlogComment getBlogComment(String blogCommentId) {
		String hql = "from BlogComment where blogCommentId=:blogCommentId";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("blogCommentId", blogCommentId);
		List<BlogComment> gotBlogComment = query.getResultList();
		if (gotBlogComment != null && !gotBlogComment.isEmpty())
			return gotBlogComment.get(0);
		return null;
	}

	@Transactional
	public List<BlogComment> listBlogComments() {
		String hql = "from BlogComment";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<BlogComment> listOfBlogComments = query.getResultList();
		return listOfBlogComments;
	}

}
