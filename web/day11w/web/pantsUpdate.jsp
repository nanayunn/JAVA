<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<div>
	<h1>pants Update</h1>
	<form action="pantsUpdate.small">
	<%
		String id = request.getParameter("id");
		request.setAttribute("id", id);
	
	
	%>
		<input type="text" name ="id" value = ${id }>
		Name <input type="text" name="name" id="name" >
		price <input type="number" name="price" id="price" >
		amount <input type="number" name="amount" id="amount" >
		<input type = "submit" name = "update">
	</form>
	

</div>