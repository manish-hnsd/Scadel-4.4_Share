<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Generating Bill</h1>
	<pre>
	<form action="saveBill" method="post">
	First Name<input type="text" name= "firstName" value="${contact.firstName}"/>
	Last Name<input type="text" name= "lastName" value="${contact.lastName}"/>
	E-Mail<input type="email" name= "email" value="${contact.email}"/>
	Mobile<input type="number" name= "mobile" value="${contact.mobile}"/>
	Product<input type="number" name= "product" value="${contact.product}"/>
	Amount<input type="number" name= "amount" value="${contact.amount}"/>
	<input type="submit" name= "GenerateBill"/>
	${msg }
	</form>
	</pre>
</body>
</html>