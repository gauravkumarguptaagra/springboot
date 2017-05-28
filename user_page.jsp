<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user page</title>
</head>
<body>
	<h1>user List</h1>
	<table width="100" border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th colspan="2">Action</th>

		</tr>
		<c:forEach items="${listUser }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.id }</td>
				<td>${user.id }</td>
				<td><spring:url value="/update/${user.id}" var="updateUrl"></spring:url>
				<a href="${updateUrl }">update</a>
				</td>
				<td><spring:url value="/deleate/${user.id}" var="deleateUrl"></spring:url>
				<a href="${deleateUrl }">deleate</a>
				</td>
				
			</tr>


		</c:forEach>


	</table>
</body>
</html>