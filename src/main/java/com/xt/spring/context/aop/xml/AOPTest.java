package com.xt.spring.context.aop.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
	private ApplicationContext ioc;
	@Before
public void init(){
	ioc = new ClassPathXmlApplicationContext("config/spring-aop/spring-aop.xml");
}
	@Test
	public void test(){
		ActionInter ai = ioc.getBean("actionTarget", ActionInter.class);
		//ai.despoit("201601", 100.0);
		ai.pay("201601", 51.2);
	}
}
