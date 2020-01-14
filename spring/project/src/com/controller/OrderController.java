package com.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.CartService;
import com.frame.OrderService;
import com.frame.Service;
import com.vo.CartProductVO;
import com.vo.CartVO;
import com.vo.OrderDetailVO;
import com.vo.OrderListVO;
import com.vo.OrderVO;
import com.vo.ProductVO;
import com.vo.UserVO;

@Controller
public class OrderController {

	@Resource(name = "orderservice")
	OrderService service;
	
	@Resource(name = "cartservice")
	CartService<String, CartVO> cservice;
	
	@Resource(name = "shopservice")
	Service<String, ProductVO> sservice;
	
	@Resource(name="uservice")
	Service uservice;

	@RequestMapping("order.mc")
	public String order(HttpServletRequest request) {
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		int totalprice = Integer.parseInt(request.getParameter("totalprice"));
		String orderstat = "shipping";
		Date orderdate = new Date();
		OrderVO vo = new OrderVO(email, totalprice, address, orderstat);
		ArrayList<CartProductVO> list;
		try {
			int num = service.oinsert(vo);
			list = cservice.getAll(email);
			
			for(int i = 0; i < list.size(); i++) {
				String order_id = (String) service.getorderid();
				int product_id = list.get(i).getProduct_id();
				int count = list.get(i).getCount();
				OrderDetailVO od = new OrderDetailVO(order_id,product_id,count);
				service.registerdetail(od);
			}
			cservice.clear(vo.getEmail()); // 주문 완료시 그거 해당 카트 비워주는 역할.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redirect:cart.mc";

	}
	
	@RequestMapping("orderlist.mc")
	public ModelAndView orderlist(ModelAndView mav, HttpServletRequest request) {
		ArrayList<OrderVO> list;
		String email = request.getParameter("email");
		System.out.println("email : " + email);
		try {
			list = service.getAll(email);
			mav.addObject("olist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mav.addObject("center", "orderlist");
		mav.setViewName("main");
		return mav;
	}

	
	@RequestMapping("orderdetail.mc")
	public ModelAndView orderdetail(ModelAndView mav, HttpServletRequest request) {
		ArrayList<OrderListVO> list;
		String order_id = request.getParameter("order_id");
		OrderVO ov;
		ProductVO pv;
		UserVO uv;
		OrderDetailVO odv;
		
		try {
			list = service.selectdetail(order_id);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String email = request.getParameter("email");
		System.out.println("email : " + email);
		try {
			list = service.getAll(email);
			mav.addObject("olist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mav.addObject("center", "orderdetail");
		mav.setViewName("main");
		return mav;
	}
	
}
