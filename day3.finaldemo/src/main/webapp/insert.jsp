<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>insert jsp</h1>
<form action="serv/dept" method="post">
Deptno : <input type="number" name="deptno" value="10" /><br/>
DName : <input type="text" name="dname" value="HR" /><br/>
Loc : <input type="text" name="loc" value="BLR" /><br/>
<input type="submit" value="Insert..." />
</form>
</body>
</html>