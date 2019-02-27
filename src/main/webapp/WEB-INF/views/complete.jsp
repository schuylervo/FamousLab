<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
<title>Complete inventors list</title>
</head>
<body>
<h1>
Complete Inventors List
</h1>

<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Name</th scope="col"><th>Innovation</th scope="col"><th>Year</th>
				</tr>
			</thead class="thead-light">
			<tbody>
				<c:forEach var="completes" items="${ complete }">
				<tr>
					<td>${ completes.firstName } ${ completes.lastName }</td>
					<td>${ completes.innovation }</td>
					<td>${ completes.year }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>




<p>
<a class="btn btn-primary" href="/">Go Home</a>
</p>
</body>
</html>