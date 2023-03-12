package com.mvc.dao;

import java.util.List;

import com.mvc.bean.Blog;
 
public interface BlogDao {
	List<Blog> getAllBlogs();
	Blog getAllBlogById(int id);
	void CreateBlog();
	void deleteBlog(Blog b);
	void updateBlog(Blog b);
	
}
