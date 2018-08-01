package com.xt.spring.context.mvc.ajax;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.xt.spring.context.anno.entity.Student;

@Controller()
@RequestMapping("/ajax")
public class AjaxTest {
@RequestMapping("/ajaxTest")
@ResponseBody()
public void ajaxTest(@RequestBody() Student student,HttpServletResponse response,HttpServletRequest resquest) throws IOException{
	resquest.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	System.out.println(student);
	response.getWriter().write(new Gson().toJson(student));;
}
@RequestMapping("/doSum")
/**
 * 注解表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中，
 * 一般在异步获取数据时使用，通常是在使用 @RequestMapping 后，
 * 返回值通常解析为跳转路径，加上 @Responsebody 后返回结果不会被解析为跳转路径，
 * 而是直接写入HTTP 响应正文中。 
 */
@ResponseBody()
public void doSum(@RequestBody() SumObject sumObject,HttpServletResponse response,HttpServletRequest resquest){
	try {
		resquest.setCharacterEncoding("UTF-8");
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	response.setContentType("text/html;charset=UTF-8");
	//int sum = Integer.parseInt(addend01)+Integer.parseInt(addend02);
	sumObject.setSum(sumObject.getAddend01()+sumObject.getAddend02());
	try {
		response.getWriter().write(String.valueOf(sumObject.getSum()));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
