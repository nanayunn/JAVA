<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
<h1>Cars List</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>name</th><th>price</th><th>amount</th><th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="u" items="${clist }">
				<tr><td>${u.id }</td><td>${u.name }</td><td>${u.price }</td><td>${u.cc }</td><td>${u.regdate }</td><td>
				<a href="#">수정</a>
				
				</td><td><a href="#">삭제</a></td></tr>
			</c:forEach>
		</tbody>
	</table>
</div>