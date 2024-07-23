<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Student Information</h2>
	<h3>Name : ${student.name}</h3>
	<h3>Email Id : ${student.email }</h3>
	<h3>Id : ${student.id }</h3>
	<h3>DOB : ${student.dob}</h3>
	<h3>Selected Courses : ${student.courses}</h3>
	<h3>Gender : ${student.gender}</h3>
	<h3>Type : ${student.type}</h3>
	<hr>
	<h3>Address Street is ${student.address.street}</h3>
	<h3>Address City is ${student.address.city}</h3>
</body>
</html>