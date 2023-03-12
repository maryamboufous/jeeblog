package com.mvc.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.mvc.dao.BlogDao;
import com.mvc.dao.BlogDaoImpl;
import com.mvc.bean.Blog;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jeeblog/blogservlet")
public class BlogServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		List<Blog> blogs = new BlogDaoImpl().getAllBlogs();
		
		Iterator<Blog> it = blogs.iterator();
		 while (it.hasNext()) {
			 
	            System.out.println(it.next());
	        }
		 
		request.setAttribute("blogs", blogs);
		request.getServletContext()
		.getRequestDispatcher("/vue/Home.jsp").forward(request, response);
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		super.doPost(req, resp);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
}
