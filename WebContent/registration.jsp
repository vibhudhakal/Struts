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
	<div style="color: red">
		<html:errors property="global" />
	</div>
	<br>

	<html:form action="/registration.do" method="post">
 <bean:message key="label.username.value"/>:<html:text property="userName"></html:text><br>
 <div style="color: red"> <html:errors property="username"/> </div>
		<br>
  <bean:message key="label.password.value"/>:<html:password property="password"></html:password><br>
  		<div style="color: red"> <html:errors property="password"/> </div>
  
		<br>

		<html:submit>Click Here To Login  </html:submit>

<div style="color: red">
	<h1>	<html:errors property="global" />   </h1>
	</div>
	<h2><bean:write name="registrationNewForm" property="message"/></h2>
	</html:form>
</body>
</html>