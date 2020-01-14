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
<h1>User List</h1>
<%--JSTL --%>
<c:forEach var="u" items="${clist }">
	<h2>${u.id } ${u.name } ${u.pwd }</h2>
</c:forEach>
</body>
</html>