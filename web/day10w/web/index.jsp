<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<style>

</style>
<script>
$(document).ready(function(){

});
</script>
</head>
<body>
<h1>Main1</h1>
<h3><a href="register.html">Register</a></h3>

<c:choose>
	<c:when test="${loginuser ==null }">
		<h3><a href="login.html">Login</a></h3>
	</c:when>
	<c:otherwise>
		<h3>${loginuser.name }</h3>
		<h3><a href="login">Logout</a></h3>
	</c:otherwise>
</c:choose>

<h3><a href="select">Select</a></h3>
</body>
</html>






