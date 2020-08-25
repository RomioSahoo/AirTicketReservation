<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.t1{
margin:125px 525px;
}
.c1{
position:absolute;
margin-left:100px;
background-color:yellow;
padding:10px 10px;
text-decoration:none;
}
</style>
</head>
<body align="center">
	<form:form action="searchId" method="post">
		<table class="t1">
			<tr>
			<td>Search Flight</td>
			<td><form:input path="name"/></td>
			</tr>
			<tr>
			<td><input type="submit" class="c1" value="search"></td>
			</tr>
		</table>
	</form:form>


</body>
</html>