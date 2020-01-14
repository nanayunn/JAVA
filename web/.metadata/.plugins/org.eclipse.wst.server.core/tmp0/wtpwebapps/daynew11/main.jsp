<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
/*Global CSS Start**************************/
*{
	margin:0;
	padding:0;
}
a{
	text-decoration:none;
	color:black;
	
}
ul, ol{
	list-style:none;
	
}
/*Global CSS End***************************/
header{
	margin:0 auto;
	width:600px;
	height:150px;
	background:red;
	position:relative;
	
}
/*Header CSS Start***************************/
#top_nav{
position:absolute;
top:0;
right:0;

}
#top_nav>li{
float:left;

}
#top_nav>li>a{
	font-size:0.8em;
	font-weight:bold;
	margin:0 5px;
	float:left;
}
#top_nav>li>a:hover{
	color:white;
}
header>hgroup{
	position:absolute;
	top:30px;
	left:130px;
	text-align:center;
}
#main_nav>li{
float:left;
}
#main_nav{
position:absolute;
bottom:0;
left:100px;
}
#main_nav>li>a{
	font-size:1.2em;
	font-weight:bold;
	margin:0 10px;
	float:left;
}
#main_nav>li>a:hover{
	color:white;
}
/*Header CSS End***************************/

/*Nav CSS Start***************************/
nav{
	margin:0 auto;
	width:600px;
	height:30px;
	background:pink;
	
}
/*Nav CSS End***************************/

/*Section CSS Start***************************/
section{

	margin:0 auto;
	width:600px;
	height:350px;
	background:yellow;
}
section>aside{
	float:left;
	
}
#left_aside{
	width:100px;
	height:inherit;
	background:blue;
	
}
#center_aside{
	width:400px;
	height:inherit;
	background:white;
	
}
#right_aside{
	width:100px;
	height:inherit;
	background:red;
	
}
/*Section CSS End***************************/

/*Footer CSS Start***************************/
footer{
	margin:0 auto;
	width:600px;
	height:30px;
	background:black;
	
}
/*Footer CSS End***************************/

#center{
	
	width:590px;
	height:340px;
	
}
#center>h1{
	text-align:center;
	
}
</style>
<script>

</script>
</head>
<body>
<header>
<ul id="top_nav">

<c:choose>
<c:when test="${loginuser ==null }">

<li><a href="main.small?view=login">LOGIN</a></li>
<li><a href="main.small?view=register">REGISTER</a></li>
<li><a href="#">ABOUT US</a></li>

</c:when>
<c:otherwise>

<li>${loginuser.name }님</li>
<li><a href="login.small">LOGOUT</a></li>
<li><a href="#">ABOUT US</a></li>

</c:otherwise>
</c:choose>

</ul>
<hgroup>
<h1>sMALL</h1>
<h3>Pant& Shirts</h3>
</hgroup>
<ul id="main_nav">
<li><a href="main.small?view=sadd">Shoes ADD</a></li>
<li><a href="slist.small">Shoes LIST</a></li>
<li><a href="main.small?view=cadd">Cars ADD</a></li>
<li><a href="clist.small">Cars LIST</a></li>
</ul>
</header>
<nav>
<c:choose>
<c:when test="${navi ==null }">
<a href="index.html">HOME</a>
</c:when>
<c:otherwise>
${navi }
</c:otherwise>
</c:choose>
</nav>
<section>
<c:choose>
<c:when test="${center == null }">
	<jsp:include page="mcenter.jsp"/>
</c:when>
<c:otherwise>
	<jsp:include page="${center }.jsp"/>
</c:otherwise>
</c:choose>

</section>
<footer></footer>
</body>
</html>