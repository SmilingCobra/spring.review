package com.xt.spring.context.mvc.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExTestHandlerExceptionResolver implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		System.out.println("异常处理机制启动"+ex);
		ModelAndView mav = new ModelAndView("exception/error");
		mav.addObject("error", "对不起您访问的页面走丢了");
		return mav;
	}

}
