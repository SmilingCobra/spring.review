package com.xt.spring.context.mvc.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.xt.spring.context.xml.entity.Student;

@Controller
public class HelloController {

	@RequestMapping("/sayhello")
	public ModelAndView sayHello(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		
		mv.addObject("userName", "小强");
		return mv;
	}
	@RequestMapping("/simpleWay")
	public String simpleWay(Map<String,String> map){
		map.put("userName", "小王");
		return "hello";
	}
	@RequestMapping("/voidTest")
	public void forward(HttpServletResponse response) throws IOException{
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().write("<p style='color:red'>红色</p><br>");
		response.getWriter().write(new Gson().toJson(new Student("小强","男",19)));
//		response.sendRedirect("userList");
	}
}
