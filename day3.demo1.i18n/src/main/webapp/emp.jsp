<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EMP JSP invoked ...</h1>
<s:message code="empno" text="EmpnoNotFound" />	<input type="text" name="empno" value="10">
	<br />
<s:message code="ename" text="ENameNotFound" />	<input type="text" name="ename" value="Vaishali">
	<br />
<s:message code="salary" text="SalaryNotFound" />	<input type="text" name="salary" value="1111">
	<br />
	<br/>
	
	<a href="?lang=ch">Chinese</a> <a href="?lang=fr">French</a> <a href="?lang=en">English</a>  
	
	
</body>
</html>