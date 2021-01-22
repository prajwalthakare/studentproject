<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import ="java.util.ArrayList" %>
<%@page import ="com.java.entity.Project" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project list</title>
</head>
<body>
<% ArrayList<Project> prolist=(ArrayList<Project>)request.getAttribute("list"); %>

<%
String msg=(String)request.getAttribute("msg");

out.println(msg);
%>	
	<center>
	<h2>Project List</h2>

	<table border="1">
	
	
	<tr>
		<th>Id</th>
		<th>Project Name</th>
		<th>Student Name</th>
		
		
	</tr>
	<%
	
	for(Project user:prolist)
	{
	%>
	<tr>
		<td><%out.println(user.getId()); %></td>
		<td><%out.println(user.getProjectname()); %></td>
		<td><%out.println(user.getStudentname()); %></td>
		
		
		
		<td><a href="deleteproject?id=<%=user.getId() %>">Delete</a></td>
		<td><a href="updateproject?id=<%=user.getId() %>">Update</a></td>
	<td><a href="addproject?id=<%=user.getId() %>">Adduser</a></td>
	
	</tr>
	<%
	}
	%>
	</table>
	
	</center>
</body>
</html>