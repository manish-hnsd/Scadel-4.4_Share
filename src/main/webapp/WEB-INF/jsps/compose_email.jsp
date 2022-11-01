<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="sendEmail" method="post">
		<pre>
			To:<input type="text" name="to" value="${email}"/>
			Subject:<input type="text" name="sub" >
			Compose:
			<textarea id="review" name="body" rows="4" cols="50">At 
			zoho.com we will provide our best service. We offer 
			free tools in all web development technologies.
			Thanks, for signing Up </textarea>
			<input type="submit" value="send">
		</pre>
	</form>
</body>
</html>