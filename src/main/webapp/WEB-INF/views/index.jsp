<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
<title>Tiny inventors list</title>
</head>
<body>

<h1> Tiny Inventors List</h1>


		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Name</th><th scope="col">Innovation</th scope="col"><th>Year</th>
				</tr>
			</thead class="thead-lightk">
			<tbody>
				<c:forEach var="tinies" items="${ tiny }">
				<tr>
					<td> ${ tinies.name }</td>
					<td> ${ tinies.invented }</td>
					<td> ${ tinies.year }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>


<a class="btn btn-primary" href="/complete">Go Big</a>
<a class="btn btn-primary" href="/">or Go Home</a>
</p>
</body>
</html>