<%@ page import ="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	<hr>
	
	<h2 style="background-color: green">Data Transper form Controller-View by using Model Object</h2>
	
	<%  
		String name = (String)request.getAttribute("name"); 
		Integer id = (Integer)request.getAttribute("id");
		List<String> friends = (List<String>) request.getAttribute("f");
	%>
	
	
	<h1>My name is <%= name %></h1>
	<h1>And id is <%= id %></h1>
	<h1>friend list is <%= friends %></h1>
	
	<% 
		for(String s : friends){
			out.println(s);
		}
	%>
	
	<hr>
	
	<% for(String s: friends){ %>
	<h1><%=s%></h1> 
	<% } %>
	
</body>
</html>