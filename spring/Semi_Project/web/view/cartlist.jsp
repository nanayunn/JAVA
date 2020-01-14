<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="site-section">
	<div class="container">
		<div class="row mb-5">
			<form class="col-md-12" method="post">
				<div class="site-blocks-table">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th class="product-thumbnail">Image</th>
								<th class="product-name">Product</th>
								<th class="product-price">Price</th>
								<th class="product-quantity">Quantity</th>
								<th class="product-total">Total</th>
								<th class="product-remove">Remove</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="p" items="${plist }">
								<tr>


									<td class="product-thumbnail"><img src="images/${p.img }"
										alt="Image" class="img-fluid"></td>
									<td class="product-name">
										<h2 class="h5 text-black">${p.name }</h2>
									</td>
									<td>$${p.price }</td>
									<td>
										<!-- ��ư�� ������ ���� �߰��ϴ� �κ� ���� -->
										<div class="input-group mb-3" style="max-width: 120px;">
											<div class="input-group-prepend">
												<button class="btn btn-outline-primary js-btn-minus"
													type="button">&minus;</button>
											</div>
											<input type="text" class="form-control text-center" value="1"
												placeholder="" aria-label="Example text with button addon"
												aria-describedby="button-addon1">
											<div class="input-group-append">
												<button class="btn btn-outline-primary js-btn-plus"
													type="button">&plus;</button>
											</div>
										</div>

									</td>

									<!-- ��ư�� ������ ���� �߰��ϴ� �κ� �� -->

									<td>���� X ����. ������ ���� ��ư�� ������ �Լ� ȣ���ؼ� ���������ҵ�.</td>

									<!--  x�� ������ cart ���̺��� �������ִ� ������ �ؾ���. delete. -->
									<!--  �ƴϸ� �ؿ� cart updat�� ������ �� �������� ���ΰ�ħ�Ǹ鼭 �ٲ����.. -->
									<td><a href="#" class="btn btn-primary btn-sm"onclick="window.location='cartdelete.mc?basket_id=${basket_id }'">X</a></td>
									<!-- "userDetail.mc?email=${email }"  -->
								</tr>

							</c:forEach>




						</tbody>
					</table>
				</div>
			</form>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="row mb-5">
					<div class="col-md-6 mb-3 mb-md-0">
						<!-- ��ư�� Ŭ���ϸ� �����ͺ��̽� update�ϰ� ���� �������� ���ƿ��ºκ� ����-->
						<!-- ����غ��ߵǴ°� �̿��� ���忡�� �򰥸� �� ����. -->
						<a href="cartupdate.mc"><button
								class="btn btn-primary btn-sm btn-block " onclick="window.location='cartupdate.mc'">Update Cart</button></a>

						<!-- ��ư�� Ŭ���ϸ� �����ͺ��̽� update�ϰ� ���� �������� ���ƿ��ºκ� ��-->

					</div>
					<div class="col-md-6">
						<!-- ��ư�� Ŭ���ϸ� �����ϴ� �������� �����̷�Ʈ�ϴ� �κ� ���� -->
						<a href="shop.mc"><button
								class="btn btn-outline-primary btn-sm btn-block" onclick="window.location='shop.mc'">Continue
								Shopping</button></a>
						<!-- ��ư�� Ŭ���ϸ� �����ϴ� �������� �����̷�Ʈ�ϴ� �κ� ���� -->
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<!--
													<label class="text-black h4" for="coupon">Coupon</label>
													<p>Enter your coupon code if you have one.</p>
													 -->
					</div>
					<div class="col-md-8 mb-3 mb-md-0">
						<!-- 
													<input type="text" class="form-control py-3" id="coupon"
														placeholder="Coupon Code">
														 -->
					</div>
					<div class="col-md-4">
						<!-- 
													<button class="btn btn-primary btn-sm">Apply
														Coupon</button>
														 -->
					</div>
				</div>
			</div>
			<div class="col-md-6 pl-5">
				<div class="row justify-content-end">
					<div class="col-md-7">
						<div class="row">
							<div class="col-md-12 text-right border-bottom mb-5">
								<h3 class="text-black h4 text-uppercase">Cart Totals</h3>
							</div>
						</div>
						<div class="row mb-3">
							<div class="col-md-6">
								<span class="text-black">Subtotal</span>
							</div>
							<div class="col-md-6 text-right">
								<strong class="text-black">$230.00</strong>
							</div>
						</div>
						<div class="row mb-5">
							<div class="col-md-6">
								<span class="text-black">Total</span>
							</div>
							<div class="col-md-6 text-right">
								<strong class="text-black">$230.00</strong>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<button class="btn btn-primary btn-lg py-3 btn-block"
									onclick="window.location='checkout.html'">Proceed To
									Checkout</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--  �����̳ʰ� ���������� -->
</div>