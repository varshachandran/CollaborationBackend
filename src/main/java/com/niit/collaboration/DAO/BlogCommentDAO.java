package com.niit.collaboration.DAO;

import java.util.List;

import com.niit.collaboration.model.BlogComment;

public interface BlogCommentDAO {

	void saveOrUpdateBlogComment(BlogComment blogComment);

	void deleteBlogComment(String blogCommentId);

	BlogComment getBlogComment(String blogCommentId);

	List<BlogComment> listBlogComments();

}
