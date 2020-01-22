<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details du livre</title>
</head>
<body>
	<h3>Details du livre #${livre.id}</h3>
	<p>Titre: ${livre.titre}</p>
	<p>Prix: ${livre.prix}</p>
	<p>ISBN: ${livre.isbn}</p>
	<p>Date Publication: ${livre.datePub}</p>
	<p>Description: ${livre.description}</p>
</body>
</html>