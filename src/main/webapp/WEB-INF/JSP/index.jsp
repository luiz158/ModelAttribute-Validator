<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style>
	form {
		width: 45%;
		margin: 0 auto;
	}
	
	@media screen and (max-width: 768px) {
		form {
			width: 80%;
			margin: 0 auto;
		}
	}
</style>
</head>
<body>
<%@ include file="navbar.jsp" %>
<h2 class="display-4 text-center my-5" style="font-size: 2.8em;">Home Page</h2>
<form:form action="" method="post" modelAttribute="p">
	<div class="form-group">
		<form:label path="nom">Nom</form:label><form:input path="nom" cssClass="form-control"/><small><form:errors path="nom" cssClass="form-text text-danger"/></small>
	</div>
	<div class="form-group">
		<form:label path="prenom">Prenom</form:label><form:input path="prenom" cssClass="form-control"/><small><form:errors path="prenom" cssClass="form-text text-danger"/></small>
	</div>
	<div class="text-center"><input type="submit" class="btn btn-primary"></div>
</form:form>
</body>
</html>