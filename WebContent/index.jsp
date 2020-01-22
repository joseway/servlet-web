<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Tous les livres</title>
	</head>
	<body>
		<header>
			<nav>
				<a href="<c:url value="accueil" />">Accueil</a>
				<a href="<c:url value="nouveau-livre" />">Nouveau Livre</a>
			</nav>
		</header>
		<h3>Tous les livres</h3>
		<table>
			<tr>
				<th>Prix</th>
				<th>Titre</th>
			</tr>
			<c:forEach var="livre" items="${livres}">
			<tr>
				<td><a href="<c:url value="/livre?id=${livre.id}" />">${livre.prix}</a></td>
				<td><a href="<c:url value="/livre?id=${livre.id}" />">${livre.titre}</a></td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>