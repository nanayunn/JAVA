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
<h1>User Detail Page</h1>
<h3>ID : ${user.id }</h3>
<h3>PWD : ${user.pwd }</h3>
<h3>NAME : ${user.name }</h3>
<a href = "delete?id=${user.id }">DELETE</a>
<a href = "update?id=${user.id }">UPDATE</a>
<a href = "index.jsp">HOME</a>
</body>
</html>