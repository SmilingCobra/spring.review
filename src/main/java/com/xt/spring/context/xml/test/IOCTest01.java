package com.xt.spring.context.xml.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xt.spring.context.xml.entity.College;
import com.xt.spring.context.xml.entity.Student;

public class IOCTest01 {
private ApplicationContext ioc;
@Before
public void init(){
	ioc = new ClassPathXmlApplicationContext("config/spring/applicationContext-xml.xml");
	
}
@Test
public void iocTest(){
	Student stu01= ioc.getBean("stuXml",Student.class);
	System.out.println(stu01);
	College coll = ioc.getBean("collXml",College.class);
	System.out.println(coll);
}
}
