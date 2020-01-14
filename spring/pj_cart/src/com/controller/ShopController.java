package com.controller;

import java.util.ArrayList;
import java.util.Collections;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comparator.ComparatorNameAsc;
import com.comparator.ComparatorNameDesc;
import com.comparator.ComparatorPriceAsc;
import com.comparator.ComparatorPriceDesc;
import com.frame.Service;
import com.shop.ShopService;
import com.vo.ProductVO;

@Controller
public class ShopController {

	@Resource(name = "shopservice")
	Service<String, ProductVO> service;

//	ShopService sservice;
	ArrayList<ProductVO> list;

	ComparatorNameAsc compnameasc = new ComparatorNameAsc();
	ComparatorPriceAsc comppriceasc = new ComparatorPriceAsc();
	ComparatorNameDesc compnamedesc = new ComparatorNameDesc();
	ComparatorPriceDesc comppricedesc = new ComparatorPriceDesc();

	@RequestMapping("shop.mc")
	public ModelAndView shop() {
		ModelAndView mv = new ModelAndView();

		try {
			ArrayList<ProductVO> list = service.get();

			if (this.list == null) {
				this.list = list;
			}
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
			ArrayList<ProductVO> list =this.list;
			Collections.sort(list, compnameasc);
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

		try {
			ArrayList<ProductVO> list =this.list;
			Collections.sort(list, compnamedesc);
			mv.addObject("listprint", "productlist");
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
			ArrayList<ProductVO> list =this.list;
			Collections.sort(list, comppriceasc);
			mv.addObject("listprint", "productlist");
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
		try {
			ArrayList<ProductVO> list =this.list;
			Collections.sort(list, comppricedesc);
			mv.addObject("listprint", "productlist");
			mv.addObject("plist", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("viewshop/shop");
		return mv;
	}


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
	
	//shop-single/product_detail 항목 추가
	
	

	@RequestMapping("/shop-single.mc")
	public ModelAndView shop_single(ModelAndView mav,HttpServletRequest request) {


		System.out.println("test : " + request.getParameter("id"));
		int product_id = Integer.parseInt(request.getParameter("id"));
		//이제 여기서 selectAll에 where절에 email을 줘서 뽑아오면 되겠지.
		
		try {
			System.out.println(service.pick(product_id));

			ProductVO list = service.pick(product_id);
			System.out.println(list);
			mav.addObject("dbproduct",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mav.setViewName("viewdetail/shop-single");
		return mav;
	}
	
	
	
	
//	@RequestMapping("/shop-single.mc")
//	public ModelAndView shop_single(
//			HttpServletRequest request
//			) {
//		
//		ModelAndView mv = new ModelAndView();
//		
//		ProductVO dbproduct = null;
//		int product_id = Integer.parseInt(request.getParameter("id"));
//		try {
//			dbproduct = service.get("product_id");
//			if(dbproduct.getProduct_id()==product_id) {
//				mv.addObject("pro_detail", dbproduct);
//				
//			}else {
//				mv.setViewName("shop");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		mv.setViewName("shop-single");
//		return mv;
//	}
	
	
	
//	
}
