package com.niit.collaboration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="BlogComment")
public class BlogComment {
    
	@Id
	private String blogCommentId;
	private String userId;
	private String blogCommentContent;
	private Date DateTime;

	public String getBlogCommentId() {
		return blogCommentId;
	}

	public void setBlogCommentId(String blogCommentId) {
		this.blogCommentId = blogCommentId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBlogCommentContent() {
		return blogCommentContent;
	}

	public void setBlogCommentContent(String blogCommentContent) {
		this.blogCommentContent = blogCommentContent;
	}

	public Date getDateTime() {
		return DateTime;
	}

	public void setDateTime(Date dateTime) {
		DateTime = dateTime;
	}

}
