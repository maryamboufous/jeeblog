<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Blog</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<%@ include file="includes/header.jsp" %>

	<h1>Create Blog</h1>
	<form action="/blogservlet" method="POST">
  <label for="titre">Titre:</label>
  <input type="text" id="titre" name="titre" required>

  <label for="sous-titre">Sous-titre:</label>
  <input type="text" id="sous-titre" name="soustitre" required>

  <label for="contenu">Contenu:</label>
  <textarea id="contenu" name="contenu" required></textarea>

  <input type="submit" value="Envoyer">
</form>

</body>
</html>