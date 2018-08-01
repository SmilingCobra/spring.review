package com.xt.spring.context.anno.action;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xt.spring.context.anno.service.StuService;

public class StuAction {
	private ApplicationContext ioc;
@Before
public void init(){
	ioc = new ClassPathXmlApplicationContext("config/spring/applicationContext-anno.xml");
}
@Test
public void IOCTest(){
	StuService stuService = ioc.getBean("stuService",StuService.class);
	stuService.print();
}
}
