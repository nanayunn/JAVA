<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<div>
	<form action="pantsAdd.small" method = "post">
		ID <input type="text" name="id" id="id">
		Name<input type="text" name="name" id="name">
		Price<input type="number" name="price" id="price">
		Amount<input type="number" name="amount" id="amount">
		<input type="submit" value="Add">
	</form>
</div>