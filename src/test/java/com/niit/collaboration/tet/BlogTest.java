package com.niit.collaboration.tet;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.DAO.BlogDAO;
import com.niit.collaboration.model.Blog;

public class BlogTest {
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		BlogDAO blogDAO = (BlogDAO) context.getBean("blogDAO");
		Blog blog = (Blog) context.getBean("blog");
		
		
		blog.setBlogId("BLG1");
		blog.setBlogTitle("KPOP");
		blog.setUserId("U1");
		blog.setBlogDescription("this is first blog this is first blog"
				);
		
		blog.setStatus('A');
		blog.setDateTime(new Date(System.currentTimeMillis()));
		blogDAO.saveOrUpdateBlog(blog);
		
		if(blogDAO.getBlog("BLG1")== null)
		{
			System.out.println("blog does not exist");
		}
		else
		{
			System.out.println("blog exists..");
			System.out.println();
		} 

	}

}
