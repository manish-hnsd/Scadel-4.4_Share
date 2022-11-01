<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Create Lead</h1>
	<pre>
	<form action="saveLead" method="post">
	First Name<input type="text" name= "firstName"/>
	Last Name<input type="text" name= "lastName"/>
	E-Mail<input type="email" name= "email"/>
	Mobile<input type="number" name= "mobile"/>
	Source :
	<select name="source">
		<option value="news paper">News Paper</option>
		<option value="tv">TV Commercial</option>
		<option value="online">Online</option>
		<option value="seminar">Seminar</option>
	</select>
	<input type="submit" name= "save"/>
	${msg }
	</form>
	</pre>
</body>
</html>