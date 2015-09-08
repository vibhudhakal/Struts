<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StrutsRegistrationProject</title>
</head>
<body>

	<br>
<h1> Welcome <bean:write name="registrationNewForm" property="userName"/> to the Registration Application</h1>
<br>
<h2>Your username and password is successfully registered</h2>
</body>
</html>