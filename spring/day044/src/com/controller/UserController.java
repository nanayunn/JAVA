package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Service;
import com.vo.UserVO;

@Controller
public class UserController {

	@Resource(name = "uservice")

	Service<String, UserVO> service;

	@RequestMapping("/uadd.mc")
	public ModelAndView add(ModelAndView mv) {
		mv.addObject("center", "user/add");
		mv.setViewName("main");
		return mv;
	}
	
	
	@RequestMapping("/uaddimpl.mc")
	public String addimpl(UserVO user) {
		try {
			service.register(user);
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return "redirect:ulist.mc";
	}
	
	
	@RequestMapping("/udel.mc")
	public String delete(String id) {
		try {
			service.remove(id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "redirect:ulist.mc";
	}
	
	@RequestMapping("/uupdate.mc")
	public ModelAndView update(ModelAndView mv,String id) {
		UserVO user = null;
		try {
			user =service.get(id);
			mv.addObject("uuser", user);
			mv.addObject("center", "user/update");
			mv.setViewName("main");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/uupdateimpl.mc")
	public String updateimpl(UserVO user) {
		try {
			service.modify(user);
		}catch(Exception e){
			e.printStackTrace();
		}
		String id = user.getId();
		return "redirect:udetail.mc?id="+id;
	}
	
	
	@RequestMapping("/udetail.mc")
	public ModelAndView detail(ModelAndView mv,String id) {
		UserVO user = null;
		try {
			user =service.get(id);
			mv.addObject("duser", user);
			mv.addObject("center", "user/detail");
			mv.setViewName("main");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping("/ulist.mc")
	public ModelAndView list(ModelAndView mv) {

		ArrayList<UserVO> list = null;
		try {
			list = service.get();
			mv.addObject("ulist", list);
			mv.addObject("center", "user/list");
			mv.setViewName("main");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mv;
	}
}
