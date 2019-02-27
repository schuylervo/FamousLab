<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete inventors list</title>
</head>
<body>
<h1>
Complete Inventors List
</h1>

<table>
			<thead>
				<tr>
					<th>Name</th><th>Innovation</th><th>Year</th>
				</tr>
			</thead>
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
<a href="/">Go Home</a>
</p>
</body>
</html>