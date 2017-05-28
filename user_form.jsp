<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user form</title>
</head>
<body>
<spring:url value="/save" var="saveURL"></spring:url>
<form:form modelAttribute="" method="post" action="$(saveURL)">
<form:hidden path="id"/>
<table>
<tr>
<td> Firstname:</td>
<td><form:input path="first anem"/>
</tr>

<tr>
<td> lastanme:</td>
<td><form:input path="lastanme"/>
</tr>

<tr>
<td> addres:</td>
<td><form:input path="addres"/>
</tr>
<tr>
<td>
</td>

<td> <button type "submit">save</button>
</tr>


</table>
</form:form>
</body>
</html>