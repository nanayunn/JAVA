package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.frame.Service;
import com.vo.ProductVO;

@Controller
public class MainController {
	@Resource(name = "shopservice")
	Service<String, ProductVO> service;

	@RequestMapping("main.mc")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("main");
		return mv;
	}
	
	
	@RequestMapping("about.mc")
	public ModelAndView about(ModelAndView mav) {
		mav.addObject("center", "about");
		mav.setViewName("main");
		return mav;
	}

	@RequestMapping("mainpage.mc")
	public ModelAndView sprinkle(ModelAndView mav,HttpServletRequest request) {

		int product_id = Integer.parseInt(request.getParameter("id"));
		  
		//이제 여기서 selectAll에 where절에 email을 줘서 뽑아오면 되겠지.
		
		try {

			ProductVO list = service.pick(product_id);
			mav.addObject("dbproduct",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mav.addObject("center", "mainpage");
		mav.setViewName("mainpage");
		return mav;
	}
	

}
