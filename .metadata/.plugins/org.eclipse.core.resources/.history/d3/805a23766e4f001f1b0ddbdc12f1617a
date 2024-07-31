<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@ page isELIgnored="false" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class="container">

		
<table class="table table-hover">
	<thead>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Age</th>
		<th>College</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="s" items="${students}">
		<tr>
			<td>${s.id}</td>
			<td>${s.name}</td>
			<td>${s.age}</td>
			<td>${s.college}</td>
			<td><a href="updateStudent/${s.id}" class="btn btn-warning">Update</a></td>
			<td><a href="deleteStudent/${s.id}" class="btn btn-warning">Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>
	</div>

</body>
</html>