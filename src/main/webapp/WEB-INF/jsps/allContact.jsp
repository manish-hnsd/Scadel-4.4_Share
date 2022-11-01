<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>ALL Contacts</h2>
	<table border='1'>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Source</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Generate Bill</th>
			
		</tr>
		<c:forEach var="Contact" items="${contact}">
			<tr>
				<td><a href="findcontactById?id=${Contact.id }">${Contact.firstName}</a></td>
				<td>${Contact.lastName}</td>
				<td>${Contact.source}</td>
				<td>${Contact.email}</td>
				<td>${Contact.mobile}</td>
				<td><a href="generateBill?id=${Contact.id}">${Contact.mobile}</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>