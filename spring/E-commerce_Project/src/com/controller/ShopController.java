package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.comparator.ComparatorName;
import com.comparator.ComparatorPrice;
import com.frame.ShopService;
import com.shop.ShopServiceImpl;
import com.vo.ProductVO;


@Controller
public class ShopController {

	@Resource(name = "shopservice")
	ShopService<String, ProductVO> service;
	

	ArrayList<ProductVO> list;
	
	ComparatorName compname = new ComparatorName();
	ComparatorPrice compprice = new ComparatorPrice();
	


	

	

	@RequestMapping("shop.mc")
	public ModelAndView shop() {
		ModelAndView mv = new ModelAndView();

		try {
			ArrayList<ProductVO> list = service.get();
			this.list = list;
			mv.addObject("plist", list);
			mv.addObject("listprint", "productlist");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("viewshop/shop");
		
		return mv;
	}

	@RequestMapping("ascname.mc")
	public ModelAndView ascname() {
		ModelAndView mv = new ModelAndView();

		try {

			Collections.sort(list, compname);
			mv.addObject("listprint", "productlist");
			mv.addObject("plist", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("descname.mc")
	public ModelAndView descname() {
		ModelAndView mv = new ModelAndView();

		ArrayList<ProductVO> list = null;
		try {
			list = service.getDescName();

			mv.addObject("plist", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("ascprice.mc")
	public ModelAndView ascprice() {
		ModelAndView mv = new ModelAndView();

		try {

			Collections.sort(list, compname);
			mv.addObject("plist", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("viewshop/shop");
		return mv;
	}

	@RequestMapping("descprice.mc")
	public ModelAndView descprice() {
		ModelAndView mv = new ModelAndView();

		ArrayList<ProductVO> list = null;
		try {
			list = service.getDescPrice();

			mv.addObject("plist", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("viewshop/shop");
		return mv;
	}
	
//	@RequestMapping("shop-single.mc")
//	public ModelAndView shop_single(ModelAndView mav) {
//				//ProductVO pro = null;
//				//mav.addObject("product", pro);
//				mav.addObject("center", "productdetail");
//				mav.setViewName("main");
//
//		mav.setViewName("shop-single");
//		
//		return mav;
//	}
	@RequestMapping("/shop-single.mc")
	public ModelAndView shop_single(
			HttpServletRequest request
			) {
		
		ModelAndView mv = new ModelAndView();
		
		ProductVO dbproduct = null;
		int product_id = Integer.parseInt(request.getParameter("id"));
		try {
			dbproduct = service.get("product_id");
			if(dbproduct.getProduct_id()==product_id) {
				mv.addObject("pro_detail", dbproduct);
				
			}else {
				mv.setViewName("shop");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.setViewName("shop-single");
		return mv;
	}

//	@RequestMapping("plist.mc")
//	public ModelAndView plist(ModelAndView mv) {
//		
//		ArrayList<ProductVO> list
//		= null;
//		try {
//			list = service.get();
//			mv.setViewName("viewshop/shop");
//			mv.addObject("plist", list);
//			mv.addObject("shop", "view/productlist");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return mv;
//	}

//	@RequestMapping("/productlist.mc")
//	@ResponseBody
//	public void plist(HttpServletResponse response) throws IOException {
//		response.setContentType("text/json;charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		ArrayList<ProductVO> list = null;
//		try {
//			list = service.get();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		JSONArray ja = new JSONArray();
//		for(ProductVO u:list) {
//			JSONObject jo = new JSONObject();
//			jo.put("name", u.getName());
//			
//			jo.put("price", u.getPrice());		
//			ja.add(jo);
//		}
//		out.print(ja.toJSONString());
//		out.close();
//	}
//	
}
