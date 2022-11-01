<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Lead</title>
</head>
<body>
			
	<h2>ALL Leads</h2>
	<table border='1'>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Source</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		<c:forEach var="Lead" items="${leads}">
			<tr>
				<td><a href="findOneLead?id=${Lead.id }">${Lead.firstName}</a></td>
				<td>${Lead.lastName}</td>
				<td>${Lead.source}</td>
				<td>${Lead.email}</td>
				<td>${Lead.mobile}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>