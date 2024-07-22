<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service Page</title>
</head>
<body>
	<h1>This is Services url</h1>
	<h1>Find our services here</h1>
	<hr>
	
	<!-- This is 1 way to get and print data -->
	<% 
		String name1 = (String)request.getAttribute("name");
		Integer age = (Integer) request.getAttribute("age");
	%>

	<h1>name is : <%= name1 %></h1>
	<h1>age is : <%= age %></h1>
	<hr>
	
	<!-- 	2nd way - by using jsp Expression Langualge -->
	<h3>here i am trying to print data using jsp expression langualge</h3>
	<h1>Hello my name is ${name} and i'm ${age} years old</h1>
	${marks}
	
	
	<c:forEach var="item" items="${marks}">
		<h1>${item}</h1>
	</c:forEach>
	
</body>
</html>