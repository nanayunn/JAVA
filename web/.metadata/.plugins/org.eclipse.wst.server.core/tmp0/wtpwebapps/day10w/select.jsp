<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<style></style>
<script>
$(document).ready(function(){});
</script>
</head>
<body>
<h1>User List</h1>
<%-- JSTL --%>
<c:forEach var="u" items="${clist }">
<h2><a href = "get?id=${u.id }">${u.id }</a> ${u.name }</h2>
</c:forEach>
</body>
</html>





