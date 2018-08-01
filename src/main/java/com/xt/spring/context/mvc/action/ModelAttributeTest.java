package com.xt.spring.context.mvc.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.google.gson.Gson;
import com.xt.spring.context.xml.entity.Student;
@Controller()
@SessionAttributes(value="student01",types={Student.class})
@RequestMapping("/modelAttribute")
public class ModelAttributeTest {
	
@ModelAttribute()
public void initTest(Map<String,Student> map){
	
	map.put("student", new Student("小明","男",34));
	
}
@RequestMapping("/sessionTest")
public String initSessionTest(Map<String,Student> map,HttpSession session){
	session.setAttribute("student01", new Student("小红","女",25));
	return "redirect:voidTest.action";
}
@RequestMapping("/voidTest")
public void forward(HttpServletResponse response,Student student,Student student01,HttpSession session) throws IOException{
	response.setContentType("text/html;charset=UTF-8");
	response.getWriter().write(new Gson().toJson(student));
	student01 = (Student)session.getAttribute("student01");
	response.getWriter().write(new Gson().toJson(student01));
	
}
}
