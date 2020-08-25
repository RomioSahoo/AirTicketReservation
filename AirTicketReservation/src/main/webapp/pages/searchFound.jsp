<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight search result page</title>
<style>
h1 {
	margin-top: 100px
}
table{
margin-left:570px;
}

.c{
position:relative;
margin-top:70px;
width:20%;
padding:12px;
text-align:center;
background-color:yellow;
color:black;
text-decoration:none;

}
</style>
</head>
<body align="center">
	<h1>Found!!</h1>
	<table cellpadding="10" border="2">
		<tr>
			<th>Flight Number</th>
			<th>Flight Name</th>
			<th>From</th>
			<th>To</th>
		</tr>
	<c:forEach var="li" items="${list}">
		<tr>
			<td>${li.flightNo}</td>
			<td>${li.name}</td>
			<td>${li.flightFrom}</td>
			<td>${li.flightTo}</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	<div>
	<a href="/" class="c">Home</a>
	</div>
	
</body>
</html>