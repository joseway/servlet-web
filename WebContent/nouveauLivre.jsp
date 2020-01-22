<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Nouveau Livre</title>
	</head>
	<body>
			<header>
				<nav>
					<a href="<c:url value="accueil" />">Accueil</a>
					<a href="<c:url value="nouveau-livre" />">Nouveau Livre</a>
				</nav>
			</header>
		<h3>Nouveau Livre</h3>
		
		<div class="container">
			<div>
				<form action="<c:url value="nouveau-livre" />" method="post">
					<div class="form-group">
						<label for="titre">Titre</label>
						<input type="text" name="titre" id="titre"/>
					</div>
					<div class="form-group">
						<label for="isbn">ISBN</label>
						<input type="text" name="isbn" id="isbn"/>
					</div>
					<div class="form-group">
						<label for="prix">Prix</label>
						<input type="number" name="prix" id="prix"/>
					</div>
					<div class="form-group">
						<label for="datePub">Date Publication</label>
						<input type="date" name="datePub" id="datePub"/>
					</div>
					<div class="form-group">
						<label for="description">Description</label>
						<textarea name="description" id="description"></textarea>
					</div>
					<button type="submit">Enregister</button>
				</form>
			</div>
		</div>
	</body>
</html>