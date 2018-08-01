package com.xt.spring.context.xml.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xt.spring.context.xml.entity.Student;
//BeanFactory 当需要创建对象的时候才会创建对象
//ApplicationContext 当容器初始化完成之后对象就完成了实例化
public class IOCTest {
private ApplicationContext ioc;

@Before	
public void init(){
	System.out.println("---------------");
	//IOC容器的初始化
	ioc = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
	System.out.println("---------------");
}
@Test
public void iocTest(){
	Student stu = ioc.getBean(Student.class);
	Student stu01 = ioc.getBean(Student.class);
	System.out.println(stu.equals(stu01));
	System.out.println(stu);
	
}


}
