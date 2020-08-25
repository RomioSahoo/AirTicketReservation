<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cancel Ticket</title>
</head>
<body>
	<table border="2" cellpadding="10">
		<tr>
			<th>ID</th>
			<th>Flight Number</th>
			<th>Flight Name</th>
			<th>From</th>
			<th>To</th>
			<th>Action</th>
		</tr>
		<c:forEach var="li" items="${list}">
			<tr>
				<td>${li.id}</td>
				<td>${li.flightNo}</td>
				<td>${li.flightName}</td>
				<td>${li.flightFrom}</td>
				<td>${li.flightTo}</td>
				<td><a href="delete/${li.id}">Cancel Ticket</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>