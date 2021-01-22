<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.java.entity.User" %>
     <%@ page import="java.util.List" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<% List<User> listuser=(List<User>)request.getAttribute("list");  %>
<body>
	<center>
	<form action="updateparticularuser">
	<%
	for(User user:listuser)
	{
	 %>
	<table border="1">
	<tr>
		<td>Enter Name:-</td>
		<td><input type="text" name="Studentname" value="<%out.println(user.getStudentname());%>"></td>
	</tr>
	<tr>
		<td>Enter DOB:-</td>
		<td><input type="text" name="StubDob" value="<%out.println(user.getStudDob());%>"></td>
	</tr>
	<tr>
		<td>Enter DOJ:-</td>
		<td><input type="text" name="StudDoj" value="<%out.println(user.getStudDoj());%>"></td>
	</tr>
	<tr>
		<td>Enter password:-</td>
		<td><input type="text" name="Password" value="<%out.println(user.getPassword());%>"></td>
	</tr>
	<tr>
		
		<td><input type="hidden" name="Id" value="<% out.println(user.getId());%>"></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="Submit"></td>
	</tr>
	</table>
	<%
	
	}
	%>
	</form>
	
	</center>
</body>
</html>