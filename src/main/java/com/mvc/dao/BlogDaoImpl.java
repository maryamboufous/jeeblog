package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.mvc.bean.Blog;
import com.mvc.util.DBConnection;

public class BlogDaoImpl implements BlogDao{
	private Connection cnx;
	List<Blog> blogs;
	
	public BlogDaoImpl(){
		try {
			cnx = DBConnection.createConnection();
			PreparedStatement stm = cnx.prepareStatement("SELECT * FROM blogs");
			ResultSet rst=stm.executeQuery();
			
			 while(rst.next()){
	                Blog blog = new Blog(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5));
	                blogs.add(blog);
	            }
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
}
	
	@Override
	public List<Blog> getAllBlogs() {
		return blogs;
	}

	@Override
	public Blog getAllBlogById(int id) {
		Blog blog = null;
		cnx = DBConnection.createConnection();
		String req = "SELECT * FROM blogs WHERE id=?";
		try {
			PreparedStatement ps = cnx.prepareStatement(req);
			ps.setInt(1, id);
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				blog = new Blog(id, res.getString("titre"),res.getString("soustitre"),res.getString("contenu"),res.getInt("user_id"));
			}
			
			
			Iterator<Blog> it = blogs.iterator();
			 while (it.hasNext()) {
				 
		            System.out.println(it.next());
		        }
			 
			 
			 
		}catch(Exception e) { e.printStackTrace();}
		return blog;
	}

	@Override
	public void CreateBlog() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void deleteBlog(Blog b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBlog(Blog b) {
		// TODO Auto-generated method stub
		
	}
}
