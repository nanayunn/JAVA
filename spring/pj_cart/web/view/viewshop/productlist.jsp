<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		
		
<c:forEach var="p"  items="${plist }">

<div class="col-sm-6 col-lg-4 mb-4" data-aos="fade-up">
	<div class="block-4 text-center border">
		<figure class="block-4-image">
			<a href="shop-single.mc?id=${p.product_id }"><img src="images/${p.img }.jpg"
				alt="Image placeholder" class="img-fluid"></a>
		</figure>
		<div class="block-4-text p-4">
			<h3>
				<a href="shop-single.mc?id=${p.product_id }">${p.name }</a>
			</h3>
			<p class="mb-0">${p.description }</p>
			<p class="text-primary font-weight-bold">$${p.price }</p>
		</div>
	</div>
</div>


</c:forEach>