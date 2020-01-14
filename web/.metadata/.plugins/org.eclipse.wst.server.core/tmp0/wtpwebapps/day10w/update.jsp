<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<title>Insert title here</title>
<style></style>
<script>
$(document).ready(function(){});
</script>
</head>
<body>
<h1>User Update Page</h1>
<form action ="updateimpl" method ="post" >
<input type = "hidden" name= "id" value = "${user.id }">
ID:${user.id }<br>
PWD<input type ="text" name = "pwd" value = "${user.pwd }"><br>
NAME<input type = "text" name = "name" value = "${user.name }"><br>
<input type ="submit" value = "update">
</form>
</body>
</html>