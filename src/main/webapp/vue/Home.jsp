<%@page import="java.util.List"%>
<%@page import="com.mvc.bean.Blog"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>MY BLOG</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>

	<%@ include file="includes/header.jsp" %>
	
	
	<section class="homesection">
	<div class="content">	
	
<ul>
        <% for (Blog blog : blogs) { %>
        <li>
            <h2><%= blog.getTitre() %></h2>

        </li>
        <% } %>

</ul>
	
	</div>
	</section>

</body>
</html>