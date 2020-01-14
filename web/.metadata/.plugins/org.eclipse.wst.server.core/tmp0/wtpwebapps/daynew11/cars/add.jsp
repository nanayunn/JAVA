<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id = "center">
<h1>Cars Add Page</h1><br>
	<form action="cadd.small" method = "post">
		Name<input type="text" name="name" id="name"><br>
		Price<input type="number" name="price" id="price"><br>
		CC<input type="number" name="cc" id="cc"><br>
		<input type="submit" value="Add">
	</form>

</div>