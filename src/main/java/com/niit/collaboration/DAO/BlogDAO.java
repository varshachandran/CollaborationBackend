package com.niit.collaboration.DAO;

import java.util.List;

import com.niit.collaboration.model.Blog;

public interface BlogDAO {

	void saveOrUpdateBlog(Blog blog);

	void deleteBlog(String blogId);

	Blog getBlog(String blogId);

	List<Blog> listBlogs();

}
