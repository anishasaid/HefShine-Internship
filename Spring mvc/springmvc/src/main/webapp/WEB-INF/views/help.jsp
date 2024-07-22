<%@ page import ="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help page</title>
</head>
<body>
	
	<h1>This is help url</h1>
	<h1>if any query, feel free to contact us....</h1>
	<hr>
	
	<h2 style="background-color: green">Data Transper form Controller-View by using ModelAndView Object</h2>
	
	<% 
		String name =(String) request.getAttribute("name");
		Integer rollno = (Integer) request.getAttribute("rollno");
		String dob = (String) request.getAttribute("dob");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	
	<h1>name is : <%= name %></h1>
	<h1>Roll No. is : <%= rollno %></h1>	
	<h1>Date Of Birth is : <%= dob %></h1>		
	<h1>Local Date and Time : <%=time.toString()  %></h1>				
</body>
</html>