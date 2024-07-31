<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./style.jsp"%>
<title>Add Student</title>
</head>
<body>

<div class="container mt-3">
	<h1>Add Student </h1>
	<form action="insert" method="post">
		<div class="row">
			<div class="col">
				<div class="form-group">
					<label for="name">Name</label>
					<input type="text" class="form-control" id="name" name="name" placeholder="Enter Name"/>
				</div>
			</div>
			<div class="col">
				<div class="form-group">
					<label for="age">Age</label>
					<input type="text" class="form-control" id="age" name="age" placeholder="Enter Age"/>
				</div>
			</div>
			<div class="col">
				<div class="form-group">
					<label for="college">College</label>
					<input type="text" class="form-control" id="college" name="college" placeholder="Enter College"/>
				</div>
			</div>
		</div>
		<a href="${pageContext.request.contextPath }/" class="btn btn-warning"> Back</a>
		
		
		<button type="submit" class="btn btn-primary">Submit</button>
		</form>
</div>

</body>
</html>