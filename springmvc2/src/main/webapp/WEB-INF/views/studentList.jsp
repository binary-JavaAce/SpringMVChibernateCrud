<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored="false"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@include file="./style.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
</head>
<body>


	<div class="container mt-3">

		<h2 style="color: green;">${title}</h2>
		<a href="add" class="btn btn-primary"> Add Student </a>		
		<div class="row">
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Age</th>
						<th scope="col">College</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="s" items="${students}">
						<tr>
							<td class="table-plus">${s.id}</td>
							<td>${s.name}</td>
							<td>${s.age}</td>
							<td>${s.college}</td>
							<td><a href="editStudent/${s.id}" class="btn btn-warning">Edit</a></td>
							<td><a href="deleteStudent/${s.id}" class="btn btn-warning">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>