package com.xt.spring.context.transaction.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {
private ApplicationContext ioc;
@Before
public void init(){
	ioc = new ClassPathXmlApplicationContext("config/spring-transaction/applicationContext-transaction-xml.xml");
}

@Test
public void test(){
	StuCardService scs = ioc.getBean("stuCardService", StuCardService.class);
	scs.transferAccount("1001", "1002", 10000);
}
}
