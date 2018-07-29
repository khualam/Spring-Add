<%@page import="demo.Dept"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List JSP</h1>
	<table border="1" >
	<thead><tr><td>Deptno</td><td>DName</td><td>Loc</td></tr></thead>
	<%
	List<Dept> list = (List<Dept>)request.getAttribute("dlist");
	out.println(list.size());
	
	for(int i = 0; i< list.size(); i++)
	{
		%>
		<tr><td><%=list.get(i).getDeptno() %></td><td><%= list.get(i).getDname()%></td><td><%=list.get(i).getLoc() %></td></tr>
		<%
	}
 %>
 </table>
</body>
</html>