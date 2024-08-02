<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./style.jsp"%>
<title>${title}</title>
</head>
<body>
<div class="container mt-3">
	<h1>Edit Student </h1>
	<form action="update" method="post">
	
		<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="id">Id</label> <input type="text"
							value="${student.id}" class="form-control" id="id" name="id"
							readonly="readonly">
					</div>
				</div>
			</div>
		<div class="row">
			<div class="col">
				<div class="form-group">
					<label for="name">Name</label>
					<input type="text" class="form-control" value="${student.name}" id="name" name="name" placeholder="Enter Name"/>
				</div>
			</div>
			<div class="col">
				<div class="form-group">
					<label for="age">Age</label>
					<input type="text" class="form-control"  value="${student.age}" id="age" name="age" placeholder="Enter Age"/>
				</div>
			</div>
			<div class="col">
				<div class="form-group">
					<label for="college">College</label>
					<input type="text" class="form-control" value="${student.college}" id="college" name="college" placeholder="Enter College"/>
				</div>
			</div>
		</div>
	
		<button type="submit" class="btn btn-primary">Update</button>
		</form>
</div>

</body>
</html>