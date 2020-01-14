<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<style>
#uu {
	width: 300px;
	height: 200px;
	border: 2px solid red;
}
/*Global CSS Start**************************/
* {
	margin: 0;
	padding: 0;
}

a {
	text-decoration: none;
	color: black;
}

ul, ol {
	list-style: none;
}
/*Global CSS End***************************/
header {
	margin: 0 auto;
	width: 600px;
	height: 150px;
	background: gray;
	position: relative;
}
/*Header CSS Start***************************/
#top_nav {
	position: absolute;
	top: 0;
	right: 0;
}

#top_nav>li {
	float: left;
}

#top_nav>li>a {
	font-size: 0.8em;
	font-weight: bold;
	margin: 0 5px;
	float: left;
}

#top_nav>li>a:hover {
	color: white;
}

header>hgroup {
	position: absolute;
	top: 30px;
	left: 130px;
	text-align: center;
}

#main_nav>li {
	float: left;
}

#main_nav {
	position: absolute;
	bottom: 0;
	left: 100px;
}

#main_nav>li>a {
	font-size: 1.5em;
	font-weight: bold;
	margin: 0 10px;
	float: left;
}

#main_nav>li>a:hover {
	color: white;
}
/*Header CSS End***************************/

/*Nav CSS Start***************************/
nav {
	margin: 0 auto;
	width: 600px;
	height: 30px;
	background: pink;
}
/*Nav CSS End***************************/

/*Section CSS Start***************************/
section {
	margin: 0 auto;
	width: 600px;
	height: 350px;
	background: yellow;
}

/*Section CSS End***************************/

/*Footer CSS Start***************************/
footer {
	margin: 0 auto;
	width: 600px;
	height: 30px;
	background: black;
}
/*Footer CSS End***************************/
</style>
<script>
function display(data){
	var result=' ';
	$(data).each(function(idx,item){
		result += '<h3>';
		result += item.id +' '+item.pwd+' '
					+item.name;
		result += '</h3>';
		
	});
	$('#uu').html(result);
};
function getData(){
	$.ajax({
		url:'uu.mc',
		success:function(data){
			
		}
	})
};
	$(document).ready(function(){
		getData();
	})
</script>
</head>
<body>
	<header>
		<ul id="top_nav">
			<c:choose>
				<c:when test="${loginid ==null }">
					<li><a href="login.mc">LOGIN</a></li>
					<li><a href="#">REGISTER</a></li>
					<li><a href="#">ABOUT US</a></li>
				</c:when>
				<c:otherwise>
					<li>${loginid }님</li>
					<li><a href="logout.mc">LOGOUT</a></li>
					<li><a href="#">ABOUT US</a></li>
				</c:otherwise>
			</c:choose>

		</ul>
		<hgroup>
			<h1>Web Client App</h1>
			<h3>Pant& Shirts</h3>
		</hgroup>
		<ul id="main_nav">
			<li><a href="uadd.mc">ADD</a></li>
			<li><a href="ulist.mc">LIST</a></li>

		</ul>
	</header>
	<nav>
		<a href="index.html">HOME</a>
	</nav>
	<section>
		<c:choose>
			<c:when test="${center==null }">
				<jsp:include page="center.jsp" />
			</c:when>
			<c:otherwise>
				<jsp:include page="${center }.jsp" />
			</c:otherwise>

		</c:choose>
	</section>
	<footer></footer>
</body>
</html>