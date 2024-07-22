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

<!-- 	FIRST WAY
	<h1>Welcome, ${name}</h1>
	<h2>Your email address is ${email }</h2>
	<h3>don't tell anyone that i know your password is ${password }</h3>
-->

	<div class="container">	
		<h3 class="text-center">${head }</h3>
   		<p class="text-center">${desc }</p>
   	</div>
   	
   	<hr>
	<h1>Welcome, ${user.username}</h1>
	<h2>Your email address is ${user.email }</h2>
	<h3>don't tell anyone that i know your password is ${user.password }</h3>
	
</body>
</html>