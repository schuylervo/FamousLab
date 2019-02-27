<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tiny inventors list</title>
</head>
<body>

<h1> Tiny Inventors List</h1>


		<table>
			<thead>
				<tr>
					<th>Name</th><th>Innovation</th><th>Year</th>
				</tr>
			</thead>
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


<a href="/complete">Go Big</a>
<a href="/">or Go Home</a>
</p>
</body>
</html>