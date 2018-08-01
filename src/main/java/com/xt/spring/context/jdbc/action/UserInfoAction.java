package com.xt.spring.context.jdbc.action;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xt.spring.context.jdbc.dao.UserDao;
import com.xt.spring.context.jdbc.dao.UserDaoJDBC;
import com.xt.spring.context.jdbc.entity.UserInfo;


public class UserInfoAction {
private ApplicationContext ioc;
@Before
public void init(){
	ioc= new ClassPathXmlApplicationContext("config/spring/applicationContextJDBC.xml");
}
@Test
public void IOCTest(){
	UserDao userDao = ioc.getBean("userDaoJDBC",UserDaoJDBC.class);
	UserInfo userInfo  = new UserInfo("小王","165",56.0);
	System.out.println(userDao.selectAllUserInfo());
	System.out.println(userDao.selectUserInfoById("102"));
	if(userDao.insertUserInfo(userInfo)>0){
		System.out.println("用户添加成功!!!!!");
	}
	if(userDao.deleteUserInfoByIds("165")>0){
		System.out.println("用户删除成功!!!!!");
	}else{
		System.out.println("查无此户");
	}
}
}
