<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<div>
<h1>pants List</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>name</th><th>price</th><th>amount</th><th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="u" items="${pantsList }">
				<tr><td>${u.id }</td><td>${u.name }</td><td>${u.price }</td><td>${u.amount }</td><td>
				<a href="main.small?view=pantsUpdate&id=${u.id }">수정</a>
				
				</td><td><a href="pantsDelete.small?id=${u.id }">삭제</a></td></tr>
			</c:forEach>
		</tbody>
	</table>
</div>