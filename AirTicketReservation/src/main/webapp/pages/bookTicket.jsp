<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.t1 {
	margin: 125px 0;
}

.s {
	position: absolute;
	margin-left: 100px;
	padding: 10px 10px;
	background-color:yellow;
}
</style>
</head>
<body>
	<div align="center">
		<form:form action="save" method="post">
			<table class="t1">
				<tr>
					<td>Flight Number</td>
					<td><form:input path="FlightNo" /></td>
				</tr>
				<tr>
					<td>Flight Name</td>
					<td><form:input path="FlightName" /></td>
				</tr>
				<tr>
					<td>From</td>
					<td><form:input path="FlightFrom" /></td>
				</tr>
				<tr>
					<td>To</td>
					<td><form:input path="FlightTo" /></td>
				</tr>
				<tr>
					<td><input type="submit" class="s" value="Book" /></td>
				</tr>

			</table>
		</form:form>
	</div>

</body>
</html>