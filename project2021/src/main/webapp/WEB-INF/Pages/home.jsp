<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import ="java.util.ArrayList" %>
<%@page import ="com.java.entity.User" %>
<%@page import ="com.java.entity.Project" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student list</title>
</head>
<body>
<% ArrayList<User> userlist=(ArrayList<User>)request.getAttribute("list"); %>

<%
String msg=(String)request.getAttribute("msg");

out.println(msg);
%>	
	<center>
	<h2>Student List</h2>

	<table border="1">
	
	
	<tr>
		<th>Id</th>
		<th>Student Name</th>
		<th>Date of Birth</th>
		<th>Date of Joining</th>
		
	</tr>
	<%
	
	for(User user:userlist)
	{
	%>
	<tr>
		<td><%out.println(user.getId()); %></td>
		<td><%out.println(user.getStudentname()); %></td>
		<td><%out.println(user.getStudDob()); %></td>
		<td><%out.println(user.getStudDoj()); %></td>
		
		
		<td><a href="deleteuser?id=<%=user.getId() %>">Delete</a></td>
		<td><a href="update?id=<%=user.getId() %>">Update</a></td>
	<td><a href="adduser?id=<%=user.getId() %>">Adduser</a></td>
	<td><a href="project">project</a></td>
	
	</tr>
	<%
	}
	%>
	</table>
	
	</center>
</body>
</html>